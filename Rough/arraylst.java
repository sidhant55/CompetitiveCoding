package Rough;

import java.util.*;

class student
{
    String name;
    int marks;
    student(String name, int marks)
    {
        this.name=name;
        this.marks=marks;
    }

    public static Comparator<student> stmark=new Comparator <student>() {
        @Override
        public int compare(student t1, student t2) {
            return (t1.marks-t2.marks);
        }
    };
}

public class arraylst {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        student a=new student("Sid",96);
        student b=new student("Snak",72);
        student c=new student("Mum",82);
        student d=new student("Dad",85);

        ArrayList<Integer> arr=new ArrayList <Integer>(Arrays.asList(5,10,8,30,9,7,0,36,10));

        for (int num: arr)
            System.out.print(num+"  ");

        System.out.println();

        Iterator itr=arr.iterator();
        while(itr.hasNext())
            System.out.print(itr.next()+"  ");
        System.out.println();

        Enumeration<Integer> enu=Collections.enumeration(arr);

        while(enu.hasMoreElements())
            System.out.print(enu.nextElement());

        arr.forEach((ab)->System.out.println(ab));
    }
}
