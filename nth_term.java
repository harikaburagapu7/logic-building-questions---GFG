public class nth_term {
    public static void term(int a1, int a2, int n) {
        int d = a2 - a1; // Common difference
        int nthTerm = a1 + (n - 1) * d; // Formula for nth term of AP
        System.out.println("The " + n + "th term is: " + nthTerm); // Display the result
    }

    public static void main(String[] args) {
        int a1 = 2; // First term
        int a2 = 5; // Second term
        int n = 5;  // Term to find
        term(a1, a2, n); // Call the method
    }
}