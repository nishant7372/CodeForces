package Minimum_Product;

import java.util.Scanner;

// Accepted
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int x = scan.nextInt();
            int y = scan.nextInt();
            int n = scan.nextInt();

            System.out.println(Math.min(solve(a,b,x,y,n),solve2(a,b,x,y,n)));
        }
    }

    private static long solve(int a,int b,int x,int y,int n){
        int temp = a;
        a-=Math.min(n,a-x);
        n-=Math.min(n,temp-x);
        if(n>0){
            b-=Math.min(n,b-y);
        }
        return (long)a*b;
    }

    private static long solve2(int a,int b,int x,int y,int n){
        int temp=b;
        b-=Math.min(n,b-y);
        n-=Math.min(n,temp-y);
        if(n>0){
            a-=Math.min(n,a-x);
        }
        return (long)a*b;
    }
}
