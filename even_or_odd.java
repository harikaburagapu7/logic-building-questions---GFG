// find the even or odd 
// input : 2 then out[ut true
// input : 5 then output false

public class even_or_odd
{
    public static boolean isEven (int n )
    {
        return (n % 2 == 0);
    }
        public static void main(String args[])
        {
        int n = 101;
        if ( isEven(n) == true)
        {
            System.out.println("true");
        }
        else 
        {
            System.out.println("false");
        }
        }
}