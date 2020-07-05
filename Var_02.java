import java.util.Random;
import java.util.Scanner;

public class Var_02 
{
    /*
        1. 정수형 변수 num을 선언하고 초기화 하시오.
        2. 임의의 정수를 변수에 저장
        3. 변수에 저장된 값에 55를 곱하여 또 다른 변수 result를 선언하여 저장
        4. 최종 결과값을 console에 출력
    */

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // Random rnd = new Random();
        // int num = rnd.nextInt() * 55;
        int num = sc.nextInt() * 55;
        int result = num;
        System.out.println("result :" + result);
        sc.close();
    }
}