package SEM5;
import java.util.Scanner;
public class CheckArraySortedLoop
{
    /*public static void checkSort()
    {
        
    }*/
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=5;
        int c=0;
        int arr[]=new int[n];
        System.out.println("Enter " + n + " numbers");
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        
        for(int i=0; i<arr.length-1; i++)
        {
            if(!(arr[i]<arr[i+1]))
            {
                System.out.println("Array is not sorted");
                c=1;
                break;
            }
        }
        
        if(c==0)
        {
            System.out.println("The array is sorted.");
        }
    }
}
