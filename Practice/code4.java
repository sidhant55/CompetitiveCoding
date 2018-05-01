import java.util.*;
public class code4
{
	public static void main(String args[])throws java.lang.Exception
	{
		Scanner in=new Scanner (System.in);
		int m=in.nextInt();
		int n=in.nextInt();
		int arr[]=new int [m];
		int brr[]=new int [m];
		int chk[]=new int [m];
		int sum=0;
		for (int i=0;i<m;i++)
		{
			arr[i]=in.nextInt();
			brr[i]=arr[i];
			sum=sum+arr[i];
		}
		int sum1=0;
		if (n>=sum)
		{
			System.out.println("Sorry, we can only supply "+(sum-1)+" eggs");
			//Arrays.sort(arr);
			Arrays.sort(brr);
			int flag=0,mon=0;
			flag=brr[0];
			for (int i=0;i<m;i++)
			{

				sum1+=arr[i];
				//System.out.println(sum1+" "+sum);
				if (arr[i]!=brr[0])
				System.out.println(arr[i]+"\t"+arr[i]+"\t"+0);
				else
					System.out.println(arr[i]+"\t"+(arr[i]-1)+"\t"+1);
			}
		}
		else
		{
			System.out.println("Thank you, your order for "+n+" eggs are accepted");
			Arrays.sort(brr);
			int flag=0,mon=0;
			for (int i=m-1;i>=0;i--)
			{

				sum1+=brr[i];
				if (sum1>n)
				{
					flag=brr[i];
					mon=sum1-n;
					break;
				}
			}
			sum1=0;
			int count=0;
			int flag2=0;
			for (int i=m-1;i>=0;i--)
			{

				sum1+=brr[i];
				if (sum1<=n && brr[i]==flag)
				{
					count++;
				}
			}
			System.out.println(flag+" "+count);
			for (int i=0;i<m;i++)
			{
				if (arr[i]>=flag && count>0)
				{
					System.out.println(arr[i]+"\t"+arr[i]+"\t"+0);
					if (arr[i]==flag)
						count--;
				}
				else if (arr[i]==flag && flag2==0)
				{
					flag2=1;
					System.out.println(arr[i]+"\t"+(arr[i]-mon)+"\t"+mon);
				}
				else
					System.out.println(arr[i]+"\t"+0+"\t"+(arr[i]));
			}
		}

	}
}