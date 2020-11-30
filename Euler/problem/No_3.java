package problem;

public class No_3 {

	public static void main(String[] args) {
		
		
		long num = 600851475143L;
		long value = 0;
		
		for(long i = 1; i <= num; ++i) 
		{			
			if(num % i == 0) 
			{
				value = i;
				num /= i;
			}
		}
		
		System.out.println(value);
	}
}
