package SEM5;

public class Occurence1LastRecursive
{
   public static void Occurence(String str,int len,int first, int last,char sc)
   {
       if(len==0)
       {
        if(str.charAt(len)==sc)
        {
            first=len;
        }
        return;
        }
        else
        {
       Occurence(str,len-1,first,last,sc);
       if(str.charAt(len)==sc)
       {
        if(last==-1)
        {
           last=len; 
        }
        else
        {
            first=len;
        }
        }
    }
   }
   public static void main(String arg [])
   {
    String str="mamypokopants";
    int len=str.length();
    char sc='a';
    int first=-1;
    int last=-1;
    Occurence(str,len,first,last,sc);
    }
}
