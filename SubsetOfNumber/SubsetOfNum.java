package SEM5.RecursionHardProblems;
import java.util.*;
public class SubsetOfNum
{
    public static void AnsSubset(int n, ArrayList<Integer> subset)
    {
        if(n==0)
        {
            print(subset);
            return;
        }
        //add honga digit in the subset
        subset.add(n);
        AnsSubset(n-1,subset);
        
        //add nahi hoga
        //delete the number cause we have already added it before:
        subset.remove(subset.size()-1);
        AnsSubset(n-1, subset);
    }
    public static void print(ArrayList<Integer> subset)
    {
        for(int i=0; i<subset.size(); i++)
        {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }
    public static void main(String args [])
    {
        int n=3;
        ArrayList<Integer> subset = new ArrayList<>();
        AnsSubset(n, subset);
    }
}
