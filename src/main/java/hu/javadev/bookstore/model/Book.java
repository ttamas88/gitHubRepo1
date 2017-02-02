package hu.javadev.bookstore.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Book {
	
	private String title;
	private List<Author> authors;
	private Publisher publisher;
	
	public Book(List<Author> a, String title){
		this.authors = a;
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
	public Publisher getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getTitle() + " by " + this.getAuthors().get(0).toString() + " " + this.getPublisher().toString();
	}

}
