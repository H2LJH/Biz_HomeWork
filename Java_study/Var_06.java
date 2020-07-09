public class Var_06 
{
    // 1. 1-100까지 범위의 숫자중 3의 배수를 찾고 3의 배수들의 합을 구하여 Console에 출력
    public static void main(String[] args) 
    {
        int sum = 0;
        for(int i=1; i<=100; i++)
        {
            if(i % 3 == 0)
                sum += i;
        }    
        System.out.println(sum);
    }
}