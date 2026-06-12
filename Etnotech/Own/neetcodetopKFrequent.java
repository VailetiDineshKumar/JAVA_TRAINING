package Own;
import java.util.*;
class neetcodetopKFrequent {
    public void topKFrequent(int[] nums, int k) {
        LinkedHashMap<Integer,Integer> arr = new LinkedHashMap<>();
        int[] arr1 = new int[k];
        for(int num : nums){
            int freq = arr.getOrDefault(num,0)+1;
            arr.put(num,freq);
        }
        //sort the map by value
        
        for(int i=arr.size()-k;i<arr.size();i++){
            //only key is required
                arr1[i-(arr.size()-k)]= (int) arr.keySet().toArray()[i];
        }
        System.out.println(Arrays.toString(arr1));
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,3,3};
        int k = 2;
        neetcodetopKFrequent obj = new neetcodetopKFrequent();
        obj.topKFrequent(nums,k);
    }
}
