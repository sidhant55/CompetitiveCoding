import java.util.*;
public class comparator {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        HashMap<String, Float> map = new HashMap<String, Float>();
        ValueComparator bvc = new ValueComparator(map);
        TreeMap<String, Float> sorted_map = new TreeMap<String, Float>(bvc);

        int t=in.nextInt();

        for (int i=1;i<=t;i++)
        {
            float a=in.nextFloat();
            float b=in.nextFloat();
            float c=b/a;
            String x=Integer.toString(i);
            map.put(x,c);
        }

        //System.out.println("unsorted map: " + map);
        sorted_map.putAll(map);
        //System.out.println("results: " + sorted_map);

        // Set<Map.Entry<String, Double>> set=map.entrySet();

        //     for (Map.Entry<String, Double> me:set)
        //     {

        //         System.out.println(me.getKey()+":"+me.getValue());
        //     }

        Set entrySet = sorted_map.entrySet();
 
        // Obtaining an iterator for the entry set
        Iterator it = entrySet.iterator();

            while(it.hasNext()){
           Map.Entry me = (Map.Entry)it.next();
           System.out.println(me.getKey());
        }
    }
}

class ValueComparator implements Comparator<String> {
    Map<String, Float> base;

    public ValueComparator(Map<String, Float> base) {
        this.base = base;
    }

    // Note: this comparator imposes orderings that are inconsistent with
    // equals.
    public int compare(String a, String b) {
        if (base.get(a) > base.get(b)) {
            return -1;
        } else {
            return 1;
        } // returning 0 would merge keys
    }
}