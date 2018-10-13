package Rough;
public class suff
{
    static class stn
    {
        static final int chrmax = 26;
        stn[] child = new stn[chrmax];

        stn()
        {
            for (int i = 0; i < chrmax; i++)
                child[i] = null;
        }
        void put(String s)
        {
            if (s.length() > 0)
            {
                char cIndex = (char) (s.charAt(0) - 'a');
                if (child[cIndex] == null)
                    child[cIndex] = new stn();
                child[cIndex].put(s.substring(1));
            }
        }
    }
    static class Solution
    {
        static final int chrmax = 26;
        stn base;
        Solution(String s) {
            base = new stn();
            for (int i = 0; i < s.length(); i++)
                base.put(s.substring(i));
        }
        int find(stn block)
        {
            if (block == null)
                return 0;

            int c = 0;
            for (int i = 0; i < chrmax; i++) {
                if (block.child[i] != null)
                    c += find(block.child[i]);
            }
            return (1 + c);
        }
        int ans()
        {
            return find(base);
        }

    }
    static long funcName(String str)
    {
        Solution sTrie = new Solution(str);
        return sTrie.ans();
    }
    public static void main(String args[])
    {

    }
}
