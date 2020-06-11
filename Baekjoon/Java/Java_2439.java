import java.util.Scanner;

public class Java_2439 
{
        // 백준 2439번 별찍기
        public static void main(String[] args) 
    {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            sc.close();
             
            for (int i = 1; i <= n; ++i) 
            {
                for (int j = 1; j <= n - i; ++j)
                    System.out.print(" ");
                 
                for (int j = 1; j <= i; ++j) 
                    System.out.print("*");

                System.out.println(); 
            }
    }    
}