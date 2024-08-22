package SEM5;
import java.util.HashSet;
//subsequence means every string has a choice to be included in the resultant string.
public class SubsequenceOfUniqueStringRecursion
{
    public static void subSequences(String str, int i, String newStr, HashSet<String> set)
    {
        if(i==str.length())
        {
            if(set.contains(newStr))
            {
                return;
            }
            else
            {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char currChar=str.charAt(i);
        //to be: i.e. to choose to get included in the resultant sequence
        subSequences(str, i+1, newStr+currChar, set);
        //or not
        subSequences(str, i+1, newStr, set);
    }
    public static void main(String arg [])
    {
        String str="aaa";
        HashSet<String> set = new HashSet<>();
        subSequences(str, 0, "",set);
    }
}
