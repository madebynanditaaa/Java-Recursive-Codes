package SEM5;

import java.util.Scanner;
public class MoveXatEndLoop
{    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        String str="tooxxthxbrusxh";
        String newStr="";
        int len=str.length();
        int c=0;
        for(int i=0; i<len; i++)
        {
            if(str.charAt(i)=='x')
            {
                c++;
            }
            else
            {
                newStr=newStr+str.charAt(i);
            }
        }
        for(int i=0; i<c; i++)
        {
            newStr=newStr+'x';
        }
        System.out.println(str);
        System.out.println(newStr);
    }
}
