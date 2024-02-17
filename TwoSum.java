import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int need;
        for (int i = 0; i < nums.length; i++) {
            need = target - nums[i];
            if (hm.containsKey(need))
                return new int[] {i,hm.get(need)};
            else
                hm.put(nums[i], i);
        }
        return new int[] {0,0};
    }

}