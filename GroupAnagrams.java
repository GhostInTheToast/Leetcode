import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hm = new HashMap<String, List<String>>();

        for (String str : strs) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String ss = new String(ch);

            hm.putIfAbsent(ss, new ArrayList<>());
            hm.get(ss).add(str);
        }
        return new ArrayList<>(hm.values());
    }
}
