package Arrays;

import java.util.ArrayList;
import java.util.List;
import  java.util.Arrays;

public class PascalTriangle {
    public static void main(String[] args){
        System.out.println(generate(3).toString());
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < numRows; ++i) {
            Integer[] temp = new Integer[i + 1];
            Arrays.fill(temp, 1);
            ans.add(Arrays.asList(temp));
        }
        for (int i = 2; i < numRows; ++i)
            for (int j = 1; j < ans.get(i).size() - 1; ++j)
                ans.get(i).set(j, ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));



        return ans;
    }
}
