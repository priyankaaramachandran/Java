package Arrays;

import java.util.*;

public class Anagrams {
    public static void main(String[] args){

        //Given an array of strings strs, group the anagrams together. You can return the answer in any order.
        //Example 1:
        //Input: strs = ["eat","tea","tan","ate","nat","bat"]
        //Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
        //Example 2: Input: strs = [""] ==> Output: [[""]]
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        //String[] strs = {};
        System.out.println(groupAnagrams(strs));
    }
    public static List<List<String>> groupAnagrams(String[] str) {
        if (str.length == 0) return new ArrayList<>();
        Map<String, List> map = new HashMap<>();
        for (String s : str) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);
            if (!map.containsKey(key)) map.put(key, new ArrayList());
            map.get(key).add(s);
        }
        return new ArrayList(map.values());
    }
}
