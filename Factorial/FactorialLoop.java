package SEM5;

public class FactorialLoop
{
    public static void main(String args [])
    {
        int n=5;
        int fact=1;
        for(int i=2; i<=n; i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial is: " + fact);
    }
}
