package Java;

import java.util.Scanner;

public class Java_2798 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		boolean check = false;
		int lineNum = 0;
		int maxNum = 0;
		int sum = 0;
		int temp = 0;
		int[] arrNum;

		while(true)
		{
			lineNum = sc.nextInt();
			maxNum = sc.nextInt();
			
			if((lineNum < 3 && lineNum > 100) && (maxNum < 10 && maxNum > 300000))
				continue;

			arrNum = new int[lineNum];
			
			break;
		}
		
		
		while(true)
		{	
			for (int i = 0; i < arrNum.length; ++i)
			{
				arrNum[i] = sc.nextInt();
				if(arrNum[i] > 100_000)
					--i;
			}
			
			for (int i = 0; i < arrNum.length; ++i) 
			{
				for (int j = 0; j < arrNum.length; ++j) 
				{
					if (arrNum[i] >= arrNum[j]) 
					{
						temp = arrNum[i];
						arrNum[i] = arrNum[j];
						arrNum[j] = temp;
					}
				}
			}
			
			for (int i = 0; i < arrNum.length-2; ++i) 
			{
				for(int j=0; j < arrNum.length-2; ++j)
				{
					sum = arrNum[i] + arrNum[i+1] + arrNum[j+2];
					if (sum <= maxNum)
					{
						check = true;
						break;
					}
				}
	
				if(check == true)
					break;
			}

			if(check == true)
			{
				System.out.println(sum);
				break;
			}
			
		}
	}
}
