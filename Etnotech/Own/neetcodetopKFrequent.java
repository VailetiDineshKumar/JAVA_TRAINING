package Own;
import java.util.*;
class neetcodetopKFrequent {
    public void topKFrequent(int[] nums, int k) {
        LinkedHashMap<Integer,Integer> arr = new LinkedHashMap<>();
        LinkedList<Integer> arr1 = new LinkedList<>();
        for(int num : nums){
            int freq = arr.getOrDefault(num,0)+1;
            arr.put(num,freq);
        }
        //sort the map by using computator
        arr.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(e->arr1.add(e.getKey()));
        System.out.println(arr1);
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,3,3};
        int k = 2;
        neetcodetopKFrequent obj = new neetcodetopKFrequent();
        obj.topKFrequent(nums,k);
    }
}
