package If;

import java.util.Scanner;

public class Java_2884 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(), m = sc.nextInt();		
		sc.close();
		
		if(m > 45)
			m -= 45;
		
		else 		   
		  {
			h--;
			m = 60 - (45 - m);
			if(h < 0)
				h = 23;
		  }
		  
		System.out.printf("%d %d", h, m);
	}
}
