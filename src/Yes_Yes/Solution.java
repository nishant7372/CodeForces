package Yes_Yes;

//Status --> Accepted
//Tags --> Strings, Implementation
//Difficulty Rating --> 800
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        while(t-->0)
        {
            String s = scan.next();
            if(check(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

    private static boolean check(String s)
    {
        String t = "Yes";

        int j=0;
        if(s.startsWith("e")) {
            j=1;
        }
        else if(s.startsWith("s")) {
            j=2;
        }
            int i=0;

            while(i<s.length())
            {
                if(s.charAt(i++)!=t.charAt(j++))
                    return false;
                if(j==3)
                    j=0;
            }
            return true;
    }
}
