package DUPE;
class p3 {
    public static int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int sum=0;
        if(landStartTime[0]<=waterStartTime[0]){
            sum+=landStartTime[0];
            sum+=landDuration[0];
        }
        else{
            sum+=waterStartTime[0];
            sum+=waterDuration[0];
        }
        if(landStartTime[0]>waterStartTime[0]){
            sum+=landStartTime[0];
            sum+=landDuration[0];
        }
        else{
            sum+=waterStartTime[0];
            sum+=waterDuration[0];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] landStartTime = {2,8};
        int[] landDuration = {4,1};
        int[] waterStartTime = {6};
        int[] waterDuration = {3};
        int result = earliestFinishTime(landStartTime, landDuration, waterStartTime, waterDuration);
        System.out.println("Earliest Finish Time: " + result);
    }   
}