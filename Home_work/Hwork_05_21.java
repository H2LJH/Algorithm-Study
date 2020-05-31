
import java.util.Random;

public class Hwork_05_21
{
    // 임의숫자를 50~99 까지의 숫자를 출력
    public static void main(String[] args)
    {
        Random rnd = new Random();
        int a = rnd.nextInt(50)+50;
        System.out.println("a의 값 : " + a);
        
    }
}