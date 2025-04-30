
public class multiplication_of_a_number {
    public static void multiply(int n)
    {
        for(int i = 1; i <= 10 ; ++i)
        {
            System.out.println(n + " * " + i + " = " + n * i );
            
        }
    
    }
        public static void main(String args[])
        {
            int n = 5; // Number to be multiplied
            multiply(n); // Calling the method to print multiplication table
        }
    
    
}
