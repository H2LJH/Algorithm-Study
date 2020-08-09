package Array;

import java.util.Scanner;

public class Java__8958 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strCasec = new String[n];
        int count = 0;
        int total = 0;
        
        for(int i =0; i<n; i++)
            strCasec[i] = sc.next();
        
        sc.close();
        
        for(String OXresult : strCasec)
        {
            count = 0;
            total = 0;
            
            for(int i=0; i< OXresult.length(); ++i)
            {
                if(OXresult.charAt(i) == 'O')
                    total += ++count;
                else
                    count = 0;
            }
         System.out.println(total);
        }
    }
}