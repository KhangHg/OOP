package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	
	private List<String> authors = new ArrayList<String>();
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	public void addAuthor(String authorName) {
		if(authors.contains(authorName)) {
			System.out.println("Author has been added!");
		}else {
			authors.add(getCategory());
			System.out.println("Add successfully!");
			
		}
	}
	public void removeAuthor(String authorName) {
		if(authors.contains(authorName)) {
			authors.remove(authorName);
			System.out.println("Author has been removed!");
		}else {
			System.out.println("Can't remove author not exist!");
		}
	}

}
