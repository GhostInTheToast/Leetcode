class ScoreOfString {
    public int scoreOfString(String s) {
        int ans = 0;
        for (int j = 0; j < s.length()-1;j++) {
            ans += Math.abs(s.charAt(j)-s.charAt(j+1));
        }
        return ans;
    }
}
