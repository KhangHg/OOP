package hust.soict.dsai.aims.media;

public class Track implements Playable {

	private String tittle;
	private int length;

	public Track(String tittle, int length) {
		this.tittle = tittle;
		this.length = length;
	}

	public String getTittle() {
		return tittle;
	}

	public int getLength() {
		return length;
	}

	public Track() {
		// TODO Auto-generated constructor stub
	}

	// #region method
	public void play() {
		System.out.println("Playing DVD: " + this.getTittle());
		System.out.println("DVD length: " + this.getLength());
	}
	// #endregion

}
