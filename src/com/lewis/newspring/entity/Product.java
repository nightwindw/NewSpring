/**
 * 
 */
package com.lewis.newspring.entity;

import java.io.Serializable;

/**
 * @author Œ‚Œµ¥œ
 *
 */
public class Product implements Serializable {

	private static final long serialVersionUID = 748392348L;
	private long id;
	private String name;
	private String description;
	private float price;
	
	/**
	 * 
	 */
	public Product() {
		super();
	}
	/**
	 * @param id
	 * @param name
	 * @param description
	 * @param price
	 */
	public Product(long id, String name, String description, float price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	
	
}
