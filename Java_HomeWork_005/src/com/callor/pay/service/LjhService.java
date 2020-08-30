package com.callor.pay.service;

/*
 * 이정현 리팩토링
 */

public class LjhService 
{
	private final int[] money = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
	private int[] moneyList;
	
	public LjhService() 
	{
		moneyList = new int[money.length];
	}
		
	public void solution(int pay) 
	{
		int ans = 0;
		int temp = 0;
		temp = (pay / 10) * 10;
		
		for(int i=0; i <money.length; ++i)
		{
			if(temp <= 0)
			   break;
			
			ans = temp / money[i];
			moneyList[i] = ans;
			temp %= money[i];
		}
	}
	
	public void list()
	{
		System.out.println("=====================");
		for(int i=0; i<moneyList.length; ++i)
			System.out.printf("%d원 권 : %d\n", money[i], moneyList[i]);
		System.out.println("=====================");
	}
	
	
}
