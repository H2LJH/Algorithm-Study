package While;

import java.util.Scanner;

public class Java_1110 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int count = 0, sum = 0, temp = n, a = 0, b = 0;

        while(sum != n)
        {
            a = temp / 10;
            b = temp % 10;
            
            if(a+b < 10)
            	sum = b*10 + (a+b);
            else
            	sum = b*10 + ((a+b) % 10);
            
            temp = sum;
            count++;
        }
        System.out.println(count);
    }
}