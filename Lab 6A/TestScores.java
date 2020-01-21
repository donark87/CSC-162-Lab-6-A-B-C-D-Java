//Donark Patel
//CSC 162-C1
//Lab 6A

import java.util.*;

public class TestScores
{
    private double[] scores;
    public TestScores(double [] score)throws Exception
    {
        scores = new double[score.length];

        for (int index = 0; index < score.length; index++)
        {
        	if (score[index] > 100 || score[index] < 0)
        	{
				double score1 = score[index];

				System.out.println("Invalid Score Found");

        	    throw new IllegalArgumentException("Invalid Subscript: "+(index)+
        	    								"\nInvalid Score : " +score1);
        	}
        	    scores[index] = score[index];
    	}
	}

    public double getAverage()
    {
		double total = 0.0;
		double avg;
        for (int i=0; i<scores.length; i++)
        {
			total = total+scores[i];
		}
		avg = total/scores.length;
		return avg;
    }
}