package com.bridgelabz.inventorymanagement;

import java.util.Scanner;

public class InventoryManagerMain
{
	public static void main(String args[])
	{
		InventoryManagementService inventoryService = new InventoryManagementServiceImpl();
		Scanner scanner = new Scanner(System.in);

		while(true)
		{
			System.out.println("Welcome to inventory data management");
			System.out.println("Which operation do you want to perform: "
					+ "\n\t 1) Add item"
					+ "\n\t 2) Get item details "
					+ "\n\t 3) Get item details by name "
					+ "\n\t 4) calculate the value of each item" 
					+ "\n\t 5) Delete item"  
					+ "\n\t 6) Quit");

			int userChoice = scanner.nextInt();
			switch(userChoice)
			{
			case 1:
				System.out.println("Enter the number of items you want to add: ");
				int numOfItems = scanner.nextInt();
				for(int index=0;index<numOfItems;index++)
				{
					Items newItem = new Items();
					System.out.println("Enter item name: ");
					newItem.setItemName(scanner.next());
					System.out.println("Enter item weight: ");
					newItem.setItemWeight(scanner.nextDouble());
					System.out.println("Enter item price per kg: "); 
					newItem.setItemPricePerKg(scanner.nextDouble());
					inventoryService.addInventoryItem(newItem);
				}	
				break;
			case 2:
				inventoryService.getInventoryDetails();
				break;
			case 3:
				System.out.println("Enter name of the item to be found");
				String ItemName = scanner.next();
				inventoryService.getInventoryDetailsByName(ItemName);
				break;
			case 4:
				inventoryService.calculateInventoryItemValue();	
				break;
			case 5:
				System.out.println("Which item do you want to delete?");
				String itemName = scanner.next();
				inventoryService.deleteInventoryItem(itemName);
				break;
			case 6:
				System.exit(0);
				break;

			default:
				System.out.println("Choose correct option ");
			}

		}
	}
}
