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
		
		String[] strSubjects = {"학번","국어","영어","수학"};
		String strSc = "";
		int intN = 0;
		
		for(int i=0; i<ScoreConfig.SUBJECTS + 1; ++i)
		{
			System.out.print(strSubjects[i] +" 입력 : ");
			strSc = sc.nextLine();
			
			try 
			{ intN = Integer.valueOf(strSc); }
			
			catch (Exception e) 
			{ 
				System.out.println("숫자만 입력가능");
				return false;
			}
		
			
			vo.setNum(intN);
			
			if(intN > 100 || intN < 0)
				return false;
					
			switch (i) 
			{		
				case 1: // 국어
					vo.setKor(intN);
					break;
					
				case 2: // 영어
					vo.setEng(intN);
					break;
					
				case 3: // 수학
					vo.setMath(intN);
					break;
			}
		}
	
		scoreList.add(vo);
		
		return true;
	}

	@Override
	public void calcSum() {
		
		for(ScoreVO one : scoreList)
			one.setSum(one.getKor() + one.getEng() + one.getMath());
		
	}

	@Override
	public void calcAvg() {
		for(ScoreVO one : scoreList)
			one.setAvg(one.getSum() / ScoreConfig.SUBJECTS);
	}

	@Override
	public void scoreList() 
	{
		System.out.println("=================================================");
		System.out.println("\t\t\t학생 성적 목록표");
		System.out.println("=================================================");
		System.out.print("학번\t 국어\t 영어\t 수학\t 총점\t 평균\t\n");
		for(ScoreVO one : scoreList)
		{
			System.out.print(one.getNum()  + "\t" +
							 one.getKor()  + "\t" + 
						     one.getEng()  + "\t" + 
						     one.getMath() + "\t" + 
						     one.getSum()  + "\t" + 
						     one.getAvg()  + "\n");
		}
	}

	@Override
	public void ScoreSave() 
	{
		String filePath = "src/com/biz/callor/score/config/ScoreList.txt"; 
		String txt = "";
		for(ScoreVO one : scoreList)
		{
			txt +=   one.getNum()  + "\t" +
					 one.getKor()  + "\t" + 
				     one.getEng()  + "\t" + 
				     one.getMath() + "\t" + 
				     one.getSum()  + "\t" + 
				     one.getAvg()  + "\n";
		}

		try 
		{
			BufferedWriter fw = null;
			fw = new BufferedWriter(new FileWriter(filePath, true));
            fw.write(txt);
            //fw.flush();
            fw.close();

		} 
		catch (Exception e) 
		{
			System.out.println(filePath + " 파일을 만들수 없음!");
			return;
		}
	}

}
