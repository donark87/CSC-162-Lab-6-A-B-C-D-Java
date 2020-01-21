//Donark Patel
//CSC 162-C1
//Lab 6B

public class TestScores
{
 	double[] scores;

 	public TestScores(double[] score) throws InvalidTestScore
 	{
 		 scores = new double[score.length];

 		 for (int index = 0; index < score.length; index++)
 		 {
 		    if (score[index] > 100 || score[index] < 0)
 	   	 	{
	 	 		System.out.println("Invalid Score Found");
	 			throw new InvalidTestScore("The Subscript Is: "+(index)+
        	    								"\nInvalid Score Is: " +score[index]);
	     	}
		    else
 			{
	 			scores[index] = score[index];
			}
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
