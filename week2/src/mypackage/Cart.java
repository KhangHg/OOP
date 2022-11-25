package mypackage;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    public int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full!");
        } else {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        // if (qtyOrdered == MAX_NUMBERS_ORDERED) {
        // System.out.println("The cart is almost full!");
        // } else {
        // for (int i = 0; i < dvdList.length; i++) {
        // itemsOrdered[i] = dvdList[i];
        // qtyOrdered++;
        // if (qtyOrderedIsFull()) {
        // return;
        // }
        // }
        // }
        int i = 0;
        while (!qtyOrderedIsFull() && i < dvdList.length) {
            itemsOrdered[i] = dvdList[i];
            i++;
        }
    }

    public boolean qtyOrderedIsFull() {
        if (qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full!");
            return true;
        } else {
            return false;
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (!qtyOrderedIsFull()) {
            itemsOrdered[qtyOrdered] = dvd1;
            qtyOrdered++;
        }
        if (!qtyOrderedIsFull()) {
            itemsOrdered[qtyOrdered] = dvd2;
            qtyOrdered++;
        }
    }

    public float totalCost() {
        float totalCost = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] != null) {
                totalCost += itemsOrdered[i].getCost();
            }
        }
        return totalCost;
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].equals(disc)) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
            }
        }
        System.out.println("Remove the : " + disc.getTitle());
        itemsOrdered[qtyOrdered] = null;
        qtyOrdered--;
    }

    public void print() {
        System.out.println("*******************CART****************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println(i + 1 + ".DVD -" + "[" + itemsOrdered[i].getTitle() + "] - " + "["
                    + itemsOrdered[i].getCategory() + "] - " + "[" + itemsOrdered[i].getDirector() + "] - " + "["
                    + itemsOrdered[i].getLength() + "]: " + "[" + itemsOrdered[i].getCost() + "] $ ");
        }
        System.out.println("Total cost: [" + totalCost() + "]");
        System.out.println("***************************************");
    }

    public void searchByID(int id) {

    }
}
