package com.bridgelabz.inventorymanagement;

import java.util.LinkedList;

public class InventoryManagementServiceImpl implements InventoryManagementService
{

	LinkedList<Items> itemList = new LinkedList<Items>();
	
	/**
	 * Method to add inventory items to linkedlist
	 */
	@Override
	public void addInventoryItem(Items item)
	{
		if(itemList.contains(item))
		{
			System.err.println("Inventory Item Exists!");
		}
		else
		{			
			itemList.add(item);
		}
	}
	/**
	 * Method to get details of inventory items
	 */

	@Override
	public void getInventoryDetails() 
	{
		for(Items item: itemList)
		{
			System.out.println(item);
		}
	}
	/**
	 * Method to get details by name of the inventory item
	 */

	@Override
	public void getInventoryDetailsByName(String itemName) {
		for(Items item: itemList)
		{
			if(item.getItemName().equals(itemName))
			{
				System.out.println(item);
				break;
			}
		}

	}
	/**
	 * Method to calculate value of each item
	 */
	@Override
	public void calculateInventoryItemValue()
	{
		for(Items item: itemList)
		{
			double itemValue = item.getItemWeight()*item.getItemPricePerKg();
			System.out.println("value of the inventory item "+item.getItemName()+" is "+itemValue);
		}

	}
	/**
	 * Method to delete an item in linked list
	 */
	@Override
	public void deleteInventoryItem(String itemName) {
		for(Items item: itemList)
		{
			if(item.getItemName().equals(itemName))
			{
				itemList.remove(item);
				System.out.println("Item deleted ");
			}
		}

	}
}
