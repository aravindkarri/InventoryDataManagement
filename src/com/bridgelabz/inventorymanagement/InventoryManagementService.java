package com.bridgelabz.inventorymanagement;

public interface InventoryManagementService 
{
	public void addInventoryItem(Items item);
	public void getInventoryDetails();
	public void getInventoryDetailsByName(String itemName);
	public void deleteInventoryItem(String itemName);
	public void calculateInventoryItemValue();
}
