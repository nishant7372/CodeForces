package Decode_String;

import java.util.Scanner;
import java.util.Stack;

//Status --> Accepted
//Tags --> Strings, Greedy
//Difficulty Rating --> 800

public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt(); //testcases

        while(t-->0)
        {
            int n = scan.nextInt(); //size of String
            String s = scan.next();
            System.out.println(decode(s));
        }
    }

    private static String decode(String s)
    {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length()-1;i++) {
            if (s.charAt(i) == '0' && s.charAt(i+1)!='0') {
                int a = (st.pop()-'0') + ((st.pop()-'0') * 10);
                st.push((char) (a + 96));
            } else {
                st.push(s.charAt(i));
            }
        }
        if (s.charAt(s.length()-1) == '0') {
            int a = (st.pop()-'0') + ((st.pop()-'0') * 10);
            st.push((char) (a + 96));
        } else {
            st.push(s.charAt(s.length()-1));
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty())
        {
            char a = st.pop();
            if(a>='0' && a<='9')
                sb.append((char)(a-'0'+96));
            else
                sb.append(a);
        }
        return sb.reverse().toString();
    }
}
