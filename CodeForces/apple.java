package CodeForces;
import java.util.*;
import java.lang.*;
import java.io.*;
public class apple {
    static class box
    {
        float c;
        float w;
        float wt;
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        box arr[]=new box[n];
        ArrayList<box> arr=new ArrayList <>();
        int m=in.nextInt();
        float min=Float.MAX_VALUE;
        for (int i=0;i<n;i++)
        {
            arr.add(new box());
            arr.get(i).c=(in.nextFloat());
            arr.get(i).w=(in.nextFloat());
            arr.get(i).wt=arr.get(i).c/arr.get(i).w;
            if (arr.get(i).wt<min)
                min=arr.get(i).wt;
        }
//        System.out.println(arr);
//        for (int i=0;i<n;i++)
//            System.out.println(arr.get(i).wt);
        System.out.println(min*m);
    }
}
