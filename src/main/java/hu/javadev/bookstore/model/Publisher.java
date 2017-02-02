package hu.javadev.bookstore.model;

public class Publisher {
	
	private String name = "default_publisher";
	
	public Publisher(String s) {
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
