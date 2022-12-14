package hust.soict.dsai.aims.cart;

import java.util.ArrayList;
import java.util.Collections;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();
    
    public ObservableList<Media> getItemsOrdered() {
    	return itemsOrdered;
    }
 
    public void addMedia(Media input) {
        if (itemsOrdered.size() == MAX_NUMBERS_ORDERED) {
            System.out.println("Full");
            return;
        }
        itemsOrdered.add(input);
    }

    public void removeMedia(Media input) {
    	System.out.print("asjdbas");
        if (itemsOrdered.contains(input)) {
            itemsOrdered.remove(input);
            return;
        }
        System.out.println("Not found");
    }

    public float totalCost() {
        float ans = 0.0f;
        for (int i = 0; i < itemsOrdered.size(); i++) {
            ans += itemsOrdered.get(i).getCost();
        }
        return ans;
    }

    public void print() {
        float total = 0;
        System.out.println("***********************CART***********************");
        for (int i = 0; i < itemsOrdered.size(); ++i) {
            System.out.println(itemsOrdered.get(i).toString());
            total += itemsOrdered.get(i).getCost();
        }
        System.out.println("Total cost: " + total);
        System.out.println("***************************************************");
    }

    public Media searchById(int id) {
        for (int i = 0; i < itemsOrdered.size(); ++i) {
            if (itemsOrdered.get(i).getId() == id) {
                return itemsOrdered.get(i);
            }
        }
        return null;
    }

    public ArrayList<DigitalVideoDisc> seachByTitle(String title) {
        ArrayList<DigitalVideoDisc> ans = new ArrayList<DigitalVideoDisc>();
        for (int i = 0; i < itemsOrdered.size(); ++i) {
            if (itemsOrdered.get(i) instanceof DigitalVideoDisc) {
                DigitalVideoDisc curr = (DigitalVideoDisc) itemsOrdered.get(i);
                if (curr.isMatch(title))
                    ans.add(curr);
            }
        }
        if (ans.isEmpty()) {
            return null;
        }
        return ans;
    }

    public ArrayList<Media> sortByTitle(ArrayList<Media> list) {
        Collections.sort(list, Media.COMPARE_BY_COST_TITLE);
        return list;
    }

    public ArrayList<Media> sortByCost(ArrayList<Media> list) {
        Collections.sort(list, Media.COMPARE_BY_TITLE_COST);
        return list;
    }

}