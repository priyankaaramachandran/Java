package Arrays;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args){
        String[] input= {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(input).toString());

    }
    public static List<List<String>> groupAnagrams(String[] str){
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s: str){
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String sortedKey = String.valueOf(charArr);
            if(!map.containsKey(sortedKey))
                map.put(sortedKey,new ArrayList<>());
            map.get(sortedKey).add(s);
        }
    return new ArrayList<>(map.values());
    }
}
