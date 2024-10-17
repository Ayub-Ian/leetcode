import java.util.*;

class HappyNumbers {

    // Method to compute the sum of squares of the digits of a number
    public int squared(int n) {
        if (n < 10) {
            return n * n;
        } else {
            int rem = n % 10;
            int base = n / 10;
            return (rem * rem) + squared(base);
        }
    }

    // Method to determine if a number is a happy number
    public boolean solution(int n) {
        Set<Integer> set = new HashSet<>();

        while (!set.contains(n)) {
            set.add(n);
            n = squared(n);

            // If we reach 1, it's a happy number
            if (n == 1) {
                return true;
            }
        }

        // If we enter a cycle (already in the set), it's not a happy number
        return false;
    }

    // Main method for testing
    public static void main(String[] args) {
        HappyNumbers hn = new HappyNumbers();
        int number = 2;
        System.out.println(number + " is happy: " + hn.solution(number));
    }
}
