import java.util.*;
class chess
{
	public static void main (String args[])
	{
		Scanner in=new Scanner (System.in);
		int a=in.nextInt();
		int arr[]=new int  [2*a];
		for (int i=0;i<(2*a);i++)
			arr[i]=in.nextInt();
		Arrays.sort(arr);
		if (arr[a]!=arr[a-1])
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}