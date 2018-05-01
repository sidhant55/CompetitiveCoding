package Codechef;

import java.util.*;

public class CHEFGP {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (--t >= 0) {
            String str=in.next();
            int x=in.nextInt();
            int y=in.nextInt();
            int l=str.length();
            StringBuilder ans[] = new StringBuilder[2];
            for (int k = 0; k < 2; k++) {
                int a = 0, b = 0;
                for (int i = 0; i < l; i++) {
                    if ((str.charAt(i) == 'a')) {
                        a++;
                    } else if (str.charAt(i) == 'b') {
                        b++;
                    }
                }
                ans[k] = new StringBuilder("");
                int i = 0;
                int flag = 0;
                int c1 = 0, c2 = 0;

                flag = k;
                while (i < l) {
                    //System.out.println(a+" "+b);
                    if (a == b) {
                        if (flag == 0 && a > 0) {
                            ans[k].append('a');
                            flag = 1;
                            a--;
                        } else if (flag == 1 && b > 0) {
                            ans[k].append('b');
                            flag = 0;
                            b--;
                        }
                        i++;
                        //System.out.print('1');
                    } else if (a > b) {
                        if (flag == 0) {
                            for (int j = 0; (j < x && a > 0 && i < l && a != b); j++) {

                                ans[k].append('a');
                                i++;
                                a--;
                            }
                            flag = 1;
                        } else if (flag == 1 && b > 0) {
                            ans[k].append('b');
                            i++;
                            b--;
                            flag = 0;
                        }
                        //System.out.print('2');
                    } else if (a < b) {
                        if (flag == 0 && a > 0) {
                            ans[k].append('a');
                            i++;

                            a--;
                            flag = 1;
                        } else if (flag == 1) {
                            for (int j = 0; (j < y && b > 0 && i < l && a != b); j++) {

                                ans[k].append('b');
                                i++;
                                b--;
                            }
                            flag = 0;
                        }
                        //System.out.print('3');
                    }
                    if (flag == 0 && a == 0 && i < l) {
                        c1 = 0;
                        ans[k].append('*');
                        while (i < l) {
                            if (c1 < y) {
                                c1++;
                                ans[k].append('b');
                                i++;
                            } else {
                                ans[k].append('*');
                                c1 = 0;
                            }
                        }
                        break;
                        //System.out.print('4');
                    } else if (flag == 1 && b == 0 && i < l) {
                        c2 = 0;
                        ans[k].append('*');
                        while (i < l) {
                            if (c2 < x) {
                                c2++;
                                ans[k].append('a');
                                i++;
                            } else {
                                ans[k].append('*');
                                c2 = 0;
                            }
                        }
                        break;
                        //System.out.print('5');
                    }
                }
            }
            int s0 = 0, s1 = 0;
            int l0 = ans[0].length();
            for (int i = 0; i < l0; i++) {
                if (ans[0].charAt(i) == '*')
                    s0++;
            }
            int l1 = ans[1].length();
            for (int i = 0; i < l1; i++) {
                if (ans[1].charAt(i) == '*')
                    s1++;
            }
            if (s1 < s0)
                System.out.println(ans[1]);
            else
                System.out.println(ans[0]);
        }
    }
}
