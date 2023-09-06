import java.util.*;
class TilingProblem
{
    static int NoOfWayOfTiling(int n)
    {
        if(n<=3)
        {
            return n;
        }
        return NoOfWayOfTiling(n-1)+NoOfWayOfTiling(n-2);
    }
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=scn.nextInt();
        int totalWays=NoOfWayOfTiling(n);
        System.out.println(totalWays);
    }
}