public class swap_two_numbers {
   
    public static void main(String args[])
    {
        int a = 2;
        int b = 4;
        int temp;
        
        System.out.println( " the value of a is "+a);
        System.out.println("The value of b is "+ b);

        temp = a;
        a = b;
        b = temp;
        System.out.println("the value of a is "+ a);
        System.out.println("The value of b is "+ b );
}
}
