package Lost_Permutation;

//Status --> Accepted
//Tags --> Math
//Difficulty Rating --> 800

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        while(t-->0)
        {
            int m = scan.nextInt();

            int s = scan.nextInt();

            int[] a = new int[m];

            for(int i=0;i<m;i++)
                a[i] = scan.nextInt();

            if(check(a,s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

    private static boolean check(int[] a,int s){
        int max=0;
        for(int x:a)
        {
            if(x>max)
                max=x;
        }

        int[] freq = new int[max+1];

        for(int x:a) {
            if(freq[x]++==1)
                return false;
        }

        int sum=0;
        int i;
        for(i=1;i<freq.length;i++)
        {
            if(freq[i]==0)
                sum+=i;
        }

        if(sum>s)
            return false;
        if(sum==s)
            return true;
        while(sum<s)
        {
            sum+=i++;
            if(sum==s)
                return true;
        }
        return false;
    }
}
