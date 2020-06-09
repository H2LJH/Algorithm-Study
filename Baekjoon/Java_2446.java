import java.util.Scanner;

public class Java_2446 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num  = 0;
        int num2 = 0;
        while(true)
        {
            num = sc.nextInt();
            if(num >= 1 && num <= 100)
            {
                num2 = num*2 - 1;
                break;
            }
                
        }
        sc.close();

        for(int i=0; i <= num2 / 2; ++i)
        {
            for(int j=0; j < i; ++j)
                System.out.print(" ");

            for(int j=i; j < num2-i; ++j)
                System.out.print("*");

          System.out.println();
        }

        for(int i=1; i <= num2 / 2; ++i)
        {
            for(int j=0; j < num-i-1; ++j)
                System.out.print(" ");

            for(int j=0; j < i*2+1; ++j)
                System.out.printf("*");

            System.out.println();                                    
        }
    }
    
}