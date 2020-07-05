import java.util.Random;

public class Var_05 
{
    /*
        1. 정수형 변수 num1, num2 선언
        2. Random 클래스를 이용하여 1-100까지 중의 임의의 정수를 생성하여 num1과 num2에 저장
        3. num1과 num2를 사칙 연산 수행후 각 결과가 짝수인지 판별하여 console에 출력
    */
    public static void main(String[] args) 
    {
        Random rnd = new Random();
        int num1 = rnd.nextInt(100)+1, 
            num2 = rnd.nextInt(100)+1;
        
            System.out.print(num1 + "" + num2);
            if((num1+num2) % 2 == 0)
                System.out.println("num1+num2 값은 짝수 : " + (num1 + num2));
            
            if((num1-num2) % 2 == 0)
                System.out.println("num1-num2 값은 짝수 : " + (num1 - num2));

            if((num1*num2) % 2 == 0)
                System.out.println("num1*num2 값은 짝수 : " + (num1 * num2));

            if((num1/num2) % 2 == 0)
                System.out.println("num1/num2 값은 짝수 : " + (num1 / num2));

    }    
}