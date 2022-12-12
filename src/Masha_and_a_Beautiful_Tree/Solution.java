package Masha_and_a_Beautiful_Tree;

//Status:Accepted
//Tags: dfs and similar,divide and conquer,graphs,sorting,trees
//Difficulty Rating: 1300

import java.util.Scanner;
public class Solution {
    private static int swaps=0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        while(t-->0)
        {
            int n = scan.nextInt();
            swaps=0;
            int[] a = new int[n];

            for(int i=0;i<n;i++)
                a[i]=scan.nextInt();

            if(!solve(a,0,n-1))
                System.out.println(-1);
            else
                System.out.println(swaps);
        }
    }


    private static boolean solve(int[] a,int l,int r)
    {
        if(r-l<1)
            return true;
        int m = (l+r)/2;

        solve(a,l,m);
        solve(a,m+1,r);
        return count(a, l, m, r);
    }


    private static boolean count(int[] a,int l,int m,int r)
    {
        if(a[l]>a[m+1])
            swaps++;
        int[] temp = new int[r-l+1];
        int i=l;
        int j=m+1;
        int k=0;
        for(int idx=l;idx<r;idx++)
        {
            if(a[idx+1]-a[idx]>1)
                return false;
        }
        while(i<=m && j<=r) {
            if (a[i] > a[j])
                temp[k++] = a[j++];
            else
                temp[k++] = a[i++];
        }

        while(i<=m) {
            temp[k++] = a[i++];
        }
        while(j<=r) {
            temp[k++] = a[j++];
        }
        k=0;
        for(int idx=l;idx<=r;idx++)
        {
            a[idx]=temp[k++];
        }
        return true;
    }

}
