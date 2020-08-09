package String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java_2675 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		List<String> strList = new ArrayList<String>() ;
		String s = "";
		String strTemp = "";
		int t = 0;
		int r = 0;
		int count = 0;
		
		while(true)
		{
			t = sc.nextInt();
			if(t >= 1 || t <= 1000)
				break;
		}
		
		while(count < t)
		{
			r = sc.nextInt();
			if(r < 1 || r > 8)
				continue;
			
			for(int i=0; i<=1; ++i)
			{
				s = sc.next();
				if(s.length() < 1 || s.length() > 20)
				{
					--i;
					continue;
				}
				s = s.replace(" ", "");
				break;
			}
			
			for(int i=0; i< s.length(); ++i)
			{
				for(int j=0; j<r; ++j)
					strTemp += s.charAt(i);
			}
			strList.add(strTemp);
			strTemp = "";
			count++;
		}
		
		for(String a : strList)
				System.out.println(a);
		
		sc.close();
	}
}
