package com.bridgelabz.inventorymanagement;

public class Items
{
	//properties
	private String itemName;
	private double itemWeight;
	private double itemPricePerKg;

	//Generating getters and setters
	public String getItemName()
	{
		return itemName;
	}
	public void setItemName(String itemName)
	{
		this.itemName = itemName;
	}
	public double getItemWeight() 
	{
		return itemWeight;
	}
	public void setItemWeight(double itemWeight)
	{
		if(itemWeight <0.0)
		{
			System.err.println("Weight can't be less than or equal to zero");
		}
		else
		{			
			this.itemWeight = itemWeight;
		}
	}
	public double getItemPricePerKg()
	{
		return itemPricePerKg;
	}
	public void setItemPricePerKg(double itemPricePerKg)
	{
		if(itemPricePerKg < 0.0)
		{
			System.err.println("price can't be less than or equal to zero");
		}
		else
		{			
			this.itemPricePerKg = itemPricePerKg;
		}
	}
	/**
	 * Method to returns string representation of the object
	 */
	@Override
	public String toString() {
		return "Items [itemName=" + itemName + ", itemWeight=" + itemWeight + ", itemPricePerKg=" + itemPricePerKg
				+ "]";
	}	
	
}
