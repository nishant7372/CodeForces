package Two_Towers;

import java.util.Scanner;

// Accepted
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        while(t-->0){
            int a = scan.nextInt();
            int b = scan.nextInt();
            String s = scan.next();
            String p = scan.next();

            int c=0;
            for(int i=0;i<s.length()-1;i++){
                if(s.charAt(i)==s.charAt(i+1)){
                    c++;
                }
            }

            for(int i=0;i<p.length()-1;i++){
                if(p.charAt(i)==p.charAt(i+1)){
                    c++;
                }
            }

            if(c>1){
                System.out.println("NO");
            }
            else {
                if(c==0){
                    System.out.println("YES");
                }
                else if(c==1 && s.charAt(a-1)!=p.charAt(b-1))
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }

    }
}
