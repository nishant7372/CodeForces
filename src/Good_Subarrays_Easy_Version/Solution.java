package Good_Subarrays_Easy_Version;

import java.util.Scanner;

// Rating -> 1300
// Accepted
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        while(t-->0){
            int n = scan.nextInt();
            int[] a = new int[n];

            for(int i=0;i<n;i++)
            {
                a[i] = scan.nextInt();
            }
            System.out.println(count(a));
        }

    }

    private static long count(int[] a){
        int j=0;
        int k=1;
        int i=0;
        int n = a.length;
        long sum=0;
        while(i<n){
            if(a[i]>=k){
               i++;
               k++;
            }
            else {
                while (a[i] < k) {
                    j++;
                    k--;
                }
                i++;
                k++;
            }
            sum+=(i-j);
        }
        return sum;
    }
}
