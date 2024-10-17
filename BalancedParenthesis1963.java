import java.util.*;

public class BalancedParenthesis1963 {
    // This solution uses stack making it not memory efficient 
    
    public int solution(String s) {
        Stack<Character> unbalanced = new Stack<Character>();
        char[] charArr = s.toCharArray();

        for (char c : charArr) {
            if (c == '[') {
                unbalanced.push(c);
            } else if (!unbalanced.empty() && unbalanced.peek() == '[') {
                unbalanced.pop();
            } else {
                unbalanced.push(c);
            }
        }

        int pairs = unbalanced.size() / 2;
        int swaps = (int)Math.ceil(pairs / 2.0);

        return swaps;
    }

    public static void main(String[] args) {
        BalancedParenthesis1963 bp = new BalancedParenthesis1963();
        String s = "]]][[[";
        System.out.println(bp.solution(s));

    }
}