package SEM5;

public class FibbonacciLoop
{
    public static void main(String[] args)
    {
        int a=0, b=1, c=0;
        System.out.print(a + " " + b + " ");
        int n=10;
        for(int i=0; i<=n; i++)
        {
            c=a+b;
            System.out.print(c + " ");
            a=b;
            b=c;
        }
    }
}
