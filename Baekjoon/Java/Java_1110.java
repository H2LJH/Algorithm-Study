package Java;

import java.util.Scanner;

public class Java_1110 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        int tmp =  n;
        int count = 0;

        while(true)
        {
            int a = tmp / 10;
            int b = tmp % 10;

            if(a + b < 10)
                tmp = b*10 + a + b;
            else
                tmp = b*10 + (a+b) % 10;

            count++;
            if(tmp == n)
                break;
        }
        System.out.println(count);
    }
}