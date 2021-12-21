package com.Adrian;


import java.util.ArrayList;

public class GroceryList {
  private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }
    public void printgroceryList() {
        System.out.println("You have " + groceryList.size()+ " items in your grocery list.");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1)+". "+groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified. It is now set to "+newItem);

    }
    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
        System.out.println("Item "+ theItem+ " has been removed");
    }
}
