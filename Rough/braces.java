package Rough;

import java.util.*;

public class braces {

    static boolean isMatchingPair(char character1, char character2)
    {
        if (character1 == '(' && character2 == ')')
            return true;
        else if (character1 == '{' && character2 == '}')
            return true;
        else if (character1 == '[' && character2 == ']')
            return true;
        else
            return false;
    }
    static String[] areParenthesisBalanced(String str[])
    {

        String ans[]=new String[str.length];


            for(int j=0;j<str.length;j++) {

                Stack<Character> st=new Stack<>();

                String exp=str[j];
                for (int i = 0; i < exp.length(); i++) {

                    if (exp.charAt(i)==('{') || exp.charAt(i)==('(') || exp.charAt(i)==('['))
                        st.push(exp.charAt(i));
                    if (exp.charAt(i)==('}') || exp.charAt(i)==(')') || exp.charAt(i)==(']')) {
                        if (st.isEmpty()) {
                            ans[j]="NO";
                            break;
                        } else if (!isMatchingPair(st.pop(), exp.charAt(i))) {
                            ans[j]="NO";
                            break;
                        }
                    }

                }

                if (st.isEmpty())
                    ans[j]="YES";
                else {   /*not balanced*/
                    ans[j]="NO";
                }
            }

        return ans;
    }
    public static void main(String[] args)
    {

        Scanner in=new Scanner(System.in);

    }
}