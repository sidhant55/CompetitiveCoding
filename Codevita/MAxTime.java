package Codevita;

import java.util.*;

public class MAxTime {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String x=in.next();
        String temp[]=x.split("\\s*,\\s*");

        int flag=0;
        int max1=0;
        int max2=0;
        int max3=0;

        for (int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                for (int k=0;k<9;k++)
                {
                    for(int l=0;l<9;l++)
                    {
                        for (int m=0;m<9;m++)
                        {
                            for(int n=0;n<9;n++)
                            {
                                if (i!=j && i!=k && i!=l && i!=m && i!=n &&
                                j!=i && j!=k && j!=l && j!=m && j!=n &&
                                        k!=j && i!=k && k!=l && k!=m && k!=n &&
                                        l!=j && l!=k && i!=l && l!=m && l!=n &&
                                        m!=j && m!=k && m!=l && i!=m && m!=n &&
                                        n!=j && n!=k && n!=l && n!=m && i!=n)
                                {
                                    int hr=Integer.parseInt(temp[i]+temp[j]);
                                    int min=Integer.parseInt(temp[k]+temp[l]);
                                    int sec=Integer.parseInt(temp[m]+temp[n]);
                                    if(hr==24 && min==0 && sec==0)
                                    {
                                        flag=1;
                                        max1=24;
                                        max2=0;
                                        max3=0;

                                    }
                                    else if(hr<24 && min<60 && sec<60)
                                    {
                                        if(hr>max1)
                                        {
                                            flag=1;
                                            //System.out.println(1+" "+max3+" "+max2);
                                            max1=hr;
                                            max2=min;
                                            max3=sec;
                                        }
                                        else if(hr==max1 && min>max2)
                                        {
                                            flag=1;
                                            //System.out.println(2+" "+max3+" "+max2);
                                            max2=min;
                                            max3=sec;
                                        }
                                        else if(hr==max1 && min==max2 && sec>max3)
                                        {
                                            flag=1;
                                            max3=sec;
                                        }
//                                        if(max2==max3 && max2==57)
//                                            System.out.println(max1+" "+max3+" "+max2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        String p,q,r;
        if(max1<=9)
            p='0'+String.valueOf(max1);
        else
            p= String.valueOf(max1);

        if(max2<=9)
            q='0'+String.valueOf(max2);
        else
            q= String.valueOf(max2);

        if(max3<=0)
            r='0'+String.valueOf(max3);
        else
            r= String.valueOf(max3);

        if(flag==1)
        System.out.println(p+":"+q+":"+r);
        else
            System.out.println("Impossible");
    }
}
