package CodeJam;

import java.util.*;

public class word {


    static final int Size=26;
    static class TrieNode
    {
        TrieNode[] children =new TrieNode[Size];
        boolean end;

        TrieNode()
        {
            end=false;
            for (int i=0;i<Size;i++)
                children[i]=null;
        }
    };

    static TrieNode root;

    static void insert(String key)
    {
        int level;
        int lenght=key.length();
        int index;

        TrieNode pCrawl=root;
        for (level=0;level<lenght;level++)
        {
            index=key.charAt(level)-'A';
            if (pCrawl.children[index]==null)
                pCrawl.children[index]=new TrieNode();
            pCrawl=pCrawl.children[index];
        }
        pCrawl.end=true;
    }

    static boolean search(String key)
    {
        TrieNode node=root;
        int len=key.length();
        for (int i=0;i<len;i++)
        {
            int index=key.charAt(i)-'A';
            if (node.children[index]==null)
                return false;
            node=node.children[index];
        }
        return (node != null && node.end);
    }



    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int k=1;k<=t;k++)
        {
            int n=in.nextInt();
            int l=in.nextInt();

            char arr[][]=new char[n][l];

            root = new TrieNode();
            for (int i=0;i<n;i++)
            {
                String x=in.next();
                insert(x);
                for (int j=0;j<l;j++)
                    arr[i][j]=x.charAt(j);
            }


            int brr[][]=new int [l][26];
            long all=1;
            for (int i=0;i<l;i++)
            {
                int cnt=0;

                for (int j=0;j<n;j++)
                {
                    int asc=(int)arr[j][i];
                    asc=asc-65;
                    if (brr[i][asc]==0)
                    {
                        cnt++;
                        brr[i][asc]++;
                    }

                }

//                System.out.println(cnt);
                all=all*cnt;
            }

            if (all==n)
            {
                System.out.println("Case #"+k+": -");
            }
            else
            {
                int flag = 0;
                String ans = "";

                while(true) {

                    int c1=0;
                    for (int i = 0; i < l; i++) {
                        int min = Integer.MAX_VALUE;
                        char ch = ' ';
                        char nxt = ' ';
                        for (int j = 0; j < 26; j++) {
                            if (brr[i][j] < min && brr[i][j] != 0) {
                                min = brr[i][j];
                                ch = (char) (65 + j);
                                c1=j;
                            }
                        }
                        ans = ans + ch;
                        if (i==l-1)
                        {
                            if (search(ans) == false) {
                                flag = 1;
                                break;
                            }
                            else
                            {
                                brr[i][c1]=Integer.MAX_VALUE;
                                i=i-1;
                                ans=ans.substring(0,l-1);
                            }
                        }

                    }
                    if (flag==1)
                        break;;

                }

                if (flag==1)
                System.out.println("Case #"+k+": "+ans);
            }

//            System.out.println(all);


        }
    }
}
