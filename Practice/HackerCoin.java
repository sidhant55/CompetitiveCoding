import java.util.*;
 
class HackerCoin
{
    /* Driver program to test above functions */
    public static void main(String args[])
    {
        Scanner in=new Scanner (System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int arr[]=new int [m];
        int table[]=new int [n+1];
        for (int i=0;i<m;i++)
        {
            arr[i]=in.nextInt();
        }
        table[0]=1;
        for (int i=0;i<m;i++)
        {
            for (int j=arr[i];j<=n;j++)
            {
                table[j]=table[j-arr[i]]+table[j];
            }
        }
        // for (int i=0;i<=n;i++)
        System.out.println(table[n]);
    }
}