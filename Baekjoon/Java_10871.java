import java.util.Scanner;

public class Java_10871 
{
    public static void main(String[] args) 
    {
            Scanner sc = new Scanner(System.in);

              int n = sc.nextInt();
              int x = sc.nextInt();

             if((n>=1 && n<=10000) && (x>=1 && x<=10000))
                {
                    int[] a = new int[n];
                    for(int i =0; i<a.length; ++i)
                    {
                        int c = sc.nextInt();
                        a[i] = c;
                    }

                    sc.close();

                    for(int i=0; i<a.length; ++i)
                    {
                        if(a[i] < x)
                        System.out.printf("%d ", a[i]);
                    }
                }
    }    
}