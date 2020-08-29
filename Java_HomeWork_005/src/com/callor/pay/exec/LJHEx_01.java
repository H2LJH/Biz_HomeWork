package com.callor.pay.exec;

import java.util.Scanner;

import com.callor.pay.service.LjhService;

public class LJHEx_01 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		LjhService lService = new LjhService();
		
		System.out.print("금액 입력 : ");
		int money = sc.nextInt();
		
		lService.solution(money);
		lService.list();
		
		sc.close();
	}

}
