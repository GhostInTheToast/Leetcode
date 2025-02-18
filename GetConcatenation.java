class GetConcatenation {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];

        for (int j = 0; j < nums.length*2;j++) {
            ans[j] = nums[j%nums.length];
        }
        return ans;
    }
}

// lmao wat a problem
