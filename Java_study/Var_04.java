import java.util.Random;

public class Var_04 
{
    /*
        1. 임의의 이름으로 정수형 변수 1개를 선언
        2. 1-100중에서 임의의정수 1개를 변수에 저장
        3. 변수에 저장된 값이 3의 배수, 또는 5의 배수인지 판별하여 console에 출력
    */
    public static void main(String[] args) 
    {
        Random rnd = new Random();
        int n = rnd.nextInt(100)+1;

        if(n % 3 == 0)
            System.out.println("n은 3의 배수");

        else if(n % 5 == 0)
            System.out.println("n은 5의 배수");
        
        else
            System.out.println("n은 3의 배수 or 5의 배수가 아닙니다. : " + n);
    }    
}