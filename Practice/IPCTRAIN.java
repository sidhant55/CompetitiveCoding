package Codechef;

import java.util.*;
class trainer{
    int day;
    int lec;
    int sad;
}
public class IPCTRAIN {
    static void heapify(trainer arr[], int n, int i)
    {
        int largest = i;  // Initialize largest as root
        int l = 2*i + 1;  // left = 2*i + 1
        int r = 2*i + 2;  // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l].sad > arr[largest].sad)
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r].sad> arr[largest].sad)
            largest = r;

        // If largest is not root
        if (largest != i)
        {
            trainer swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (--t >= 0) {
            int n=in.nextInt();
            int d=in.nextInt();
            trainer arr[]=new trainer[n];
            for (int i=0;i<n;i++)
            {
                trainer obj=new trainer();
                obj.day=in.nextInt();
                obj.lec=in.nextInt();
                obj.sad=in.nextInt();
                arr[i]=obj;
            }
            trainer ans[]=new trainer[n];
            int count=0;
            int top=0;
            for (int i=1;i<=d;i++)
            {
                for (int j=0;j<n;j++)
                {
                    if (arr[j].day==i)
                    {
                        ans[count]=arr[j];
                        count++;
                    }
                }
                heapify(ans,count,top);
                if (top<count) {
                    ans[top].lec--;
                    //System.out.println(ans[top].sad + " " + ans[top].lec + " " + top + " " + count);
                    if (ans[top].lec == 0)
                        top++;
                }
            }
            int s=0;
            for (int i=top;i<count;i++)
            {
                s=s+ans[i].lec*ans[i].sad;
            }
            System.out.println(s);
        }
    }
}
