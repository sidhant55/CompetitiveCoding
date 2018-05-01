package Codechef;

import java.util.*;

/*
2
3 6
4 10 1 3 2
3 4 14 1
2 7 8
2 3 9
2 1 2
2 3 8
1 1 2 2
1 1 2 2
1 1 2 2
1 1 2 2
1 1 2 2
1 1 2 2
3 3
3 1 2 2
2 1 2
3 1 4 1
2 1 2
2 1 5
3 1 3
2 1 1 2
1 1 1 2
3 1 3 3
 */
class verti
{
    int vertex;
    int weight;
}

public class CHEFCCYL1 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (--t >= 0) {
            int c=0;
            int n=in.nextInt();
            int q=in.nextInt();
            ArrayList<ArrayList<verti>> arr=new ArrayList <ArrayList<verti>>();
            int index[]=new int[n+1];
            index[0]=0;
            for (int i=0;i<n;i++)
            {
                int side=in.nextInt();
                c+=side;
                index[i+1]=index[i]+side;
                for (int j=index[i];j<index[i+1];j++)
                    arr.add(new ArrayList <verti>());
                int rough;
                if (side==1)
                    rough=in.nextInt();
                else if (side==2)
                {
                    int min=Integer.MAX_VALUE;
                    for (int j = index[i]; j < index[i + 1]; j++) {
                        int weigh = in.nextInt();
                        min=weigh<min?weigh:min;
                    }
                    verti obj1 = new verti();
                    verti obj2 = new verti();
                    ArrayList <verti> ar1 = arr.get(index[i]);
                    ArrayList <verti> ar2 = arr.get(index[i]+1);
                    obj1.vertex = index[i]+1;
                    obj1.weight = min;
                    ar1.add(obj1);
                    obj2.vertex = index[i];
                    obj2.weight = min;
                    ar2.add(obj2);
                }
                else {
                    for (int j = index[i]; j < index[i + 1]; j++) {
                        int weigh = in.nextInt();
                        verti obj1 = new verti();
                        verti obj2 = new verti();
                        ArrayList <verti> ar1 = arr.get(j);
                        ArrayList <verti> ar2;
                        if ((j + 1) == index[i + 1]) {
                            ar2 = arr.get(index[i]);
                            obj1.vertex = index[i];
                            obj1.weight = weigh;
                            ar1.add(obj1);
                        } else {
                            ar2 = arr.get(j + 1);
                            obj1.vertex = j + 1;
                            obj1.weight = weigh;
                            ar1.add(obj1);
                        }
                        obj2.vertex = j;
                        obj2.weight = weigh;
                        ar2.add(obj2);
                    }
                }
            }
//            for (int i=0;i<=n;i++)
//                System.out.print(index[i]+" ");
//            System.out.println();
            for (int i=1;i<=n;i++)
            {
                int v1=in.nextInt();
                int v2=in.nextInt();
                int w=in.nextInt();
                int ind1=index[i-1]+v1-1;
                int ind2=index[(i%n)]+v2-1;
                ArrayList<verti> ar1=arr.get(ind1);
                ArrayList<verti> ar2=arr.get(ind2);
                verti obj1=new verti();
                obj1.vertex=ind2;
                obj1.weight=w;
                ar1.add(obj1);
                verti obj2=new verti();
                obj2.vertex=ind1;
                obj2.weight=w;
                ar2.add(obj2);
            }
//            for (int i=0;i<arr.size();i++)
//            {
//                ArrayList<verti> ar=arr.get(i);
//                System.out.println(i+" ");
//                for (int j=0;j<ar.size();j++)
//                {
//                    System.out.println(ar.get(j).vertex+" "+ar.get(j).weight);
//                }
//            }
            //System.out.println(c+" "+arr.size());
//            int cos[][]=new int[c][];
            Graph graph=new Graph(c);
            for (int i=0;i<c;i++)
                graph.addVertex(i);
            for (int i=0;i<arr.size();i++)
            {
                ArrayList<verti> ar=arr.get(i);
                for (int j=0;j<ar.size();j++)
                {
                    graph.addEdge(i,ar.get(j).vertex,ar.get(j).weight);
                }
            }
//            for (int i=0;i<c;i++)
//                graph.findShortestPaths(i,cos);

//            for (int i=0;i<c;i++)
//            {
//                for (int j=0;j<c;j++)
//                    System.out.print(cos[i][j]+" ");
//                System.out.println();
//            }

            for (int i=0;i<q;i++)
            {
                int cos[]=new int [c];
                int v1=in.nextInt()-1;
                int c1=in.nextInt()-1;
                int v2=in.nextInt()-1;
                int c2=in.nextInt()-1;
                int ind1=index[c1]+v1;
                int ind2=index[c2]+v2;
                graph.findShortestPaths(ind1,cos);
                System.out.println(cos[ind2]);
//                if (cos[ind1]==null && cos[ind2]==null)
//                {
//                    cos[ind1]=new int [c];
//                    graph.findShortestPaths(ind1,cos);
//                    System.out.println(cos[ind1][ind2]);
//                }
//                else
//                {
//                    if (cos[ind1]!=null)
//                        System.out.println(cos[ind1][ind2]);
//                    else if (cos[ind2]!=null)
//                        System.out.println(cos[ind2][ind1]);
//                }
            }
        }
    }
    public static class Graph {
        Vertex[] vertices;
        int maxSize;
        int size;

        public Graph(int maxSize) {
            this.maxSize = maxSize;
            vertices = new Vertex[maxSize];
        }

        public void addVertex(int name) {
            vertices[size++] = new Vertex(name);
        }

        public void addEdge(int sourceName, int destinationName, int weight) {
            int srcIndex = sourceName;
            int destiIndex = destinationName;
            vertices[srcIndex].adj = new Neighbour(destiIndex, weight, vertices[srcIndex].adj);
            vertices[destiIndex].indegree++;
        }

        public void findShortestPaths(int sourceName, int cos[]){
            applyDikjstraAlgorith(vertices[sourceName]);
            for(int i = 0; i < maxSize; i++){
                //System.out.println("Distance of "+vertices[i].name+" from Source: "+ vertices[i].cost);
                cos[vertices[i].name]=vertices[i].cost;
            }
            for (int i=0;i<maxSize;i++)
            {
                vertices[i].cost=Integer.MAX_VALUE;
                vertices[i].state=State.NEW;
            }
            //System.out.println();
        }

        public class Vertex {
            int cost;
            int name;
            Neighbour adj;
            int indegree;
            State state;

            public Vertex(int name) {
                this.name = name;
                cost = Integer.MAX_VALUE;
                state = State.NEW;
            }

            public int compareTo(Vertex v) {
                if (this.cost == v.cost) {
                    return 0;
                }
                if (this.cost < v.cost) {
                    return -1;
                }
                return 1;
            }
        }

        public enum State {
            NEW, IN_Q, VISITED
        }

        public class Neighbour {
            int index;
            Neighbour next;
            int weight;

            Neighbour(int index, int weight, Neighbour next) {
                this.index = index;
                this.next = next;
                this.weight = weight;
            }
        }

        public void applyDikjstraAlgorith(Vertex src) {
            Heap heap = new Heap(maxSize);
            heap.add(src);
            src.state = State.IN_Q;
            src.cost = 0;
            while (!heap.isEmpty()) {
                Vertex u = heap.remove();
                u.state = State.VISITED;
                Neighbour temp = u.adj;
                while (temp != null) {
                    if (vertices[temp.index].state == State.NEW) {
                        heap.add(vertices[temp.index]);
                        vertices[temp.index].state = State.IN_Q;
                    }
                    if (vertices[temp.index].cost > u.cost + temp.weight) {
                        vertices[temp.index].cost = u.cost + temp.weight;
                        heap.heapifyUP(vertices[temp.index]);
                    }
                    temp = temp.next;
                }
            }
        }

        public static class Heap {
            private Vertex[] heap;
            private int maxSize;
            private int size;

            public Heap(int maxSize) {
                this.maxSize = maxSize;
                heap = new Vertex[maxSize];
            }

            public void add(Vertex u) {
                heap[size++] = u;
                heapifyUP(size - 1);
            }

            public void heapifyUP(Vertex u) {
                for (int i = 0; i < maxSize; i++) {
                    if (u == heap[i]) {
                        heapifyUP(i);
                        break;
                    }
                }
            }

            public void heapifyUP(int position) {
                int currentIndex = position;
                Vertex currentItem = heap[currentIndex];
                int parentIndex = (currentIndex - 1) / 2;
                Vertex parentItem = heap[parentIndex];
                while (currentItem.compareTo(parentItem) == -1) {
                    swap(currentIndex, parentIndex);
                    currentIndex = parentIndex;
                    if (currentIndex == 0) {
                        break;
                    }
                    currentItem = heap[currentIndex];
                    parentIndex = (currentIndex - 1) / 2;
                    parentItem = heap[parentIndex];
                }
            }

            public Vertex remove() {
                Vertex v = heap[0];
                swap(0, size - 1);
                heap[size - 1] = null;
                size--;
                heapifyDown(0);
                return v;
            }

            public void heapifyDown(int postion) {
                if (size == 1) {
                    return;
                }

                int currentIndex = postion;
                Vertex currentItem = heap[currentIndex];
                int leftChildIndex = 2 * currentIndex + 1;
                int rightChildIndex = 2 * currentIndex + 2;
                int childIndex;
                if (heap[leftChildIndex] == null) {
                    return;
                }
                if (heap[rightChildIndex] == null) {
                    childIndex = leftChildIndex;
                } else if (heap[rightChildIndex].compareTo(heap[leftChildIndex]) == -1) {
                    childIndex = rightChildIndex;
                } else {
                    childIndex = leftChildIndex;
                }
                Vertex childItem = heap[childIndex];
                while (currentItem.compareTo(childItem) == 1) {
                    swap(currentIndex, childIndex);
                    currentIndex = childIndex;
                    currentItem = heap[currentIndex];
                    leftChildIndex = 2 * currentIndex + 1;
                    rightChildIndex = 2 * currentIndex + 2;
                    if (heap[leftChildIndex] == null) {
                        return;
                    }
                    if (heap[rightChildIndex] == null) {
                        childIndex = leftChildIndex;
                    } else if (heap[rightChildIndex].compareTo(heap[leftChildIndex]) == -1) {
                        childIndex = rightChildIndex;
                    } else {
                        childIndex = leftChildIndex;
                    }
                }
            }

            public void swap(int index1, int index2) {
                Vertex temp = heap[index1];
                heap[index1] = heap[index2];
                heap[index2] = temp;
            }

            public boolean isEmpty() {

                return size == 0;
            }
        }
    }
}
