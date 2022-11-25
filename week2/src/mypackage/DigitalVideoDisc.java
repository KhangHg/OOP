package mypackage;

public class DigitalVideoDisc {
    private String title;
    private int id;

    private String category;
    private String director;
    private int length;
    private float cost;
    private static int nbDigitalVideoDiscs = 0;

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        this.id = nbDigitalVideoDiscs++;
    }

    public DigitalVideoDisc(String title) {
        this.title = title;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        this.id = nbDigitalVideoDiscs++;
    }

    public String toString() {
        return this.id + ". DVD - ["
                + this.title + "] - ["
                + this.category + "] - ["
                + this.director + "] - ["
                + this.length + "]: ["
                + this.cost + "] $";
    }

    public boolean isMatch(String title) {
        return this.title.equals(title);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public float getCost() {
        return cost;
    }

    public int getId() {
        return id;
    }

}
