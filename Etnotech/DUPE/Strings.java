package DUPE;
public class Strings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + " " + str2; // Concatenation
        System.out.println("Concatenated String: " + str3);

        String upperStr = str3.toUpperCase(); // Convert to uppercase
        System.out.println("Uppercase String: " + upperStr);

        String lowerStr = str3.toLowerCase(); // Convert to lowercase
        System.out.println("Lowercase String: " + lowerStr);

        int length = str3.length(); // Get length of the string
        System.out.println("Length of the string: " + length);

        char charAtIndex5 = str3.charAt(5); // Get character at index 5
        System.out.println("Character at index 5: " + charAtIndex5);

        boolean containsHello = str3.contains("Hello"); // Check if it contains "Hello"
        System.out.println("Contains 'Hello': " + containsHello);

        String replacedStr = str3.replace("World", "Java"); // Replace "World" with "Java"
        System.out.println("Replaced String: " + replacedStr);
    }
}
