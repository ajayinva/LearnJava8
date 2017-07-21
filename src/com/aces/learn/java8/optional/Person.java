/**
 * 
 */
package com.aces.learn.java8.optional;

import java.util.Optional;

/**
 * @author aagarwal
 *
 */
public class Person {
	private String name;
	private Optional<Car> car = Optional.ofNullable(null);
	public String toString(){
		return "Person -> {Name:"+this.name+", Car:"+this.car+"}";
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
	 * @return the car
	 */
	public Optional<Car> getCar() {
		return car;
	}
	/**
	 * @param car the car to set
	 */
	public void setCar(Optional<Car> car) {
		this.car = car;
	}
	/**
	 * 
	 * @param name
	 */
	public Person(String name){
		this.name = name;
	}
}
