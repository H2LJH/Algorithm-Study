package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Java_10818 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int[] num = new int[total];

        for(int i=0; i<num.length; ++i)
           num[i] = sc.nextInt();

        sc.close();

        Arrays.sort(num);
        
        System.out.println(num[0] + " " + num[total-1]);
    }    
}