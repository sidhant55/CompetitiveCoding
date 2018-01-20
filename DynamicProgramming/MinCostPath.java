package DynamicProgramming;

import java.util.*;

public class MinCostPath {
    public static void main(String args[]) {
        int cost[][]= {{0,0, 0, 0},{0,1, 2, 3},
                {0,4, 8, 2},
                {0,1, 5, 3}};
        int l1=cost.length;
        int l2=cost[0].length;
        for (int i=1;i<l1;i++)
        {
            for (int j=1;j<l2;j++)
            {
                cost[i][j]=cost[i][j]+Math.min(cost[i-1][j-1],Math.min(cost[i-1][j],cost[i][j-1]));
            }
        }
        System.out.println(cost[l1-1][l2-1]);
    }
}
