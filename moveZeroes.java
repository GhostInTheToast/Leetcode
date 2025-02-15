public void moveZeroes(int[] nums) {
        int currentIndex = 0;

        for (int num: nums) {
            if (num != 0) {
                nums[currentIndex] = num;
                currentIndex++;
            }
        }

        while (currentIndex < nums.length) {
            nums[currentIndex] = 0;
            currentIndex++;
        }
    }
