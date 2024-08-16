package SEM5;
import java.util.Scanner;
public class CheckArraySortedRecursion
{
    public static boolean checkSort(int arr[], int i)
    {
        if(i==(arr.length-1))
        {
            return true;
        }
        if(arr[i]<arr[i+1])
        {
            return checkSort(arr,i+1);
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0; i<5; i++)
        {
            arr[i]=sc.nextInt();
        }
        
        if(checkSort(arr,0))
        {
            System.out.println("Array is sorted!!");
        }
        else
        {
            System.out.println("Array is not sorted :((");
        }
    }
}