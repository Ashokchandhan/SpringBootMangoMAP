package com.app.document;

import java.util.Map;
import java.util.Properties;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Book {

	@Id

	private String id;

	private String bookCode;
	private String bookAuth;
	private Double bookCost;
	private Map<String,String>from;
	private Properties models;
	public Book() {
		super();
	}
	public Book(String bookCode, String bookAuth, Double bookCost, Map<String, String> from, Properties models) {
		super();
		this.bookCode = bookCode;
		this.bookAuth = bookAuth;
		this.bookCost = bookCost;
		this.from = from;
		this.models = models;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBookCode() {
		return bookCode;
	}
	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}
	public String getBookAuth() {
		return bookAuth;
	}
	public void setBookAuth(String bookAuth) {
		this.bookAuth = bookAuth;
	}
	public Double getBookCost() {
		return bookCost;
	}
	public void setBookCost(Double bookCost) {
		this.bookCost = bookCost;
	}
	public Map<String, String> getFrom() {
		return from;
	}
	public void setFrom(Map<String, String> from) {
		this.from = from;
	}
	public Properties getModels() {
		return models;
	}
	public void setModels(Properties models) {
		this.models = models;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", bookCode=" + bookCode + ", bookAuth=" + bookAuth + ", bookCost=" + bookCost
				+ ", from=" + from + ", models=" + models + "]";
	}

}