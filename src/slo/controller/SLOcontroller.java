package slo.controller;

import java.util.Scanner;

public class SLOcontroller 
{
	private Scanner dataScanner;
	
	public void start() 
	{
		this.makeUserData();
		this.compareData();
	}	
	
	public SLOcontroller()
	{
		dataScanner = new Scanner(System.in);
	}
	
	private void makeUserData()
	{
		int userAge = 17;
		double userHeight = 5.6;
		String userName = "jacob";
		
		System.out.println("What is his age");
		userAge = dataScanner.nextInt();
		System.out.println("What is his height?");
		System.out.println("X.X");
		userHeight = dataScanner.nextDouble();
		System.out.println("What is his name");
		userName = dataScanner.nextLine();
	}
	
	private void compareData()
	{
		int userAge = 17;
		double userHeight = 5.6;
		String userName = "jacob";
		
		if(userAge == 17)
		{
			System.out.println("Correct!");
		}
		else if(userAge != 17)
		{
			System.out.println("Incorrect!");
		}
		
		if(userHeight == 5.6)
		{
			System.out.println("Correct!");
		}
		else if(userHeight != 5.6)
		{
			System.out.println("Incorrect!");
		}
		
		if(userName == "jacob")
		{
			System.out.println("Correct!");
		}
		else if(userName != "jacob")
		{
			System.out.println("Incorrect!");
		}
	}
}

