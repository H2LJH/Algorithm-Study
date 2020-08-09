package BruteForce;

import java.util.Scanner;

public class Java_2798 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] arrNum;
		int lineNum = 0;
		int maxNum = 0;
		int sum = 0;
		
		while(true)
		{
			lineNum = sc.nextInt();
			maxNum = sc.nextInt();
			
			if((lineNum < 3 && lineNum > 100) && (maxNum < 10 && maxNum > 300000))
				continue;
			
			arrNum = new int[lineNum];
			
			for (int i = 0; i < arrNum.length; ++i)
			{
				arrNum[i] = sc.nextInt();
				if(arrNum[i] > 100_000)
					--i;
			}
			
			break;
		}
				
		for (int i = 0; i < arrNum.length; ++i) 
		{
			for (int j = 0; j < arrNum.length; ++j) 
			{	
				int temp = 0;
				if (arrNum[i] >= arrNum[j]) 
				{
					temp = arrNum[i];
					arrNum[i] = arrNum[j];
					arrNum[j] = temp;
				}
			}
		}
	}
}
