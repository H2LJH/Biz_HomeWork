public class Var_03 
{
    /*
        1. 정수형 변수 num1 선언하고 임의의 정수를 저장
        2. num1에 저장된 값이 짝수인지 홀수인지 판별하여 Console에 출력
    */    
    public static void main(String[] args) 
    {
        int num1 = 43523457;
        if(num1 % 2 == 0)
            System.out.println("num1은 짝수");
        else
            System.out.println("num1은 홀수");
    }
}