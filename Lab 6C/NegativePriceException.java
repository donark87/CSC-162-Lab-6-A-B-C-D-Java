//Donark Patel
//CSC 162-C1
//Lab 6C

import java.util.*;

public class NegativePriceException extends Exception
{
	double money;

	public NegativePriceException()
	{
		money = 0;
	}

	public NegativePriceException(double money)
	{
		super("Error: Negative Number Given For Price: ");
	}
}