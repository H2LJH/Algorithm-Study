package Java;

import java.util.Arrays;
import java.util.Scanner;

public class Java_5543 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] ham = new int[3];
		int[] jueci = new int[2];
		int sum = 0;
		
		for(int i = 0; i<ham.length; ++i)
			ham[i] = sc.nextInt();
		
		for(int i = 0; i<jueci.length; ++i)
			jueci[i] = sc.nextInt();
        
        sc.close();
		Arrays.sort(ham);
		Arrays.sort(jueci);
		
		sum = (ham[0] + jueci[0]) - 50;
		
		System.out.println(sum);
		
	}
}