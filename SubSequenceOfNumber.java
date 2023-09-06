import java.util.*;
public class SubSequenceOfNumber {
    static void  SubSequence(int arr[],int index,ArrayList<Integer>temparr)
    {
        if(index==arr.length)
        {
            if(temparr.size()>0)
            {
                System.out.println(temparr);
            }
            return;
        }
        //include
        SubSequence(arr, index+1, temparr);
        temparr.add(arr[index]);
        //not include
        SubSequence(arr, index+1, temparr);
        //remove
        temparr.remove(temparr.size()-1);

    }
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        int arr[]={1,2,3};
        System.out.println(Arrays.toString(arr));
        SubSequence(arr,0,new ArrayList<>());
    } 
}
