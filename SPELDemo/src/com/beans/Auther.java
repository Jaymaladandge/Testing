package com.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("auther")
public class Auther {

	public Auther() {
		System.out.println("Auther()");
	}

	@Value("Sahastrabudhe")
	private String name;

	@Value("#{book}")
	private Book book;

	@Value("#{book.title}")
	private String title;

	@Value("#{book.info('Pathak')}")
	private String details;

	@Value("#{book.map['Chapter2']}")
	private String topic;

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Auther name=" + name + ", book=" + book + ", title=" + title;
	}

}
