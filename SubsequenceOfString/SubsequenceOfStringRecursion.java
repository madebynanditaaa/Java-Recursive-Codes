package SEM5;
//subsequence means every string has a choice to be included in the resultant string.
public class SubsequenceOfStringRecursion
{
    public static void subSequences(String str, int i, String newStr)
    {
        if(i==str.length())
        {
            System.out.println(newStr);
            return;
        }
        char currChar=str.charAt(i);
        //to be: i.e. to choose to get included in the resultant sequence
        subSequences(str, i+1, newStr+currChar);
        //or not
        subSequences(str, i+1, newStr);
    }
    public static void main(String arg [])
    {
        String str="abc";
        subSequences(str, 0, "");
    }
}
