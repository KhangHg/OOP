package hust.soict.dsai.aims.cart;

import java.util.ArrayList;
import java.util.List;
import hust.soict.dsai.aims.media.*;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    // public int qtyOrdered = 0;
    private List<Media> itemOrdered = new ArrayList<>();

    // public boolean qtyOrderedIsFull() {
    // if (qtyOrdered == MAX_NUMBERS_ORDERED) {
    // System.out.println("The cart is almost full!");
    // return true;
    // } else {
    // return false;
    // }
    // }

    public void addMedia(Media m) {
        if (itemOrdered.size() <= MAX_NUMBERS_ORDERED && !itemOrdered.contains(m)) {
            itemOrdered.add(m);
            System.out.println("The media has been added");
        } else {
            System.out.println("The cart is almost full");
        }
    }

    public void removeMedia(Media m) {
        itemOrdered.remove(m);
        System.out.println(m.getTitle() + "has been deleted");
    }

    public float totalCost() {
        float totalCost = 0;
        for (Media m : itemOrdered) {
            totalCost += m.getCost();
        }
        return totalCost;
    }

    // public void print() {
    // System.out.println("*******************CART****************");
    // System.out.println("Ordered Items:");
    // for (int i = 0; i < qtyOrdered; i++) {
    // System.out.println(itemsOrdered[i].toString());
    // }
    // System.out.println("Total cost: [" + totalCost() + "]");
    // System.out.println("***************************************");
    // }

    // public DigitalVideoDisc searchByID(int id) {
    // for (int i = 0; i < qtyOrdered; i++) {
    // if (itemsOrdered[i].getId() == id) {
    // System.out.println("Found: " + itemsOrdered[i].toString());
    // return itemsOrdered[i];
    // }
    // }
    // System.out.println("Item not found.");
    // return null;
    // }

    // public DigitalVideoDisc searchByTitle(String keyword) {
    // for (int i = 0; i < qtyOrdered; i++) {
    // if (itemsOrdered[i].isMatch(keyword)) {
    // System.out.println("Found: " + itemsOrdered[i].toString());
    // return itemsOrdered[i];
    // }
    // }
    // System.out.println("Item not found.");
    // return null;
    // }
}
