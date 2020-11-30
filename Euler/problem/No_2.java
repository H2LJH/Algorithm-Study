package problem;

public class No_2 {

	public static void main(String[] args) {
			
		int sum = 0;
        int temp1= 0;
        int temp2 = 1; 
        		
		for(int i=0; i < 4_000_000;) {
			
			i = temp1 + temp2;
			temp1 = temp2;
			temp2 = i;
			
			if(i % 2 == 0)
				sum += i;
		}
		
		System.out.println(sum);
	}
}
