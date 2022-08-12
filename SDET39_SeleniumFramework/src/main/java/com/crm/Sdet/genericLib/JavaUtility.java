package com.crm.Sdet.genericLib;

import java.util.Date;
import java.util.Random;

public class JavaUtility {
	
	/*This method is used for concatenate to Excel data 
	 * *author surbhi
	 */
	
		public int getRandomNum() {
			
			Random ran=new Random();
			int ranNum = ran.nextInt(1000);
			return ranNum;
		}
	/*	public String getSystemDate() {
			Date date=new Date();
			String currentDate=date.toString();
			System.out.println(currentDate);
			currentDate.split(" ");
			
			String yyyy =  arr[5];
			int mm=date.getMonth()+1;
			String formate=yyyy+"-"+mm+"-"+dd;
			return formate;
			*/
			
		}
	




