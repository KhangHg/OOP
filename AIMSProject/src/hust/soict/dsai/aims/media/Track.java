package hust.soict.dsai.aims.media;

public class Track implements Playable {

	private String title;
	private int length;

	public Track(String tittle, int length) {
		this.title = tittle;
		this.length = length;
	}

	public String getTitle() {
		return title;
	}

	public int getLength() {
		return length;
	}

	public Track() {
		// TODO Auto-generated constructor stub
	}

	// #region method
	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.title);
		System.out.println("DVD length: " + this.length);
	}

	@Override
	public boolean equals(Object o) {
		Track tmp = (Track) o;
		return this.title.equals(tmp.getTitle()) && this.length == tmp.getLength();
	}
	// #endregion

}
