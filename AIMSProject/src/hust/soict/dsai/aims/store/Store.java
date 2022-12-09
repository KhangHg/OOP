package hust.soict.dsai.aims.store;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class Store {
    public static final int MAX_NUMBERS_STORED = 20;
    private List<Media> itemslnStore = new ArrayList<>();
    public int qtyStored = 0;

    public void addMedia(Media... m_list) {
        for (Media m : m_list) {
            itemslnStore.add(m);
            qtyStored++;
        }
    }

    public void removeMedia(Media m) {
        itemslnStore.remove(m);
        qtyStored--;
    }

    // public void print() {
    // System.out.println("*******************CART****************");
    // System.out.println("Ordered Items:");
    // for (int i = 0; i < qtyStored; i++) {
    // System.out.println(itemsInStore[i].toString());
    // }
    // System.out.println("***************************************");
    // }
}
