package SEM5;

public class TowerOfHanoi
{
    public static void solve(int n, String src, String helper, String dest)
    {
        if(n==1)
        {
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        solve(n-1,src,dest,helper);
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
        solve(n-1,helper, src, dest);
    }
    public static void main(String arg [])
    {
        int n=3;
        String src="S";
        String helper="H";
        String dest="D";
        solve(n,src,helper,dest);
    }
}
