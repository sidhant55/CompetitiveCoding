package CodeForces;

import java.util.*;

public class filled {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();

        int arr[]=new int [n];
        int flag=0;
        int max=0;
        for (int i=0;i<n;i++) {
            arr[i] = in.nextInt();
            if (arr[i] <= 0)
                flag = 1;
            if (arr[i]>max)
                max=arr[i];
        }
        if (flag==1)
        {
            System.out.println("NO");
        }
        else if (n==1)
        {
            System.out.println("YES");
            System.out.println(1 + " " + arr[0]);
        }
        else {
            int temp=0;
            int val=-1;
            for (int i = 1; i < n; i++) {

                int dif=(int)Math.abs(arr[i]-arr[i-1]);
                if (val==-1 && dif!=1)
                {
                    val = dif;
                }

                else if ((dif==1) || (dif==val))
                {
                    if (dif==1)
                        temp++;
                    if (dif==val)
                    continue;
                }

                else
                {
                    System.out.println("NO");
                    flag=1;
                    break;
                }
            }


            if (flag==0) {
                if (temp == n - 1) {
                    System.out.println("YES");
                    System.out.println(1 + " " + n);
                    flag = 1;
                }
                else {
                    try {
                        int x = max / val;
                        if (max % val != 0)
                            x++;
                        int y = val;

                        for (int i = 0; i < n - 1; i++) {
                            if (arr[i] % y == 0) {
                                if (arr[i + 1] - arr[i] == 1) {
                                    System.out.println("NO");
                                    flag = 1;
                                    break;
                                }

                            }
                            else if ((arr[i]-1)%y==0)
                            {
                                if (arr[i] - arr[i+1] == 1) {
                                    System.out.println("NO");
                                    flag = 1;
                                    break;
                                }
                            }
                        }
                        if (flag == 0) {
                            System.out.println("YES");
                            System.out.println(x + " " + y);
                        }

                    }
                    catch (Exception e)
                    {
                        System.out.println("NO");
                    }
                }

            }


        }
    }
}
