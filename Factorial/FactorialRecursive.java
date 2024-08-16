package SEM5;

public class FactorialRecursive
 {

    public static void factorial(int n, int fact)
    {
        if(n==1)
        {
            System.out.println("Factorial is" + fact);
            return;
        }
        factorial(n-1, fact*n);
    }
    public static void main(String []args)
    {
        //finding factorial of 1 to n;
        int n=5;
        factorial(n, 1);
    }
}
