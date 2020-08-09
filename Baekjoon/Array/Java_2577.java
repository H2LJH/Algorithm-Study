package Array;

import java.util.Scanner;

public class Java_2577 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] checkNumArr = new int[10];
		int a = sc.nextInt(), b  = sc.nextInt(), c = sc.nextInt();
		int sum = a * b * c;
		
		while(sum != 0)
		{
			checkNumArr[sum % 10]++;
			sum /= 10;
		}
		
		for(int one : checkNumArr)
			System.out.println(one);
	}
}
