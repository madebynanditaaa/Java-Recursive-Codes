package SEM5.RecursionHardProblems;

public class AllPermutations
{
    public static void perm(String str,String perm)
    {
        if(str.length()==0)
        {
            System.out.println(perm);
        }
        for(int i=0; i<str.length(); i++)
        {
            char ch=str.charAt(i);
            String ans=str.substring(0,i)+str.substring(i+1);
            perm(ans,perm+ch);
        }
    }
    public static void main(String args [])
    {
        String str="abc";
        perm(str,"");
    }
}
