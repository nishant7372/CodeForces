package _1714B_Remove_Prefix;

import java.util.Scanner;
/*Polycarp was presented with some sequence of integers a of length n (1≤ai≤n).
A sequence can make Polycarp happy only if it consists of different numbers (i.e. distinct numbers).
In order to make his sequence like this, Polycarp is going to make some (possibly zero) number of moves.

In one move, he can:
remove the first (leftmost) element of the sequence.

For example, in one move, the sequence [3,1,4,3] will produce the sequence [1,4,3],
which consists of different numbers.

Determine the minimum number of moves he needs to make so that in the remaining sequence
all elements are different. In other words, find the length of the smallest prefix
of the given sequence a, after removing which all values in the sequence will be unique.*/

public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt(); //testcases
        while(t-->0) {
            int n = scan.nextInt(); //size of sequence
            int[] seq = new int[n];
            for (int i = 0; i < n; i++) {
                seq[i] = scan.nextInt();
            }
            int res = solve(seq);
            System.out.println(res);
        }
    }

    private static int solve(int[] seq)
    {
        int max=0;
        for(int x:seq)
        {
            if(x>max)
                max=x;
        }
        int[] a = new int[max+1];

        for(int i=seq.length-1;i>=0;i--)
        {
            if(a[seq[i]]++==1)
            {
                return i+1;
            }
        }
        return 0;
    }
}
