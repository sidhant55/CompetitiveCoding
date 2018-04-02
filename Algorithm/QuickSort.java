package Algorithm;

import java.io.File;
import java.io.*;

public class QuickSort {

    static long ans=0;

    public static void initialize(int arr[], int n)
    {
        int st=0;
        int en=n-1;
        int val=arr[st];
        sort(arr,st,en,val);
    }

    public static void sort(int arr[], int st, int en, int val)
    {
        ans=ans+(en-st+1);
        if (st>=en)
            return;



        int l=st+1;
        int r=en;
        while(l<=r)
        {
            if (arr[l]<val)
            {
                l++;
            }
            else
            {
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                r--;
            }
        }

        try{
            int temp=arr[r];
            arr[r]=arr[st];
            arr[st]=temp;
        }
        catch (Exception e)
        {
            System.out.print("Error");
        }
        try {
            sort(arr, st, r - 1, arr[st]);
        }
        catch (Exception e)
        {

        }
        try
        {
            sort(arr,r+1,en,arr[r+1]);
        }
        catch (Exception e)
        {

        }

    }

    public static void main(String args[])throws IOException {


        File file =new File("/home/sidhant/IdeaProjects/Practice/src/Algorithm/input.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        int c=0;
        int arr[]=new int [10000];
        while ((st = br.readLine()) != null)
        {
            arr[c]=Integer.parseInt(st);
            c++;
        }

        int l=arr.length;
        initialize(arr, l);

        System.out.println(ans);

        System.out.println(arr[l-5]);

//        PrintWriter writer = new PrintWriter("/home/sidhant/IdeaProjects/Practice/src/Algorithm/output.txt");

        int i=0;

        for ( i=0;i<l;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
