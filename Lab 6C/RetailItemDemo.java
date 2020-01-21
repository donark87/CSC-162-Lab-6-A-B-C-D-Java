//Donark Patel
//CSC 162-C1
//Lab 6C

import java.util.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class RetailItemDemo
{
	static Scanner keyboard = new Scanner(System.in);
	public static void main (String [] args)throws Exception
	{
		 String description;
		 int unitsOnHand;
		 double Price;
		 String str;
		 boolean done;
		 boolean finish;

		 done = false;
		 finish = false;

		 DecimalFormat formatter = new DecimalFormat("##.00");

		 ReatailItem obj = new ReatailItem();

		 System.out.print("Enter the discription: ");
		 description = keyboard.nextLine();

		 obj.setDescription(description);

		do{
		 	 try
		 	 {
				System.out.print("\nUnits on hand: ");
				unitsOnHand = keyboard.nextInt();
				obj.setUnitsOnHand(unitsOnHand);
				done = true;
			 }
			 catch(NegativeUnitsException e)
			 {
				str = keyboard.next();
				System.out.println(e.getMessage()+str);
			 }
		 }while(!done);

		do{
			try
			{
				System.out.print("\nItem Price: ");
				Price = keyboard.nextDouble();
				obj.setPrice(Price);
				finish = true;
			}
			catch(NegativePriceException e)
			{
				str = keyboard.next();
				System.out.println(e.getMessage()+str);
			}
		  }while(!finish);

				System.out.println("\n\n");
		  		System.out.println("             Description" + "      Units on Hand      Price");
		  		System.out.println("Item #1      " + obj.getDescription() +
		  						   "                " + obj.getUnitsOnHand() +
						   		   "            $" + formatter.format(obj.getPrice()));
				System.out.println();
				System.out.println("Donark Patel");
				System.out.println("Lab 6C");
	}
}










