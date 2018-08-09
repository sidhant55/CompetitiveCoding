package Codevita;

import java.util.*;

public class BugCrawl {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        String x=in.nextLine();
        String y=in.nextLine();

        HashMap<String,String> hm=new HashMap <>();

        hm.put("1U-F","6S");
        hm.put("1U-B","6N");
        hm.put("1U-L","6E");
        hm.put("1U-R","6W");

        hm.put("1D-F","3S");
        hm.put("1D-B","3N");
        hm.put("1D-L","3W");
        hm.put("1D-R","3E");

        hm.put("1W-F","2S");
        hm.put("1W-B","2N");
        hm.put("1W-L","2U");
        hm.put("1W-R","2D");

        hm.put("1E-F","5S");
        hm.put("1E-B","5N");
        hm.put("1E-L","5D");
        hm.put("1E-R","5U");



        hm.put("2U-F","6E");
        hm.put("2U-B","6W");
        hm.put("2U-L","6S");
        hm.put("2U-R","6N");

        hm.put("2D-F","3E");
        hm.put("2D-B","3W");
        hm.put("2D-L","3S");
        hm.put("2D-R","3N");

        hm.put("2S-F","4E");
        hm.put("2S-B","4W");
        hm.put("2S-L","4U");
        hm.put("2S-R","4D");

        hm.put("2N-F","1E");
        hm.put("2N-B","1W");
        hm.put("2N-L","1D");
        hm.put("2N-R","1U");



        hm.put("3E-F","5U");
        hm.put("3E-B","5D");
        hm.put("3E-L","5S");
        hm.put("3E-R","5N");

        hm.put("3W-F","2U");
        hm.put("3W-B","2D");
        hm.put("3W-L","2N");
        hm.put("3W-R","2S");

        hm.put("3S-F","4U");
        hm.put("3S-B","4D");
        hm.put("3S-L","4W");
        hm.put("3S-R","4E");

        hm.put("3N-F","1U");
        hm.put("3N-B","1D");
        hm.put("3N-L","1E");
        hm.put("3N-R","1W");





        hm.put("4U-F","6N");
        hm.put("4U-B","6S");
        hm.put("4U-L","6W");
        hm.put("4U-R","6E");

        hm.put("4D-F","3N");
        hm.put("4D-B","3S");
        hm.put("4D-L","3E");
        hm.put("4D-R","3W");

        hm.put("4W-F","2N");
        hm.put("4W-B","2S");
        hm.put("4W-L","2D");
        hm.put("4W-R","2U");

        hm.put("4E-F","5N");
        hm.put("4E-B","5S");
        hm.put("4E-L","5U");
        hm.put("4E-R","5D");



        hm.put("5U-F","6W");
        hm.put("5U-B","6E");
        hm.put("5U-L","6S");
        hm.put("5U-R","6N");

        hm.put("5D-F","3W");
        hm.put("5D-B","3E");
        hm.put("5D-L","3N");
        hm.put("5D-R","3S");

        hm.put("5S-F","4W");
        hm.put("5S-B","4E");
        hm.put("5S-L","4D");
        hm.put("5S-R","4U");

        hm.put("5N-F","1W");
        hm.put("5N-B","1E");
        hm.put("5N-L","1U");
        hm.put("5N-R","1D");



        hm.put("6E-F","5D");
        hm.put("6E-B","5U");
        hm.put("6E-L","5N");
        hm.put("6E-R","5S");

        hm.put("6W-F","2D");
        hm.put("6W-B","2U");
        hm.put("6W-L","2S");
        hm.put("6W-R","2N");

        hm.put("6S-F","4D");
        hm.put("6S-B","4U");
        hm.put("6S-L","4E");
        hm.put("6S-R","4W");

        hm.put("6N-F","1D");
        hm.put("6N-B","1U");
        hm.put("6N-L","1W");
        hm.put("6N-R","1E");



        for (int i=y.length()-1;i>=0;i--)
        {
            String str=x+"-"+y.charAt(i);
            x=hm.get(str);
            System.out.println(str+" "+x);
        }

        System.out.println(x);

    }
}
