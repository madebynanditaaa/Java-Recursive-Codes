package SEM5.RecursionHardProblems;

public class PathsInMaze
{
    public static int maze(int i, int j, int n, int m)
    {
        if(i==n || j==m)
        {
            return 0;
        }
        if(i==n-1 && j==m-1)
        {
            return 1;
        }      
        //move downwards
        int downPaths = maze(i+1,j,m,n);
        //move right
        int rightPaths = maze(i,j+1,m,n);
        int totalPath=downPaths+rightPaths;
        return totalPath;
    }
    public static void main(String arg [])
    {
        int n=3;
        int m=3;
        System.out.println(maze(0,0,n,m));
    }
}
