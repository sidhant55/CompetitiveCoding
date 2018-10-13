package CodeForces;

import java.util.*;

public class bfs {

    public static HashMap<Integer,Integer> rank(ArrayList<ArrayList<Integer>> arr)
    {
        int src=0;
        LinkedList<Integer> que=new LinkedList <>();
        HashMap<Integer,Integer> hm=new HashMap <>();
        que.add(src);
        int vis[]=new int [arr.size()];
        int c=0;
        hm.put(src,c);
        while(!que.isEmpty())
        {
            c++;
            int ind=que.pollFirst();
            ArrayList<Integer> ar=arr.get(ind);
            for(int i=0;i<ar.size();i++)
            {
                if(vis[ar.get(i)]==0) {
                    que.add(ar.get(i));
                    hm.put(ar.get(i), c);
                    vis[ar.get(i)]=1;
                }
            }
        }
        return hm;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<ArrayList<Integer>> arr=new ArrayList <>();

        for(int i=0;i<n;i++)
            arr.add(new ArrayList <>());

        for(int i=0;i<n-1;i++)
        {
            int a=in.nextInt()-1;
            int b=in.nextInt()-1;
            arr.get(a).add(b);

        }

        HashMap<Integer,Integer> hm=rank(arr);
        System.out.println(hm);

        int brr[]=new int [n];
        for(int i=0;i<n;i++)
            brr[i]=in.nextInt()-1;

        int cnt=0;
        int flag=0;
        for(int i=0;i<n;i++)
        {
            int val=hm.get(brr[i]);
            if(val==cnt)
            {

            }
            else if(val==cnt+1)
            {
                cnt++;
            }
            else
            {
                flag=1;
                break;
            }
        }

        if(flag==1)
            System.out.println("No");
        else
            System.out.println("Yes");

    }
}
