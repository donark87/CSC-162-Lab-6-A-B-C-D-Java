//Donark Patel
//CSC 162-C1
//Lab 6B

import java.util.*;

public class TestScoresDemo
{
 public static void main (String [] args) throws Exception
	{
	 	double[] badScores = {97.5, 66.7, 88.0, 101.0, 99.0};
	 	double[] goodScores = {97.5, 66.7, 88.0, 100.0, 99.0};

	 	try
	 	{
			TestScores obj = new TestScores(badScores);
	 	}
	 	catch (InvalidTestScore e)
	 	{
	 		System.out.println(e.getMessage());
	 	}

	 	try
	 	{
	 	 	TestScores obj1 = new TestScores(goodScores);
     	   System.out.println("The average is: " + obj1.getAverage());
	 	}
	 	catch(InvalidTestScore e)
	 	{
	 		System.out.println(e.getMessage());
	 	}
	 	System.out.println("\nDonark Patel");
		System.out.println("Lab CB");
	}
}