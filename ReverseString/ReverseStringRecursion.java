package SEM5;

public class ReverseStringRecursion
{
    public static void reverseString(String str,int len)
    {
        if(len==0)
        {
            System.out.print(str.charAt(len));
            return;
        }
        System.out.print(str.charAt(len));
        reverseString(str,len-1);
    }
    public static void main(String [] args)
    {
        String str="Hello";
        int len=str.length();
        len=len-1;
        reverseString(str, len);
    }
}
