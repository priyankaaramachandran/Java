package Arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingChars {
    public static void main(String[] args){
        System.out.println(longestSubStringWithoutRepeatingChars("abcabcbb"));
    }

    public static int longestSubStringWithoutRepeatingChars(String s){
        if(s == null || s.isEmpty()) return 0; //if string is empty
        int maxLength = 0;
        int start = 0;
        int end = 0;
        Set<Character> st = new HashSet<Character>();
        while (end<s.length()){
            if(!st.contains(s.charAt(end))){
                st.add(s.charAt(end));
                end++;
                maxLength = Math.max(maxLength,end-start);
            }else {
                st.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }

        return maxLength;
    }
}
