package SEM5;

public class MoveXatEndRecursion
{
    public static String moveX(String str, int len, int i, String c, String newStr)
    {
        if(i==len)
        {
            return newStr+c;
        }
        if(str.charAt(i)!='x')
        {
            newStr=newStr+str.charAt(i);
        }
        else//if str.charAt(i)==x
        {
            c=c+'x';
        }
        return moveX(str,len, i+1,c,newStr);   
    }
    public static void main(String arg[])
    {
        String str="xabcxxdefxgxh";
        
        System.out.println(str);
        System.out.println(moveX(str,str.length(),0,"",""));
    }
}
