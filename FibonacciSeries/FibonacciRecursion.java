package SEM5;

public class FibonacciRecursion
{
    public static void Fibonacci(int n, int a, int b)
    {
        if(n==0)
        {
            return;
        }
        int c;
        c=a+b;
        System.out.print(c + " ");
        Fibonacci(n-1,b,c);
    }
    
    public static void main(String [] args)
    {
        int n=10;
        int a=0;
        int b=1;
        System.out.print(a + " " + b + " ");
        Fibonacci(n,a,b);
    }
}
