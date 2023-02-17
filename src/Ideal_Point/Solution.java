package Ideal_Point;

import java.util.ArrayList;
import java.util.Scanner;

// Accepted
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        while(t-->0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[] a = new int[50];
            ArrayList<int[]> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int left = scan.nextInt();
                int right = scan.nextInt();
                list.add(new int[]{left, right});
            }
            System.out.println(check(list, k) ? "YES" : "NO");
        }
    }

    private static boolean check(ArrayList<int[]> list,int k){
        for(int[] x:list){
            for(int[] y:list){
                if(x[1]==k && y[0]==k){
                    return true;
                }
                if(x[0]==k && x[1]==k)
                    return true;
            }
        }
        return false;
    }
}
