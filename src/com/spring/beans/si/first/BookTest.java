package com.spring.beans.si.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/bean-config/si/book/book.xml");
		Book myBook = (Book) context.getBean("bookBean");
		System.out.println("Book name : " + myBook.getBookName());
		System.out.println("Price : " + myBook.getPrice());
	}

}
