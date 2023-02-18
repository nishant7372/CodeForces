package Yet_Another_Array_Restoration;

import java.util.Scanner;

// Accepted
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-->0){
            int n = scan.nextInt();
            int x = scan.nextInt();
            int y = scan.nextInt();

            int[] a = solve(n,x,y);
            for(int i:a){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    private static int[] solve(int n,int x,int y){
        int[] a = new int[n];
        for (int i = 1; i <= y-x; i++) {
            for(int base=1;base<=x;base++) {
                int b = base;
                boolean first=false, second=false;
                for (int j = 0; j < n; j++) {
                    a[j] = b;
                    if (b == x) {
                        first = true;
                    }
                    if (b == y) {
                        second = true;
                    }
                    b += i;
                }
                if (first && second) {
                    return a;
                }
            }
        }
        return a;
    }
}
