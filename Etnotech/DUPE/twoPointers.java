package DUPE;
public class twoPointers {
    public static void main(String[] args){
        int[]  arr= {1,2,3,4,5,6,7,8,9,10};
        int front=0;
        int end=arr.length-1;
        while(front<end){
            if(arr[front]%2!=0 && arr[end]%2==0){
                int temp=arr[front];
                arr[front]=arr[end];
                arr[end]=temp;
                front++;
                end--;
            }
            else if(arr[front]%2==0){
                front++;
            }
            else{
                end--;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
}
}
