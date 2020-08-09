package For;

import java.util.Scanner;

public class Java_11022 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arrNum = new int[n] , a = new int[n], b = new int[n];
		
		for(int i=0; i < n; ++i)
		{
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			arrNum[i] = a[i] + b[i]; 
		}
		
		for(int i=0; i < n; ++i)
			System.out.printf("Case #%d: %d + %d = %d\n", (i+1), a[i],b[i], arrNum[i]);
	}
}
