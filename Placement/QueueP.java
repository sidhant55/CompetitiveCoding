package Placement;

import java.util.*;

public class QueueP {

    int front;
    int rear;
    int capacity;
    int size;
    int arr[];

    QueueP(int capacity)
    {
        rear=0;
        front=0;
        this.capacity=capacity;
        arr=new int [this.capacity];
        size=0;
    }

    public void enqueue(int val)
    {
        if (size==capacity)
            return;
        arr[front]=val;
        front++;
        size++;

    }

    public int dequeue()
    {
        if (front==rear) {
            System.out.println("Empty");
            return -1;
        }
        int val=arr[rear];
        rear++;
        return val;
    }

    public void print()
    {
        for (int i=rear;i<front;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }



    public static void main(String args[]) {

        QueueP obj=new QueueP(20);
        obj.enqueue(1);
        obj.enqueue(2);
        obj.enqueue(3);
        obj.enqueue(4);
        obj.enqueue(5);
        obj.enqueue(6);
        obj.enqueue(7);
        obj.enqueue(8);
        obj.print();
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        obj.print();
        obj.enqueue(9);
        obj.enqueue(10);
        obj.print();
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        obj.print();




    }
}
