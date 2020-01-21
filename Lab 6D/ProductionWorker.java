//Donark Patel
//CSC 162-C1
//Lab 6D

import java.text.DecimalFormat;

public class ProductionWorker extends Employee
{
	 String Shift;
	 double PayRate;

	public ProductionWorker()
	{
		super();
		Shift = "";
		PayRate = 0;
	}

	public ProductionWorker(String name, double num, String date, String sh, double rate)throws InvalidEmployeeNumber,InvalidShift,InvalidPayRate
	{
		super(name, num, date);
		Shift = sh;
		PayRate = rate;
	}

	public void setShift(String sh) throws InvalidShift
	{
		if(sh != "Day" && sh!= "Night")
		{
			throw new InvalidShift();
		}
		Shift = sh;
	}

	public void setPayRate(double rate) throws InvalidPayRate
	{
		if(rate <0)
		{
			throw new InvalidPayRate();
		}
		PayRate = rate;
	}

	public String getShift()
	{
		return Shift;
	}

	public double getPayRate()
	{
		return PayRate;
	}
	public String toString()
	{
		DecimalFormat dollar = new DecimalFormat("$#,##0.00");
		String str = super.toString();
		str += "\nShift: " + Shift;
		str += "\nHourly Pay Rate " + dollar.format(PayRate) + "\n";
		return str;
	}
}
