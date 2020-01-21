//Donark Patel
//CSC 162-C1
//Lab 6D

import java.util.*;

public class WorkerDemo
{
	public static void main (String [] args)throws Exception
	{
		createWorker();
	}

	public static void createWorker() throws Exception
	{
		try
		{
			ProductionWorker obj = new ProductionWorker();
			obj.setName("John Smith");
			obj.setEmployeeNumber(123);
			obj.setHireDate("11-15-2009");
			obj.setShift("Day");
			obj.setPayRate(16.50);

			System.out.println(obj);
		}
		catch(InvalidEmployeeNumber e)
		{
			System.out.println(e.toString());
		}
		catch(InvalidPayRate e)
		{
			System.out.println(e.toString());
		}
		catch(InvalidShift e)
		{
			System.out.println(e.toString());
		}

		try
		{
			ProductionWorker obj = new ProductionWorker();
			obj.setName("John Smith");
			obj.setEmployeeNumber(10001);
			obj.setHireDate("11-15-2009");
			obj.setShift("Day");
			obj.setPayRate(16.50);

			System.out.println(obj);
		}
		catch(InvalidEmployeeNumber e)
		{
			System.out.println(e.toString());
		}
		catch(InvalidPayRate e)
		{
			System.out.println(e.toString());
		}
		catch(InvalidShift e)
		{
			System.out.println(e.toString());
		}

		try
		{
			ProductionWorker obj = new ProductionWorker();
			obj.setName("John Smith");
			obj.setEmployeeNumber(123);
			obj.setHireDate("11-15-2009");
			obj.setShift("66");
			obj.setPayRate(16.50);

			System.out.println(obj);
		}
		catch(InvalidEmployeeNumber e)
		{
			System.out.println(e.toString());
		}
		catch(InvalidPayRate e)
		{
			System.out.println(e.toString());
		}
		catch(InvalidShift e)
		{
			System.out.println(e.toString());
		}

		try
		{
			ProductionWorker obj = new ProductionWorker();
			obj.setName("John Smith");
			obj.setEmployeeNumber(123);
			obj.setHireDate("11-15-2009");
			obj.setShift("Day");
			obj.setPayRate(-99.00);

			System.out.println(obj);
		}
		catch(InvalidEmployeeNumber e)
		{
			System.out.println(e.toString());
		}
		catch(InvalidPayRate e)
		{
			System.out.println(e.toString());
		}
		catch(InvalidShift e)
		{
			System.out.println(e.toString());
		}

		System.out.println("Donark Patel");
		System.out.println("Lab 6D");
	}
}