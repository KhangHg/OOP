package hust.soict.dsai.aims.media;

public class Disc extends Media {
	public Disc(String director, int length) {
		super();
		this.director = director;
		this.length = length;
	}

	private String director;
	private int length;

	public void setDirector(String director) {
		this.director = director;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getDirector() {
		return director;
	}

	public int getLength() {
		return length;
	}

	public Disc() {
		// TODO Auto-generated constructor stub
	}

}
