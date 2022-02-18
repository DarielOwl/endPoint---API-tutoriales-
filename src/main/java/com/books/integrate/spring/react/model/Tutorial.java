package com.books.integrate.spring.react.model;

import javax.persistence.*;

@Entity
@Table(name = "tutorials")
public class Tutorial {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;

	@Column(name = "published")
	private boolean published;

	@Column(name = "price")
	private long price;

	public Tutorial() {

	}

	public Tutorial(String title, String description, boolean published, long price) {
		this.title = title;
		this.description = description;
		this.published = published;
		this.price = price;
	}

	//Getters
	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public boolean isPublished() {
		return published;
	}

	public long getPrice() {
		return price;
	}

	//Setters
	public void setTitle(String title) {
		this.title = title;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setPublished(boolean isPublished) {

		this.published = isPublished;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	//Another Function
	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + ", price="+price+"]";
	}

}
