package While;

import java.util.Scanner;

public class Java_10952 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        while(true)    
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a+b;
            
            if(a == 0 && b == 0)
                break;

            else 
                System.out.println(c);
        }
        sc.close();
    }    
}