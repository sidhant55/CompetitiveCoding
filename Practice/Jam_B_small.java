import java.util.*;
public class Jam_B_small
{
    public static void main (String args[])
    {
        Scanner in=new Scanner (System.in);
        System.out.println("Welcome");
        int t=in.nextInt();
        while(--t>=0)
        {
            int x=in.nextInt();
            int num,rem=0,c=9;
            for (int i=x;i>=1;i--)
            {
                num=i;
                c=9;
                while(num>0)
                {
                    rem=num%10;
                    num=num/10;
                    //System.out.println(rem+" "+num+" "+c);
                    if (rem<=c)
                    c=rem;
                    else{
                    break;
                    }
                    //System.out.println(rem+" "+num+" "+c);
                }
                if (num==0 && rem<=c){
                    
                System.out.println(i);
                break;
            }
            }
        }
    }
}