package model;

import model.domain.Book;

public class Data {
	Book book = new Book();
	public Book setBookTitle(String title) {
		book.setTitle(title);
		return book;
	}
	public Book setBookAuthor(String author) {
		book.setAuthor(author);
		return book;
	}
	public Book setBookBirthDay(int birthDay) {
		book.setBirthDay(birthDay);
		return book;
	}
}
