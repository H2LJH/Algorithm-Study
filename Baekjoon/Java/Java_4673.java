package Java;

public class Java_4673 
{
    public static void main(String[] args)
    {
        boolean[] NotSelfNumber = new boolean[10001];
         
        for (int i = 1; i <= 10000; ++i) 
        {
            int dn = getDn(i);
            if (dn <= 10000) 
                NotSelfNumber[dn] = true;             
        }
         
        for (int i = 1; i < NotSelfNumber.length; ++i) 
        {
            if (NotSelfNumber[i] == false)
                System.out.println(i);              
        }
    }
     
    public static int getDn(int n) 
    {
        int dn = n;
        while(n > 0) 
        {
            dn += n % 10;
            n /= 10;
        }
        return dn;
    }
}

