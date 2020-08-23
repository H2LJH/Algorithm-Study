package BruteForce;

import java.util.Scanner;

public class Java_2798 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] arrCard;
		int maxCards = 0;
		int maxNum = 0;
		int sum = 0;
		
		maxCards = sc.nextInt();
		maxNum = sc.nextInt();
		arrCard = new int[maxCards];

		for (int i = 0; i < arrCard.length; ++i)
			arrCard[i] = sc.nextInt();
		
		for(int i=0; i < maxCards-2; ++i)
		{
			int temp;
			for(int j=i+1; j < maxCards-1; ++j)
			{
				for(int k=j+1; k < maxCards; ++k)
				{
					temp = arrCard[i]+arrCard[j]+arrCard[k];
					if(temp > sum && temp <= maxNum)
						sum = temp;
				}
			}
		}
		System.out.println(sum);
		sc.close();
	}
}
