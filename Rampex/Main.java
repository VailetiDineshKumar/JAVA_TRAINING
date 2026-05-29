class construt
    {
        construt(){
            System.out.println("Constructor called1");
        }
        construt(int a){
            System.out.println("Constructor called2 with value: " + a);
        }   
        construt(String s){
            System.out.println("Constructor called3 with value: " + s);
        }
        construt(int a, String s){
            System.out.println("Constructor called4 with values: " + a + " and " + s);
        }
    }
    class Main
{
    
    public static void main(String[] args)
    {
        System.out.println("Hello, World!");
        construt obj1 = new construt();
        construt obj2 = new construt(10);
        construt obj3 = new construt("Test");
        construt obj4 = new construt(20, "Example");
    }
}   