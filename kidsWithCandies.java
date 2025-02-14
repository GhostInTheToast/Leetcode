public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    int max = 0;
    ArrayList<Boolean> al = new ArrayList<Boolean>();
    for (int num: candies){
        if (num > max)
            max = num;            
    }
    for (int num: candies){
        if (num+extraCandies >= max) {
            al.add(true);
        }
        else {
            al.add(false);
        }
    }
    return al;
}
