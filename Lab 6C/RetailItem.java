//Donark Patel
//CSC 162-C1
//Lab 6C

class ReatailItem
{
	protected String description;
	protected int unitsOnHand;
	protected double price;
	protected String descrip;
	protected int units;
	protected double money;

	public ReatailItem()
	{
		descrip = "";
	    units = 0;
	    money = 0.00;
   	}

	public ReatailItem(String des, int unit, double price1)throws NegativePriceException, NegativeUnitsException
	{
		 description = des;
		 unitsOnHand = unit;
		 price = price1;

		 if(unit < 0)
		 {
			 throw new NegativeUnitsException(unit);
		 }
		 else
		 {
			 unitsOnHand = unit;
		 }

		 if(price1 < 0)
		 {
			 throw new NegativePriceException(price1);
		 }
		 else
		 {
			 price = price1;
		 }
	}

	public void setDescription(String des)
	{
		description = des;
	}

	public void setUnitsOnHand(int unit)throws NegativeUnitsException
	{
		if(unit < 0)
		 {
			 throw new NegativeUnitsException(unit);
		 }
		 else
		 {
			 unitsOnHand = unit;
		 }	}

	public void setPrice(double price1)throws NegativePriceException
	{
		if(price1 < 0)
		 {
			 throw new NegativePriceException(price1);
		 }
		 else
		 {
			 price = price1;
		 }
	 }

	public String getDescription()
	{
		return description;
	}

	public int getUnitsOnHand()
	{
		return unitsOnHand;
	}

	public double getPrice()
	{
		return price;
	}
}

