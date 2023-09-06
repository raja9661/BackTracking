
import java.util.Arrays;

public class PossiblePermutationOfString {
    public static String swap(String str,int i,int j)
    {
        char arr[]=str.toCharArray();
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return String.valueOf(arr);
    }
    static void PossibleCombinationOfString(String str,int s,int e)
    {
        if(s==e)
        {
            System.out.println(str);
        }
        else
        {
            for(int i=s;i<=e;i++)
            {
                str=swap(str,s,i);
                PossibleCombinationOfString(str, s+1, e);
                str=swap(str,s,i);
            }
        }
    }
    public static void main(String args[])
    {
        String str="ABC";
        int end=str.length()-1;
        PossibleCombinationOfString(str,0, end);

    }
}
