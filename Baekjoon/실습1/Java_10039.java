package 실습1;

import java.util.Scanner;

public class Java_10039 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] numArr = new int[5];
		int sum = 0;
		int avg = 0;
		
		for(int i=0; i<numArr.length; ++i)
			numArr[i] = sc.nextInt();
		
		for(int i=0; i<numArr.length; ++i)
			if(numArr[i] < 40)
				numArr[i] = 40;
		
		for(int i=0; i<numArr.length; ++i)
			sum += numArr[i];
		
		avg = sum / numArr.length;
		System.out.println(avg);
	}
}
