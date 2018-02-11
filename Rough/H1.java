package Rough;

import java.util.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.StringTokenizer;

public class H1 {

    static Set<Board> set = new HashSet<Board>();
    static List<Board> list;
    public static void main(String[] args) throws IOException {
        Board goal = new Board();
        int[][] swaps = new int[][] {
                {0,1},{1,2},
                {3,4},{4,5},
                {6,7},{7,8},
                {0,3},{3,6},
                {1,4},{4,7},
                {2,5},{5,8}
        };
        for (int i=0; i<9; i++) {
            goal.a[i] = i+1;
        }

        Locale.setDefault(Locale.US);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        list = new ArrayList<Board>(177872);
        Board b;
        set.add(goal);
        list.add(goal);
        int index = 0;
        outer: while (index < list.size()) {
            b = list.get(index++);
            for (int x=0; x<swaps.length; x++) {
                int sum = b.a[swaps[x][0]]+b.a[swaps[x][1]];
                if ((sum==11)||(sum==7)||(sum==13)||(sum==5)||(sum==17)||(sum==3)) {
                    Board c = b.swap(swaps[x][0], swaps[x][1]);
                    if (set.add(c)) {
                        list.add(c);
                        if (list.size() == 177872) {
                            break outer;
                        }
                    }
                }
            }
        }

        int n = Integer.parseInt(in.readLine());
        for (int i=0; i<n; i++) {
            b = new Board();
            in.readLine();
            for (int j=0; j<3; j++) {
                StringTokenizer st = new StringTokenizer(in.readLine());
                for (int k=0; k<3; k++) {
                    b.a[3*j+k] = Integer.parseInt(st.nextToken());
                }
            }
            if (set.contains(b)) {
                out.println(list.get(list.indexOf(b)).steps);
            } else {
                out.println(-1);
            }
        }
        out.close();
    }

    static class Board {
        int a[] = new int[9];
        int steps;

        Board swap(int i, int j) {
            Board b = new Board();
            for (int k=0; k<9; k++) {
                b.a[k]=a[k];
            }
            b.steps=steps+1;
            int p = b.a[i];
            b.a[i]=b.a[j];
            b.a[j]=p;
            return b;
        }

        @Override
        public int hashCode() {
            int value = 0;
            for (int i=0; i<9; i++) {
                value = value*10+a[i];
            }
            return value;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Board) {
                Board b = (Board)obj;
                for (int i=0; i<9; i++) {
                    if (b.a[i]!=a[i]) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }

    }

}
