public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>(); // hm for hashmap
        List<Integer>[] b = new List[nums.length+1]; // b for bucket!

        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        for (int key : hm.keySet()) {
            if (b[hm.get(key)] == null)
                b[hm.get(key)] = new ArrayList<Integer>();
            b[hm.get(key)].add(key);
        }

        int[] ans = new int[k];
        int counter = 0;

        for (int pos = b.length - 1; pos >= 0 && counter < k; pos--) {
            if (b[pos] != null) {
                for (int num : b[pos]) {
                    ans[counter++] = num;
                }
            }
        }
        return ans;
    }
}
