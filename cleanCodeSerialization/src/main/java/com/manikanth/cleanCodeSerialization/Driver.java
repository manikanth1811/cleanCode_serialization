package com.manikanth.cleanCodeSerialization;


import java.io.*;
import java.io.IOException;



public class Driver 
{
	public static void main(String[] args) throws IOException
	{
		intrestCalculator interest_obj = new intrestCalculator();
		interest_obj.calculateInterest();
		houseConstructionCost house_obj= new houseConstructionCost();
		house_obj.costCalculation();
	}
}
