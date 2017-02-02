package hu.javadev.bookstore.model;

public class Author {
	
	private String name = "Jóska";
	
	public Author(String s){
		this.name = s;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

}
