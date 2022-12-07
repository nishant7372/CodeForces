package Permutation_Sort;

//Status --> Accepted
//Tags --> Constructive Algorithms, Greedy
//Difficulty Rating --> 900

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int t = scan.nextInt();

        while(t-->0)
        {
            int n = scan.nextInt();

            int[] a = new int[n];

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for(int i=0;i<n;i++) {
                a[i] = scan.nextInt();
                if(a[i]<min)
                    min=a[i];
                if(a[i]>max)
                    max=a[i];
            }

            int[] b = Arrays.copyOf(a,a.length);
            Arrays.sort(b);
            if(Arrays.equals(b,a))
                System.out.println(0);
            else if(a[0]==min || a[a.length-1]==max)
                System.out.println(1);
            else if(a[0]==max && a[a.length-1]==min)
                System.out.println(3);
            else
                System.out.println(2);
        }
    }
}
