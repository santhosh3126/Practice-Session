/*
Date : 05-12-2022
topic : Voting Evaluation
Dveloped By:Name
Quiz:
*/

import java.util.*;
class Manager
{

	public static void main(String[]args)
	{
		
		int agelimit=18;//set liimitaion value
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age : ");
		//get age value from input
		int age = sc.nextInt();
		
		String votingEligibility;
		//checking eligibilty critiria
		if(agelimit < age)
		{
			votingEligibility="Your eligible for the voting";
		}
		else{
			votingEligibility="Your not eligible for the vote";	
		}
		
		System.out.println("voting Eligibility check : "+votingEligibility);
		
		
		
		/*
		if(true){
		//stmt
		}
			the condition true if will execute the condition is false if will not execute 
		*/
		
		System.out.println("Begin");
		
		/*
		if(false)
		{
			System.out.println("From if");
		}*/
		System.out.println("END");
		
		
		
	}
	
}