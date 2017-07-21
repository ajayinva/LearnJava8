/**
 * 
 */
package com.aces.learn.java8.optional;

import java.util.Optional;

/**
 * @author aagarwal
 *
 */
public class Car {
	private String make;
	private String model;
	private Integer year; 
	private Optional<Insurance> insurance= Optional.ofNullable(null);
	
	public Car(String make, String model, Integer year){
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	public String toString(){
		return "Car -> {Make:"+this.make+", Model:"+this.model+", Year:"+this.year+"}";
	}

	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the year
	 */
	public Integer getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(Integer year) {
		this.year = year;
	}

	/**
	 * @return the insurance
	 */
	public Optional<Insurance> getInsurance() {
		return insurance;
	}

	/**
	 * @param insurance the insurance to set
	 */
	public void setInsurance(Optional<Insurance> insurance) {
		this.insurance = insurance;
	}
}
