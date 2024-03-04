import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() < 2)
            return s.length();

        int l = 0;
        int ans = 0;

        Set<Character> set = new HashSet<>();
        for (int r = 0; r < s.length(); r++) {
            while (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            if ((r - l + 1) > ans)
                ans = (r-l+1);
        }
        return ans;
    }
}
