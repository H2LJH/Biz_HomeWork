/*
    1. 2개의 정수형 변수 num1, num2를 선언 하고 각각 30과 40을 저장
    2. 두 변수에 저장된 값으로 사칙 연산을 수행하고 결과를 console에 출력
*/

public class Var_01 
{ 
    public static void main(String[] args) 
    {
        calculation(30, 40);
    }

    private static void calculation(int a, int b)
    {
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
    }
}