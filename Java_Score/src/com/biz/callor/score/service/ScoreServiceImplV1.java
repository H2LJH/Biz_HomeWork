package com.biz.callor.score.service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.callor.score.config.ScoreConfig;
import com.biz.callor.score.domain.ScoreVO;

public class ScoreServiceImplV1 implements Scoreinterface 
{
	List<ScoreVO> scoreList;
	
	
	public ScoreServiceImplV1() 
	{
		scoreList = new ArrayList<ScoreVO>();
	}
	
	@Override
	public boolean inputScore() 
	{
		Scanner sc = new Scanner(System.in);
		ScoreVO vo = new ScoreVO();
		String strSc = "";
		int intNum = 0;

		System.out.print("학번 입력 : ");
		strSc = sc.nextLine();
		vo.setNum(strSc);

		for(int i=0; i < ScoreConfig.SUBJECTS; ++i)
		{
			System.out.print(ScoreConfig.ARR_SUBJECTS[i] +" 입력 : ");
			strSc = sc.nextLine();

			try 
			{ intNum = Integer.valueOf(strSc); }
			
			catch (Exception e) 
			{ 
				System.out.println("숫자만 입력가능");
				return false;
			}
		
			if(intNum > 100 || intNum < 0)
				return false;

			else if(ScoreConfig.ARR_SUBJECTS[i].equals("국어"))
				vo.setKor(intNum);
					
			else if(ScoreConfig.ARR_SUBJECTS[i].equals("영어"))
				vo.setEng(intNum);
					
			else if(ScoreConfig.ARR_SUBJECTS[i].equals("수학"))
				vo.setMath(intNum);
		}
		
		scoreList.add(vo);
		return true;
	}

	@Override
	public void calcSum() 
	{	
		for(ScoreVO one : scoreList)
			one.setSum(one.getKor() + one.getEng() + one.getMath());	
	}

	@Override
	public void calcAvg() 
	{
		for(ScoreVO one : scoreList)
			one.setAvg((float)(one.getSum()) / ScoreConfig.SUBJECTS);
	}

	@Override
	public void scoreList() 
	{
		System.out.println("=================================================");
		System.out.println("\t\t학생 성적 목록표");
		System.out.println("=================================================");
		System.out.print("학번\t국어\t영어\t수학\t총점\t평균\t\n");
		for(ScoreVO one : scoreList)
		{
			System.out.print(one.getNum()  + "\t" +
							 one.getKor()  + "\t" + 
						     one.getEng()  + "\t" + 
						     one.getMath() + "\t" + 
						     one.getSum()  + "\t" + 
							 one.getAvg()  + "\n");
			System.out.println("=================================================");
		}
	}

	@Override
	public void ScoreSave() 
	{
		BufferedWriter fw = null;
		String filePath = "src\\com\\biz\\callor\\score\\config\\ScoreList.txt"; 
		String txt = "";
		
		for(ScoreVO one : scoreList)
		{
			txt += one.getNum()  + "\t\t" +
				   one.getKor()  + "\t\t" + 
				   one.getEng()  + "\t\t" + 
				   one.getMath() + "\t\t" + 
				   one.getSum()  + "\t\t" + 
				   one.getAvg()  + "\n============================================\n";
		}

		try 
		{
			fw = new BufferedWriter(new FileWriter(filePath, true));
            fw.write(txt);
            fw.flush();
            fw.close();
		} 
		
		catch (Exception e) 
		{
			System.out.println(filePath + " 파일을 만들수 없음!");
			return;
		}
	}

}
