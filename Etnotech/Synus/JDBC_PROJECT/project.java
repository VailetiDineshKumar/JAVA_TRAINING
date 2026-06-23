package Synus.JDBC_PROJECT;
import java.sql.*;
import java.util.Scanner;

public class project {

    static final String URL =
            "jdbc:mysql://localhost:3306/student_db";
    static final String USER = "root";
    static final String PASSWORD = "Chinnu@2006";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void addStudent(Scanner sc) {

        try {
            Connection con = getConnection();

            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();

            String sql =
                    "INSERT INTO students VALUES(?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, marks);

            int rows = ps.executeUpdate();

            System.out.println(rows +
                    " Student Added Successfully");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void displayStudents() {

        try {
            Connection con = getConnection();

            String sql =
                    "SELECT * FROM students";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ResultSet rs =
                    ps.executeQuery();

            System.out.println(
                    "\nID\tNAME\tMARKS");

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id")
                                + "\t"
                                + rs.getString("name")
                                + "\t"
                                + rs.getInt("marks")
                );
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void searchStudent(
            Scanner sc) {

        try {

            Connection con =
                    getConnection();

            System.out.print(
                    "Enter Student ID: ");

            int id =
                    sc.nextInt();

            String sql =
                    "SELECT * FROM students WHERE id=?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet rs =
                    ps.executeQuery();

            if (rs.next()) {

                System.out.println(
                        "ID : " +
                                rs.getInt("id"));

                System.out.println(
                        "Name : " +
                                rs.getString("name"));

                System.out.println(
                        "Marks : " +
                                rs.getInt("marks"));
            } else {

                System.out.println(
                        "Student Not Found");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void updateStudent(
            Scanner sc) {

        try {

            Connection con =
                    getConnection();

            System.out.print(
                    "Enter Student ID: ");

            int id =
                    sc.nextInt();

            System.out.print(
                    "Enter New Marks: ");

            int marks =
                    sc.nextInt();

            String sql =
                    "UPDATE students SET marks=? WHERE id=?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, marks);
            ps.setInt(2, id);

            int rows =
                    ps.executeUpdate();

            System.out.println(
                    rows +
                            " Student Updated");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteStudent(
            Scanner sc) {

        try {

            Connection con =
                    getConnection();

            System.out.print(
                    "Enter Student ID: ");

            int id =
                    sc.nextInt();

            String sql =
                    "DELETE FROM students WHERE id=?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, id);

            int rows =
                    ps.executeUpdate();

            System.out.println(
                    rows +
                            " Student Deleted");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println(
                    "\n===== STUDENT MANAGEMENT SYSTEM =====");

            System.out.println(
                    "1. Add Student");
            System.out.println(
                    "2. Display Students");
            System.out.println(
                    "3. Search Student");
            System.out.println(
                    "4. Update Student");
            System.out.println(
                    "5. Delete Student");
            System.out.println(
                    "6. Exit");

            System.out.print(
                    "Enter Choice: ");

            int choice =
                    sc.nextInt();

            switch (choice) {

                case 1:
                    addStudent(sc);
                    break;

                case 2:
                    displayStudents();
                    break;

                case 3:
                    searchStudent(sc);
                    break;

                case 4:
                    updateStudent(sc);
                    break;

                case 5:
                    deleteStudent(sc);
                    break;

                case 6:
                    System.exit(0);

                default:
                    System.out.println(
                            "Invalid Choice");
            }
        }
    }
}