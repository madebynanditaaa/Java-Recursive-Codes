package SEM5;

public class XpowerNloop
{
    public static void main(String arg[])
    {
        int x=2;
        int n=5;
        int ans=1;
        for(int i=1; i<=n; i++)
        {
            ans=ans*x;//2*2*2*2*2            
        }
        System.out.println("2 raised to 5 is " + ans);
    }
}
