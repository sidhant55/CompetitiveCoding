package Euler;

import java.util.*;

public class AdjProd {
    static int up(int arr[][], int x,int y)
    {
        if (x-3<0)
            return 0;
        return (arr[x][y]*arr[x-1][y]*arr[x-2][y]*arr[x-3][y]);
    }
    static int dw(int arr[][], int x,int y)
    {
        if (x+3>=20)
            return 0;
        return (arr[x][y]*arr[x+1][y]*arr[x+2][y]*arr[x+3][y]);
    }
    static int l(int arr[][], int x,int y)
    {
        if (y-3<0)
            return 0;
        return (arr[x][y]*arr[x][y-1]*arr[x][y-2]*arr[x][y-3]);
    }
    static int r(int arr[][], int x,int y)
    {
        if (y+3>=20)
            return 0;
        return (arr[x][y]*arr[x][y+1]*arr[x][y+2]*arr[x][y+3]);
    }
    static int ul(int arr[][], int x,int y)
    {
        if (x-3<0 || y-3<0)
            return 0;
        return (arr[x][y]*arr[x-1][y-1]*arr[x-2][y-2]*arr[x-3][y-3]);
    }
    static int ur(int arr[][], int x,int y)
    {
        if (x-3<0 || y+3>=20)
            return 0;
        return (arr[x][y]*arr[x-1][y+1]*arr[x-2][y+2]*arr[x-3][y+3]);
    }
    static int dl(int arr[][], int x,int y)
    {
        if (x+3>=20 || y-3<0)
            return 0;
        return (arr[x][y]*arr[x+1][y-1]*arr[x+2][y-2]*arr[x+3][y-3]);
    }
    static int dr(int arr[][], int x,int y)
    {
        if (x+3>=20 || y+3>=20)
            return 0;
        return (arr[x][y]*arr[x+1][y+1]*arr[x+2][y+2]*arr[x+3][y+3]);
    }
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        int arr[][]=new int [20][20];

        for (int i=0;i<20;i++)
        {
            for(int j=0;j<20;j++)
            {
                arr[i][j]=in.nextInt();
            }
        }
        int ans=0;
        for (int i=0;i<20;i++) {
            int max=0;
            for (int j = 0; j < 20; j++) {
                int a[]=new int [8];
                a[0]=up(arr,i,j);
                a[1]=dw(arr,i,j);
                a[2]=l(arr,i,j);
                a[3]=r(arr,i,j);
                a[4]=ul(arr,i,j);
                a[5]=ur(arr,i,j);
                a[6]=dl(arr,i,j);
                a[7]=dr(arr,i,j);
                for (int k=0;k<8;k++)
                    max=a[k]>max?a[k]:max;
                ans=max>ans?max:ans;
            }

        }
        System.out.println("Hello"+ans);
    }
}
