package Codevita;
import java.util.*;
public class test
{
    public static void main(String args[])
    {
        Scanner in=new Scanner (System.in);
        int n=in.nextInt();
        ArrayList<Double> arr=new ArrayList<>();

        for(int i=0;i<n;i++)
            arr.add(in.nextDouble());

        Collections.sort(arr, new Comparator<Double>(){
            @Override
            public int compare(Double a,Double b)
            {
                int num1= (int) Math.abs(a-a.intValue());
                int num2=(int) Math.abs(b-b.intValue());
                if(num1>num2)
                    return 1;
                else
                    return -1;

            }

        });

        for(int i=0;i<n;i++)
            System.out.println(arr.get(i));

    }

}