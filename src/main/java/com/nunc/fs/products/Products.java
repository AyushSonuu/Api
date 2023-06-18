package com.nunc.fs.products;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Products {
	
	@Id
	private int id;
	@Column
	private String title;
	@Column
	private double price;
	@Column
	private String description;
	@Column
	private String category;
	@Column
	private String image;
	@Column
	private double rate;
	@Column	
	private int count;
	
	public Products() {
		
	}
	
	public Products(int id, String title, double price, String description, String category, String image, double rate,
			int count) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.description = description;
		this.category = category;
		this.image = image;
		this.rate = rate;
		this.count = count;
	}
	
	

	public int getId() {
		return id;
	}



	public String getTitle() {
		return title;
	}



	public double getPrice() {
		return price;
	}



	public String getDescription() {
		return description;
	}



	public String getCategory() {
		return category;
	}



	public String getImage() {
		return image;
	}



	public double getRate() {
		return rate;
	}



	public int getCount() {
		return count;
	}



	@Override
	public String toString() {
		return "Products [id=" + id + ", title=" + title + ", price=" + price + ", description=" + description
				+ ", category=" + category + ", image=" + image + ", rate=" + rate + ", count=" + count + "]";
	}
	
	

}
