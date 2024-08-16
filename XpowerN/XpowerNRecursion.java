package SEM5;

public class XpowerNRecursion
{
    public static void XpowerN(int ans, int x, int n)
    {
        if(n==0)
        {
            System.out.println("2 raised to 5 is: " + ans);
            return;
        }
        ans=ans*x;
        XpowerN(ans,x,n-1);
        //System.out.println("2 raised to 5 is: " + ans);
    }
    
    public static void main(String args[])
    {
        int x=2;
        int n=5;
        XpowerN(1, x, n);
    }
}
