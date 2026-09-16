
import java.util.*;

class LongestsubWoRep {

    public int Longest(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxlen = 0;
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            maxlen = Math.max(maxlen, right - left + 1);
        }
        return maxlen;
    }

    public static void main(String[] args) {

        LongestsubWoRep obj = new LongestsubWoRep();

        System.out.println(obj.Longest("abcabcbb"));
    }

}
