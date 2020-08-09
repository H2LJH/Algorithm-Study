package Array;

import java.util.Scanner;

public class Java_2562 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
    
        
           int total = 9;
           int[] arr_num = new int [total];
           int num = 0;
           int count = 0;
           
           for(int i=0; i<arr_num.length; ++i)
               arr_num[i] = sc.nextInt();
       
           sc.close();
           num = arr_num[0];
           
           for(int i=0; i<arr_num.length; ++i)
               {	
                   if(num  < arr_num[i])
                   {
                       count  = i;
                       num = arr_num[i];
                   }
               }
       System.out.println(num);	
       System.out.println(count+1);
    }
}