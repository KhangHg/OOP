public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    int count = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        itemsOrdered[count] = disc;
        count++;
        if (count == MAX_NUMBERS_ORDERED) {

            System.out.println("Disc is full!");
        }
    }

    public float totalCost() {
        float totalCost = 0;
        for (int i = 0; i < count; i++) {
            totalCost += itemsOrdered[i].getCost();
        }

        return totalCost;
    }

}
