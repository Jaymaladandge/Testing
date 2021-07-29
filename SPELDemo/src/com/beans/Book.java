package com.beans;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("book")
public class Book {

	@Value("11")
	private int bookId;

	@Value("Core Java")
	private String title;

	private HashMap<String, String> map;

	public Book() {
		System.out.println("Book()");
		map = new HashMap<>();
		map.put("Chapter1", "OOPs");
		map.put("Chapter3", "Exception");
		map.put("Chapter2", "Collection");
	}

	public HashMap<String, String> getMap() {
		return map;
	}

	public void setMap(HashMap<String, String> map) {
		this.map = map;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "( bookId=" + bookId + ", title=" + title + ")";
	}

	public String info(String auther) {
		return "BookName : " + title + " Auther name : " + auther;
	}

}
