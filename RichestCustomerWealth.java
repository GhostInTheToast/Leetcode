class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int[] arr : accounts) {
            int wealth = 0;
            for (int i : arr) {
                wealth += i;
            }
            if (wealth > maxWealth) {
                maxWealth = wealth;
            }
        }
        return maxWealth;
    }
}
