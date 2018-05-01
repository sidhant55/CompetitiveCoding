import java.util.*;
public class LinkedListExample {
     public static void main(String args[]) {
         Scanner in=new Scanner (System.in);
         System.out.println("Welcome");
         /* Linked List Declaration */
         LinkedList<String> linkedlist = new LinkedList<String>();
         while (true)
         {
             System.out.println("1:ADD");
             System.out.println("2:REMOVE");
             System.out.println("3:PRINT");
             System.out.println("4:get");
             System.out.println("5:EXIT");
             int d=in.nextInt();
         /*add(String Element) is used for adding 
          * the elements to the linked list*/
          if (d==1){
          String x=in.next();
         linkedlist.add(x);
        }
        if (d==2){
         linkedlist.remove();
        }

         if (d==3)
         System.out.println("Linked List Content: " +linkedlist);
         
         if (d==4){
         /*This is how to get and set Values*/
         int e=in.nextInt();
         Object firstvar = linkedlist.get(e);
         System.out.println(firstvar);
        }

         if (d==5)
         break;
         /*Add First and Last Element*/
         /*linkedlist.addFirst("First Item");
         linkedlist.addLast("Last Item");
         linkedlist.removeFirst();
         linkedlist.removeLast();
         System.out.println("LinkedList Content after addition: " +linkedlist);
         
         
         System.out.println("First element: " +firstvar);
         linkedlist.set(0, "Changed first item");
         Object firstvar2 = linkedlist.get(0);
         System.out.println("First element after update by set method: " +firstvar2);

         /*Remove first and last element*/
         
         /*System.out.println("LinkedList after deletion of first and last element: " +linkedlist);*/

         /* Add to a Position and remove from a position*/
         /*linkedlist.add(0, "Newly added item");
         linkedlist.remove(2);
         System.out.println("Final Content: " +linkedlist); */
        }
     }
}