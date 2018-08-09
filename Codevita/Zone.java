package Codevita;

import java.util.*;
class box
{
    String name;
    double score;
}
public class Zone {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        ArrayList<ArrayList<box>> arr=new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            arr.add(new ArrayList<>());
            for(int j=0;j<m;j++)
            {
                box obj=new box();
                obj.name=in.next();
                obj.score=in.nextDouble();
                arr.get(i).add(obj);
            }
        }

        long c=n*m;
        while(--c>=0)
        {
            int ind=0;
            double max=Double.MIN_VALUE;
            for(int i=0;i<n;i++)
            {
                if(arr.get(i).size()>0&&arr.get(i).get(0).score>max)
                {
                    max=arr.get(i).get(0).score;
                    ind=i;
                }
            }
            System.out.println(arr.get(ind).get(0).name+" "+arr.get(ind).get(0).score);
            arr.get(ind).remove(0);
        }



    }
}
