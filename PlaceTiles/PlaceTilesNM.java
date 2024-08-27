package SEM5.RecursionHardProblems;

public class PlaceTilesNM
{
    public static int place(int n, int m)
    {
        if(n==m)
        {
            return 2;
        }
        if(n<m)
        {
            return 1;
        }
        //vertically place:
        int vertical=place(n-m,m);
        //horizontally place
        int horizontal=place(n-1,m);
        
        return vertical+horizontal;
    }
    public static void main(String args [])
    {
        int n=4;
        int m=3;        
        int x=place(n, m);
        System.out.println(x);
    }
}
