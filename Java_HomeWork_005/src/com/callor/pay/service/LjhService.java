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
			ans = temp / money[i];
			moneyList[i] = ans;
			temp %= money[i];
		}
	}
	
	public void list()
	{
		System.out.println("=====================");
		System.out.printf("5만원권 : %d\n1만원권 : %d\n5천원권 : %d\n1천원권 : %d\n5백원권 : %d\n1백원권 : %d\n50원권  : %d\n10원권  : %d\n", moneyList[0],moneyList[1],
																																			  moneyList[2],moneyList[3],
																																			  moneyList[4],moneyList[4],
																																			  moneyList[5],moneyList[6]);
		System.out.println("=====================");
	}
	
	
}
