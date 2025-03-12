package Arrays;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public static void main(String[] args){
        int n=2;
       // generate(0, 0, "",n);
        generateBrackets(0,0,"",n);
    }
    public static void generate(int openCount, int closeCount, String currentString, int maxPairs) {
        List<String> answers = new ArrayList<>();
        System.out.println("Initial openCount : "+openCount+" closeCount : " +closeCount+" CurrentString : "+currentString
                + " maxPairs : "+maxPairs);
        // Check if the current counts of open or close parentheses exceed maxPairs or if closeCount exceeds openCount
        if (openCount > maxPairs || closeCount > maxPairs || openCount < closeCount) {
            // The current combination is invalid, backtrack from this path
            return;
        }
        // Check if the current combination is a valid complete set of parentheses
        if (openCount == maxPairs && closeCount == maxPairs) {
            // Add the valid combination to the list of answers
            answers.add(currentString);
            System.out.println("pairs are ..."+answers.toString());
            return;
        }
        // Explore the possibility of adding an open parenthesis
        generate(openCount + 1, closeCount, currentString + "(",maxPairs);
        // Explore the possibility of adding a close parenthesis
        generate(openCount, closeCount + 1, currentString + ")",maxPairs);

    }

    public static void generateBrackets(int openCount,int closeCount,String currentString,int n){
        List<String> result = new  ArrayList<String>();
        if(openCount > n || closeCount > n || openCount < closeCount ){
            return;
        }
        if(openCount == n && closeCount == n){
            result.add(currentString);
            System.out.println("pairs are ..."+result.toString());
        }

        generateBrackets(openCount+1,closeCount,currentString+'(',n);
        generateBrackets(openCount,closeCount+1,currentString+')',n);

    }
}

