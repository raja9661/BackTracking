import java.util.*;
public class SwapZeroToLast 
{
  public static void  SwapZero(int arr[])
  {
    int j=0;
    while(j<arr.length)
    {
    for(int i=0;i<arr.length-1;i++)
    {
        if(arr[i]==0)
        {
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }

    }
    j++;
}
    for(int i=0;i<=arr.length;i++)
    {
        System.out.println(arr[i]);
    }
  }
public static void main(String args[])
{
    Scanner scn=new Scanner(System.in);
    System.out.println("enter the size of array");
    int size=scn.nextInt();
    int arr[]=new int[size];
    System.out.println("enter the element of array:");
    for(int i=0;i<arr.length;i++)
    {
        arr[i]=scn.nextInt();
    }
    SwapZero(arr);

}
}
