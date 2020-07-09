package com.biz.callor.score.exec;

import java.util.Scanner;

import com.biz.callor.score.service.ScoreServiceImplV1;
import com.biz.callor.score.service.Scoreinterface;

public class ScoreEx_01 
{
	public static void main(String[] args) 
	{
		Scoreinterface scoreService = new ScoreServiceImplV1();
		Scanner sc = new Scanner(System.in);
		String str;
		int n = 0;
		while(true)
		{
			System.out.println("======================================");
			System.out.print("1, 성적 입력\n"  + "2, 성적 출력\n");
			System.out.println("======================================");
			System.out.print("메뉴 선택(end 입력시 종료) : ");
			str = sc.nextLine();
			
			if(str.equalsIgnoreCase("end"))
				break;
			
			try 
			{ n = Integer.valueOf(str); } 
			catch (Exception e) 
			{
				System.out.println("잘못 입력 하셨습니다.");
				continue;
			}
		
			switch (n) 
			{
			case 1:
				while(!scoreService.inputScore()) {}
				scoreService.calcSum();
				scoreService.calcAvg();
				scoreService.ScoreSave();
				continue;

			case 2:
				scoreService.scoreList();
				break;
			}
			
		}
		
		sc.close();
	}
}
