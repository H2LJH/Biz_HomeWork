package com.callor.pay.service;

/*
 * 이정현 리팩토링
 */

public class LjhService 
{
	private final int[] moneyArr = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
	private int[] moneyListArr;
	
	public LjhService() 
	{
		moneyListArr = new int[moneyArr.length];
	}
		
	public void solution(int pay) 
	{
		int ans = 0;
		int temp = 0;
		temp = (pay / 10) * 10;
		
		for(int i=0; i <moneyArr.length; ++i)
		{
			if(temp <= 0)
			   break;
			
			ans = temp / moneyArr[i];
			moneyListArr[i] = ans;
			temp %= moneyArr[i];
		}
	}
	
	public void list()
	{
		System.out.println("=====================");
		for(int i=0; i<moneyListArr.length; ++i)
			System.out.printf("%d원 권 : %d\n", moneyArr[i], moneyListArr[i]);
		System.out.println("=====================");
	}
	
	
}
