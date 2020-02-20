package com.manikanth.cleanCodeSerialization;

import java.util.*;
import java.io.*;
import java.lang.Math;



public class intrestCalculator {

	double principalAmount;
    double rateOfInterest;
    double timeInYears;
    BufferedWriter out;
    Scanner s;
    public void calculateInterest() throws IOException
	{
		try
		{
    	s=new Scanner(System.in);
		    out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out),"ASCII"),512);
			out.write("Enter principal amount : ");
			out.flush();
			principalAmount=s.nextDouble();
			out.write("Enter rate of interest per annum : ");
			out.flush();
			rateOfInterest=s.nextDouble();
			out.write("Enter time in years : ");
			out.flush();
			timeInYears=s.nextDouble();
			
			 double simple_interest=(principalAmount*timeInYears*rateOfInterest)/100;
			 out.write("Simple interest = "+simple_interest+"\n");
			 out.flush();
			 out.write("===========================================================\n");
			 out.flush();
			 
			 out.write("To calculate compound interest enter number of times interest applied per time period : ");
		     out.flush();
		     int no_interest_applied=s.nextInt();
			 double final_amount=principalAmount*(Math.pow(1+rateOfInterest/(no_interest_applied*100),no_interest_applied*timeInYears));
			 out.write("Compound interest = "+(final_amount-principalAmount)+"\n");
			 out.flush();
			 out.write("===========================================================\n");   
			 out.flush();
	}
		catch(Exception e)
		{
			out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out),"ASCII"),512);
			out.write("Exception arised,please give valid input");
			out.flush();
		}
	}
	
	
}
