import java.util.*;
 
class AllPathMat
{
    /* Driver program to test above functions */
    static int AllPath(int m,int n)
    {
        if (m==1)
            return 1;
        if (n==1)
            return 1;
        return AllPath(m-1,n)+AllPath(m,n-1);

    }
 
    /* Driver program to test above functions */
    public static void main(String args[])
    {
        int m=3;
        int n=3;
        System.out.println(AllPath(m,n));
    }
}