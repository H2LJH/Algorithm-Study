package Java;

import java.util.Scanner;

public class Java_1546
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrScore = new int[n];
        int maxNum = 0;
        int sum = 0;
        double avg = 0;

        for(int i = 0; i<n; ++i)
            arrScore[i] = sc.nextInt();

        sc.close();

        for(int i=0; i<arrScore.length; ++i)
        {
            if(maxNum <= arrScore[i])
                maxNum = arrScore[i];   
        }
    
        for(int i=0; i<arrScore.length; ++i)
            sum += arrScore[i];



        avg = ((sum * 100) / maxNum) / arrScore.length;
        System.out.printf("%.2f", avg); // 소수점 n자리까지 출력하는 방법 몰라 검색함 소수점 2번째 자리까지 반올림함
    }
}