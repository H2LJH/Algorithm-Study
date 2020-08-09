package Array;

import java.util.Scanner;

public class Java_3052 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int totalNum = 1001;
        int max   = 10;
        int count = 0;
        int[] arrNum = new int[totalNum];

        for(int i=0; i<max; ++i)
            arrNum[ sc.nextInt() % 42]++;

        sc.close();

        for(int i=0; i<totalNum; ++i)
        {
            if(arrNum[i] > 0)
                count++;
        }            
        System.out.println(count);
    
    }    
}