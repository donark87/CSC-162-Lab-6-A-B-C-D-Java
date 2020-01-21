//Donark Patel
//CSC 162-C1
//Lab 6B

import java.util.*;

public class InvalidTestScore extends Exception
{
 	 double score;

	public InvalidTestScore()
 	{
		score = 0;
 	}

 	public InvalidTestScore(String str)
 	{
		super(str);
 	}
}