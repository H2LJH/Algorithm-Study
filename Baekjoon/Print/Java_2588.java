package Print;

import java.util.Scanner;
// import java.util.Random;


public class Java_2588 
{
	public static void main(String[] args) 
	{
		// 랜덤 함수 쓰면 백준 채점에서 오답으로 나옴.
		// Random rnd = new Random();
		// int a = rnd.nextInt(900)+100;
		// int b = rnd.nextInt(900)+100;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println((b % 10) * a);
		System.out.println((b % 100) / 10 * a);
		System.out.println((b / 100) * a);
		System.out.println(a * b);
		sc.close();
	}
}
