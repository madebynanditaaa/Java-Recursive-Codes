package SEM5.RecursionHardProblems;

public class Pairs
{
    public static int pairing(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        //if i keep 1st guest single
        //call(n-1)
        int ways1=pairing(n-1);
        //and for 1 guest to choose a partner: he has (n-1) choices.
        //then call (n-1) because n and n-1 are already called and used up and multiplied
        int ways2=(n-1)*pairing(n-2);
        return ways1+ways2;
    }
    public static void main(String args [])
    {
        int n=4;
        System.out.println(pairing(n));
    }
}