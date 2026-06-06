class reverse{
    public static void main(String[] args)
    {
        String str="Hello World";
        String[] sb=str.split(" ");
        //reverse of the string
        for(int i=sb.length-1;i>=0;i--){
            System.out.print(sb[i]+" ");
        }
    }
}