package CodeJam;

import java.util.*;

class box
{
    int no;
    char name;
    box(int no, char name)
    {
        this.no=no;
        this.name=name;
    }
}

public class Senate_Evacuation {

    public static void BuildMaxHeap(box arr[], int n)
    {
        for (int i=n/2-1;i>=0;i--)
        {
            heapify(arr,i,n);
        }
    }


    public static void heapify(box arr[], int p, int n)
    {
        int c1=2*p+1;
        int c2=2*p+2;

        int largest=p;
        if (c1<n && arr[c1].no>arr[p].no)
            largest=c1;

        if (c2<n && arr[c2].no>arr[p].no)
            largest=c2;

        if (largest!=p)
        {
            int temp1=arr[p].no;
            arr[p].no=arr[largest].no;
            arr[largest].no=temp1;

            char temp2=arr[p].name;
            arr[p].name=arr[largest].name;
            arr[largest].name=temp2;

            heapify(arr,largest,n);
        }
    }

    public static String find(box arr[], int n, int sum)
    {
        String x="";

        x=x+""+arr[0].name;
        arr[0].no--;

        sum--;
        if (arr[1].no>(sum/2.0))
        {
            x=x+arr[1].name;
            arr[1].no--;
            heapify(arr,1,n);
        }
        heapify(arr,0,n);

        return x;
    }



    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int k=1;k<=t;k++) {

            int n=in.nextInt();
            box arr[]=new box [n];

            int sum=0;
            for (int i=0;i<n;i++) {
                int a = in.nextInt();
                char ch=(char)(i+65);
                arr[i]=new box(a,ch);
                sum+=a;
            }

            BuildMaxHeap(arr,n);

//            for (int i=0;i<n;i++)
//                System.out.print(arr[i].no+""+arr[i].name+" ");

            String ans="";
            int s=sum;
//            System.out.println(sum);
            for (int i=1;i<=sum;i++)
            {
//                System.out.println(i);
                String x=find(arr, n,s);
                s-=x.length();
                if (x.length()==2)
                    i++;
                ans=ans+x+" ";

            }
            System.out.println("Case #"+k+": "+ans);

        }
    }
}
