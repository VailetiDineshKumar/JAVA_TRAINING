public class filereader {
    public static void main(String[] args) {
        try {
            java.io.File file = new java.io.File("Java> \\Etnotech\\example.txt");
            java.util.Scanner reader = new java.util.Scanner(file);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        } catch (java.io.FileNotFoundException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
