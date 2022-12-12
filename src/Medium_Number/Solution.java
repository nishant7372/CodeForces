package Medium_Number;

//Status --> Accepted
//Tags --> Sorting, Implementation
//Difficulty Rating --> 800

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while(t-->0)
        {
            int[] a = new int[3];
            for(int i=0;i<3;i++)
                a[i]=scan.nextInt();

            Arrays.sort(a);
            System.out.println(a[1]);
        }
    }
}
