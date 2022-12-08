package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
    private static int nbDigitalVideoDiscs = 0;

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        setTitle(title);
        setCategory(category);
        setDirector(director);
        setCost(cost);
        nbDigitalVideoDiscs++;
        setId(nbDigitalVideoDiscs);
    }

    public DigitalVideoDisc(String title) {
        setTitle(title);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        setTitle(title);
        setCategory(category);
        setDirector(director);
        setLength(length);
        setCost(cost);
        nbDigitalVideoDiscs++;
        setId(nbDigitalVideoDiscs);
    }

    public String toString() {
        return getId() + ". DVD - ["
                + getTitle() + "] - ["
                + getCategory() + "] - ["
                + getDirector() + "] - ["
                + getLength() + "]: ["
                + getCost() + "] $";
    }

    public boolean isMatch(String title) {
        return getTitle().equals(title);
    }

    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

}
