package Rough;

/* package codechef; // don't place package name! */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner (System.in);
        int g=sc.nextInt();
        for (int t=0;t<g;t++)
        {
            long sid=0;
            String str=sc.next();
            int n=str.length();
            int cnt1[]=new int [26];
            int cnt2[]=new int [26];
            long ans[][]=new long[n][26];
            for (int i=0;i<n;i++)
            {
                int alp=(int)str.charAt(i)-97;
                cnt2[alp]++;
            }

            int max=Integer.MIN_VALUE;

            int index=0,ch=0;

            for (int i=0;i<n;i++)
            {
                int alp=(int)str.charAt(i)-97;
                cnt2[alp]--;
                int sum1=0;
                int sum2=0;
                for (int j=0;j<alp;j++)
                {
                    sum1+=cnt1[j];
                }
                for (int j=alp+1;j<26;j++)
                {
                    sum2+=cnt2[j];
                }
                int sum=sum1+sum2;
                for (int k=0;k<26;k++)
                {
                    int s1=0;
                    int s2=0;
                    for (int j=0;j<k;j++)
                    {
                        s1+=cnt1[j];
                    }
                    for (int j=k+1;j<26;j++)
                    {
                        s2+=cnt2[j];
                    }
                    if (sum-(s1+s2+Math.abs(alp-k))>max)
                    {
                        max=sum-(s1+s2+Math.abs(alp-k));
                        index=i;
                        sid=Math.abs(alp-k);
                        ch=k;
                    }

                    //  System.out.print(i+" "+alp+" "+k+" "+min+" "+s1+" "+s2+" "+Math.abs(i-k)+"    ");
                }
//                  System.out.println(str.charAt(i)+""+sum+" ");
                cnt1[alp]++;
            }

//            System.out.println(max+" "+index+" "+ch);

            StringBuilder st=new StringBuilder();

            long val=0;


            for(int i=0;i<n;i++)
                Arrays.fill(ans[i],-1);

            for (int i=0;i<n;i++)
            {
                if (i==index)
                {
                    st.append((char)(ch+97));
                }
                else
                {
                    st.append(str.charAt(i));
                }
            }

            System.out.print(st+" ");

            for (int i=n-1;i>=0;i--)
            {
                int alp=((int)st.charAt(i))-97;
                int q=0;
                while(q<26)
                {
                    if (q>=alp)
                        try
                        {
                            ans[i][q] = ans[i + 1][q];
                        }
                        catch (java.lang.Exception e)
                        {
                            ans[i][q] = -1;
                        }
                    else
                        try
                        {
                            ans[i][q] = ans[i + 1][q] + 1;
                        }
                        catch(java.lang.Exception e)
                        {
                            ans[i][q]=0;
                        }
                    q++;
                }
                if (i!=n-1)
                    val = val + ans[i][alp] + 1;
            }

            System.out.println(val+sid);

        }
    }
}

