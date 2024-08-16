package SEM5;

public class Occurence1LastLoop
{
   public static void main(String arg [])
   {
    String str="mamypokopants";
    int len=str.length();
    char sc='a';
    int pos=-1;
    for(int i=0; i<len; i++)
    {
        if(str.charAt(i)==sc)
        {
            pos=i;
            break;
        }
    }
    System.out.println("1st occurence of 'a' is at "+ pos);
    for(int i=len-1; i>=0; i--)
    {
        if(str.charAt(i)==sc)
        {
            pos=i;
            break;
        }
    }
    System.out.println("Last occurence of 'a' is at "+ pos);

    }
}
