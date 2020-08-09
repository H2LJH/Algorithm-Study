package For;

import java.util.Scanner;

public class Java_10950 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(), a = 0, b = 0;
		int[] arrNum = new int[t];
		
		for(int i = 0; i < t; ++i)
		{
			a = sc.nextInt();
			b = sc.nextInt();
			arrNum[i] = a + b;
		}
		
		for(int i=0; i < t; ++i)
			System.out.println(arrNum[i]);
		
	}
}
