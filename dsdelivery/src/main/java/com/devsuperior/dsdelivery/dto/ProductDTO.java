package com.devsuperior.dsdelivery.dto;

import com.devsuperior.dsdelivery.entities.Product;

public class ProductDTO {
	
	private Long id;
	private String Name;
	private Double price;
	private String description;
	private String imageURI;
	
	public ProductDTO() {

		// TODO Auto-generated constructor stub
	}

	public ProductDTO(Long id, String name, Double price, String description, String imageURI) {
	
		this.id = id;
		Name = name;
		this.price = price;
		this.description = description;
		this.imageURI = imageURI;
	}

	public ProductDTO(Product entity) {
	
		this.id = entity.getId();
		Name = entity.getName();
		this.price = entity.getPrice();
		this.description = entity.getDescription();
		this.imageURI = entity.getImageURI();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageURI() {
		return imageURI;
	}

	public void setImageURI(String imageURI) {
		this.imageURI = imageURI;
	}

	
	
	
	
	

}
