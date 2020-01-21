//Donark Patel
//CSC 162-C1
//Lab 6D

import java.util.*;

public class Employee
{
	 String employeeName;
	 double  employeeNumber;
     String  hireDate;

    public Employee()
    {
    	employeeName = "";
    	employeeNumber = 0;
    	hireDate = "";
	}

	public Employee(String name, double num, String date)throws InvalidEmployeeNumber
	{
		employeeName = name;
		employeeNumber = num;
		hireDate = date;
	}

	public void setName(String name)
	{
		employeeName = name;
	}

	public void setEmployeeNumber(double num)throws InvalidEmployeeNumber
	{
		if(num <0 || num > 999)
		{
			throw new InvalidEmployeeNumber();
		}
		employeeNumber = num;
	}

	public void setHireDate(String date)
	{
		hireDate = date;
	}

	public String getName()
	{
		return employeeName;
	}

	public double getEmployeeNumber()
	{
		return employeeNumber;
	}

	public String getHireDate()
	{
		return hireDate;
	}

	 boolean isValidEmpNum(String e)
	 {
		 boolean status = true;

		         if (e.length() != 5)
		            status = false;
		         else
		         {
		            if ((!Character.isDigit(e.charAt(0)))   ||
		             	(!Character.isDigit(e.charAt(1)))   ||
		             	(!Character.isDigit(e.charAt(2)))   ||
		             	(e.charAt(3) != '-')                ||
		             	(!Character.isLetter(e.charAt(4)))  ||

		             (!(e.charAt(4)>= 'A' && e.charAt(4)<= 'M')))
		            {
		               status = false;
		            }
		         }
         return status;
	  }

	public String toString()
	{
		return "Employee Name: " + employeeName +
			   "\nEmployee ID Number: " + employeeNumber +
			   "\nHire Date: " + hireDate ;
	}
}