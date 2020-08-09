package If;

import java.util.Scanner;

public class Java_2573 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int  intYear = sc.nextInt();

		if(intYear % 4 == 0 && (intYear % 400 == 0  || intYear % 100 != 0))
			System.out.println("1");
		
		else
			System.out.println("0");
		
	}
}
