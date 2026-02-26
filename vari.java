class vari{
    static int c=30;
    public static void main(String[] args) {
        int a=10;//local variable
        int b=20;
        //static variable
        System.out.println("Value of a(local variable): " + a);
        System.out.println("Value of b(local variable): " + b);
        System.out.println("Value of c(global variable): " + c);
    }
}