package For;

import java.util.Scanner;

public class Java_11021 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arrNum = new int[n];
		
		for(int i=0; i < n; ++i)
		{
			int a = sc.nextInt(), b = sc.nextInt();
			arrNum[i] = a + b;
		}
		
		for(int i=0; i < n; ++i)
			System.out.println("Case #" + (i+1) + ": " + arrNum[i]);
	}
}
