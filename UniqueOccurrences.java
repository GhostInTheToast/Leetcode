class UniqueOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int num: arr) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int value: hm.values()) {
            hs.add(value);
        }
        return (hm.size() == hs.size());
    }
}
