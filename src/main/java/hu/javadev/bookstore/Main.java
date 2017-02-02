package hu.javadev.bookstore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import hu.javadev.bookstore.model.Author;
import hu.javadev.bookstore.model.Book;
import hu.javadev.bookstore.model.Publisher;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config/application.xml");
		
		/////////////////////////////
		
		//Author a = context.getBean(Author.class);
		//Publisher p = context.getBean(Publisher.class);
		//System.out.println(a.toString() + " kiadja: " + p.toString());
		
		Book b = context.getBean(Book.class);
		
		System.out.println(b.toString());
		
		////////////////////////////
		
		context.close();
	}

}
