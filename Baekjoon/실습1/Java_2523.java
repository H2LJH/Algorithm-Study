package 실습1;

import java.util.Scanner;

public class Java_2523 
{
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
        int num  = 0;
        while(true)
        {
            num = sc.nextInt(); 

            if(num >= 1 && num <= 100)
                break;
        }
        sc.close();
        for (int i=0; i<=2*num-1; i++)
        { 
            if (i<=num)
            { 
                for(int j=0; j<i; j++) 
                    System.out.print("*");

                System.out.println(); 
            }
            else
            { 
                for(int j=0; j<2*num-i; j++) 
                    System.out.print("*"); 

                System.out.println(); 
            } 
        }

    }
}