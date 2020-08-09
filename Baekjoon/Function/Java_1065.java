package Function;

import java.util.Scanner;

public class Java_1065 
{
    int n = 1001;
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while(true)
        {
            n = sc.nextInt();
            if(n <= 1000)
                break;
        }
        sc.close();
        int checkHansu = hansu(n);
        System.out.println(checkHansu);
    }    

    public static int hansu(int n)
    {
        int[] arrChecks = new int[3];
        int count = 0;
            if(n < 100)
               return  count = n;
               
            else
            {          
                count = 99;      
                for(int i=100; i<=n; ++i)
                {
                    arrChecks[0] = i / 100;
                    arrChecks[1] = (i / 10) % 10;
                    arrChecks[2] = i % 10;
                    
                    if((arrChecks[0] - arrChecks[1]) ==  arrChecks[1] - arrChecks[2])
                        count++;
                }
            return count;
        }

    }
}
