package com.kovaliuk.politeh.ms;

import java.io.Serializable;

public class BookRequest implements Serializable {

	private static final long serialVersionUID = 1195641279349549911L;

	public BookRequest(String bookTitle, int maxPrice) {
		this.bookTitle = bookTitle;
		this.maxPrice = maxPrice;
	}

	private final String bookTitle;

	private final int maxPrice;

	public String getBookTitle() {
		return bookTitle;
	}

	public int getMaxPrice() {
		return maxPrice;
	}

}