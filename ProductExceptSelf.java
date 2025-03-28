class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];

        prefix[0] = nums[0];
        postfix[nums.length-1] = nums[nums.length-1];

        for (int i = 1; i < nums.length;i++) {
            prefix[i] = nums[i] * prefix[i-1];
        }
        for (int i = nums.length-2; i >= 0;i--) {
            postfix[i] = nums[i] * postfix[i+1];
        }

        for (int i = 1; i < nums.length-1;i++) {
            nums[i] = prefix[i-1] * postfix[i+1];
        }
        nums[0] = postfix[1];
        nums[nums.length-1] = prefix[nums.length-2];
        return nums;
    }
}

//very messy etc btw, like how im doing lines 6, 7, 19 and 20. also im sure that once 
 //   i fix to handle those lines automatically in a loop, then the first 2 forloops can be combined into 1 kinda in a way
