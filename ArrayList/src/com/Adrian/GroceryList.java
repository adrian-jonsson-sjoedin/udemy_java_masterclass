package com.Adrian;


import java.util.ArrayList;
import java.util.Locale;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));// i+1 so that our counting on screen starts at 1
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified. It is now set to " + newItem);

    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
        System.out.println("Item " + theItem + " has been removed");
    }

    //    public String findItem(String searchItem) {
//      //  boolean exists = groceryList.contains(searchItem); returns true if searchItem is in the list
//        int position = groceryList.indexOf(searchItem.toLowerCase(Locale.ROOT)); //returns -1 if searchItem doesn't exist in the list.
//        if (position >= 0) {   //added toLowerCase in case I wanted the search to be none case-sensitive
//            return groceryList.get(position);
//        }
//        return null;
//    }
    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if (position >= 0) {
            return true;
        }
        return false;
    }
}
