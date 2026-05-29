class ReverseofInteger {
    public static void main(String[] args) {
        int num = 10; // Example integer
        while (num != 0) {
           System.out.print(num % 10);
            num /= 10;
        };
    }
}