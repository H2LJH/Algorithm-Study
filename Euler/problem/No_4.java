package problem;

// 세자리 대칭수 구하기

public class No_4 {

	public static void main(String[] args) 
	{
		StringBuffer strNum = new StringBuffer();
		int[] a = new int[2];
		for(int i = 999; i > 99; i--) 
		{
			for(int j =  999; j > 99; j--) 
			{
				strNum.setLength(0);
				if( strNum.append(i * j).toString().equals( strNum.reverse().toString() ) )
				{
					a[0] = Integer.valueOf(strNum.toString());
					a[1] = a[0] >= a[1] ? a[0] : a[1];
				}
			}
		}
		System.out.println(a[1]);
	}
}
