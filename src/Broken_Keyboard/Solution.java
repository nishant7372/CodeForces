package Broken_Keyboard;

//Status --> Accepted
//Tags --> Greedy
//Difficulty Rating --> 800
import java.util.Scanner;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        while(t-->0)
        {
            int n = scan.nextInt();
            String s = scan.next();

            if(check(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

    private static boolean check(String s)
    {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(st.isEmpty() || st.peek()!=s.charAt(i))
                st.push(s.charAt(i));
            else if(st.size()==2 && st.peek()==s.charAt(i)) {
                    st.pop();
                    st.pop();
            }
            else {
                st.push(s.charAt(i));
            }
        }
        return st.size()<=1;
    }
}
