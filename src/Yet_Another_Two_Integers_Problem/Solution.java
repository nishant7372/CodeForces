package Yet_Another_Two_Integers_Problem;

import java.util.Scanner;

// Accepted
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            int a = scan.nextInt();
            int b = scan.nextInt();

            System.out.println(a==b? 0: (Math.abs(a-b)-1)/10+1);

        }
    }
}
