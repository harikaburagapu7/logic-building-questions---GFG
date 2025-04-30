public class sum_of_natural_numbers {
    public static int natural(int n) {   // 1. return type is int
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;              // 2. keep updating sum
        }
        return sum;                     // 3. return only after loop completes
    }

    public static void main(String args[]) {
        int n = 5;
        System.out.println("The sum of first " + n + " natural numbers is: " + natural(n));
    }
}
