class FindDifference {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> mySet1 = new HashSet<Integer>();
        HashSet<Integer> mySet2 = new HashSet<Integer>();
        
        for (int num: nums1) {
            mySet1.add(num);
        }
        for (int num: nums2) {
            mySet2.add(num);
        }

        List<List<Integer>> myList = new ArrayList<List<Integer>>();
        myList.add(new ArrayList<Integer>());
        myList.add(new ArrayList<Integer>());

        for (int num: mySet1) {
            if (!mySet2.contains(num)) {
                myList.get(0).add(num);
            }
        }
        for (int num: mySet2) {
            if (!mySet1.contains(num)) {
                myList.get(1).add(num);
            }
        }
        return myList;
    }
}
