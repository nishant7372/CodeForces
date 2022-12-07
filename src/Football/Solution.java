package Football;

//Status --> Accepted
//Tags --> Strings, Implementation
//Difficulty Rating --> 900

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.next();
            if(isDangerous(s))
                System.out.println("YES");
            else
                System.out.println("NO");
    }

    private static boolean isDangerous(String s)
    {
        int c=0;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
                c++;
            else {
                if(c>=6)
                    return true;
                c=0;
            }
        }
        return c>=6;
    }
}
