import java.util.Random;

public class Var_07 
{
    /*
        1. 임의의 이름으로 정수형 변수 선언
        2. Random 클래스를 사용하여 100~1000사이에 있는 임의의 정수를 생성하여 저장
        3. 변수에 저장된 정수값에는 10%세금이 포함되어 있습니다.
        4. 변수에 저장된 정수값에서 세금 10%를 제외한 값을 구하여 Console에 출력

        ex ) 정수값 330이면 세금 30을 제외한 300
             정수값 373이면 세금 34를 제외한 339 소수점이하 반올림하여 연산
    */    
    public static void main(String[] args) 
    {
        Random rnd = new Random();
        int a = rnd.nextInt(901)+100;
        System.out.println(a - (a / 11));        
    }
}