package 실습1;

import java.util.Scanner;

public class java_10817 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] arrNum = new int[3];
		
		for(int i = 0; i < arrNum.length; ++i)
			arrNum[i] = sc.nextInt();
			
		
		for(int i = 0; i < arrNum.length; ++i)
		{
			int temp = 0;
			for(int j = 0; j < arrNum.length; ++j)
			{
				if(arrNum[i] <= arrNum[j])
				{
					temp = arrNum[i];
					arrNum[i] = arrNum[j];
					arrNum[j] = temp;
				}
			}
		}
		
		System.out.println(arrNum[1]);		
	}
}
