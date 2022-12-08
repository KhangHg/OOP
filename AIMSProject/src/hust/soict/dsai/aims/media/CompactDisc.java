package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {

	private String artist;

	private List<Track> tracks = new ArrayList<Track>();

	public CompactDisc(String director, int length, String artist, List<Track> tracks) {
		super(director, length);
		this.artist = artist;
		this.tracks = tracks;
	}

	public CompactDisc() {
		// TODO Auto-generated constructor stub
	}

	// #region Method
	public void addTrack(Track trackName) {
		if (tracks.contains(trackName)) {
			System.out.println("Track has been added!");
		} else {
			tracks.add(trackName);
			System.out.println("Add successfully!");

		}
	}

	public void removeTrack(Track trackName) {
		if (tracks.contains(trackName)) {
			tracks.remove(trackName);
			System.out.println("Track has been removed!");
		} else {
			System.out.println("Can't remove Track not exist!");
		}
	}

	public int getLength(Track trackName) {
		return trackName.getLength();
	}

	public void play() {
		for (Track track : tracks) {
			track.play();
		}
	}
	// #endregion

}
