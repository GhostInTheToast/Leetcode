public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hmap.containsKey(target - nums[i])) 
                return new int[] {i, hmap.get(target - nums[i])};
            hmap.put(nums[i], i);
        }
        return new int[] {0,0};
    }
}
