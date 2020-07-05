public class Var_08 
{
    // 2~100까지의 정수 중에 소수인 정수들을 Console에 출력
    public static void main(String[] args) 
    {
      for(int i=2; i<=100; i++)
      {
        for(int j=2; j<=i; ++j)
        {
          if(i != j && i % j == 0)
            break;
  
          if(i == j && i % j == 0)
          {
            System.out.println("소수 : " + i);
            break;
          }
        }
     }
    }
}