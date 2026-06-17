package DUPE;

import java.util.ArrayList;
import java.util.Scanner;

class Car {
    private int carId;
    private String carName;
    private double rentPerDay;
    private boolean available;

    public Car(int carId, String carName, double rentPerDay) {
        this.carId = carId;
        this.carName = carName;
        this.rentPerDay = rentPerDay;
        this.available = true;
    }

    public int getCarId() {
        return carId;
    }

    public String getCarName() {
        return carName;
    }

    public double getRentPerDay() {
        return rentPerDay;
    }

    public boolean isAvailable() {
        return available;
    }

    public void rentCar() {
        available = false;
    }
}

class Customer {
    private String name;
    private boolean student;
    private String studentId;

    public Customer(String name, boolean student, String studentId) {
        this.name = name;
        this.student = student;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public boolean isStudent() {
        return student;
    }

    public String getStudentId() {
        return studentId;
    }
}

class Bill {

    private static final double STUDENT_DISCOUNT = 0.15;

    public static void generateBill(Customer customer,
                                    Car car,
                                    int days) {

        double totalAmount = car.getRentPerDay() * days;
        double discount = 0;

        if (customer.isStudent()) {
            discount = totalAmount * STUDENT_DISCOUNT;
        }

        double finalAmount = totalAmount - discount;

        System.out.println("\n=================================");
        System.out.println("          RENTAL BILL");
        System.out.println("=================================");
        System.out.println("Customer Name : " + customer.getName());
        System.out.println("Car Name      : " + car.getCarName());
        System.out.println("Days Rented   : " + days);
        System.out.println("Rent Per Day  : ₹" + car.getRentPerDay());
        System.out.println("Total Amount  : ₹" + totalAmount);

        if (customer.isStudent()) {
            System.out.println("Student ID    : " + customer.getStudentId());
            System.out.println("Discount (15%): ₹" + discount);
        }

        System.out.println("---------------------------------");
        System.out.println("Final Amount  : ₹" + finalAmount);
        System.out.println("=================================");
    }
}

public class CarRentalService {

    static ArrayList<Car> cars = new ArrayList<>();

    public static void addCars() {
        cars.add(new Car(101, "Swift", 1500));
        cars.add(new Car(102, "Baleno", 1800));
        cars.add(new Car(103, "Creta", 2500));
        cars.add(new Car(104, "Venue", 2200));
        cars.add(new Car(105, "i20", 1700));
    }

    public static void viewAvailableCars() {

        System.out.println("\n===== AVAILABLE CARS =====");

        boolean found = false;

        for (Car car : cars) {

            if (car.isAvailable()) {

                System.out.println(
                        "ID: " + car.getCarId()
                                + " | Name: " + car.getCarName()
                                + " | Rent/Day: ₹" + car.getRentPerDay());

                found = true;
            }
        }

        if (!found) {
            System.out.println("No Cars Available.");
        }
    }

    public static Car findCar(int id) {

        for (Car car : cars) {

            if (car.getCarId() == id &&
                    car.isAvailable()) {

                return car;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        addCars();

        while (true) {

            System.out.println("\n=================================");
            System.out.println("      CAR RENTAL SERVICE");
            System.out.println("=================================");
            System.out.println("1. View Available Cars");
            System.out.println("2. Rent a Car");
            System.out.println("3. Exit System");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    viewAvailableCars();
                    break;

                case 2:

                    viewAvailableCars();

                    System.out.print("\nEnter Car ID: ");
                    int carId = sc.nextInt();
                    sc.nextLine();

                    Car selectedCar = findCar(carId);

                    if (selectedCar == null) {
                        System.out.println("Car Not Available!");
                        break;
                    }

                    System.out.print("Enter Customer Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Number of Rental Days: ");
                    int days = sc.nextInt();

                    System.out.print("Are you a Student? (Y/N): ");
                    char answer = sc.next().charAt(0);

                    boolean isStudent =
                            (answer == 'Y' || answer == 'y');

                    String studentId = "";

                    if (isStudent) {

                        System.out.print("Enter Student ID: ");
                        studentId = sc.next();
                    }

                    Customer customer =
                            new Customer(name,
                                    isStudent,
                                    studentId);

                    selectedCar.rentCar();

                    Bill.generateBill(customer,
                            selectedCar,
                            days);

                    System.out.println("\nCar Rented Successfully!");
                    break;

                case 3:

                    System.out.println("Thank You For Using Our Service!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}