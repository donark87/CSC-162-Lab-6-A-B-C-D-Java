//Donark Patel
//CSC 162-C1
//Lab 6C

import java.util.*;

public class NegativeUnitsException extends Exception
{
	int units;

	public NegativeUnitsException()
	{
		units = 0;
	}

	public NegativeUnitsException(int units)
	{
		super("Error:Negative Number Given For Units: ");
	}
}
