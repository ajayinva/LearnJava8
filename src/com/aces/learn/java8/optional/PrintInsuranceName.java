/**
 * 
 */
package com.aces.learn.java8.optional;

import java.util.Optional;

/**
 * @author aagarwal
 *
 */
public class PrintInsuranceName {
	public static void main(String... args){			
		PrintInsuranceName printer = new PrintInsuranceName();		
		Insurance geico = new Insurance("Geico");
		Car rav4 = new Car("Toyota", "Rav4", 2010);
		rav4.setInsurance(Optional.ofNullable(geico));
		Person ajay = new Person("ajay");
		ajay.setCar(Optional.ofNullable(rav4));		
		//System.out.println(printer.getInsuranceName(Optional.ofNullable(ajay)));
		
				
		Person vijay= new Person("Vijay");
		System.out.println(printer.getInsuranceName(Optional.ofNullable(vijay)));
	}
	/**
	 * 
	 * @param person
	 * @return
	 */
	private String getInsuranceName(Optional<Person> person){
		return person
				.flatMap(Person::getCar)
				.flatMap(Car::getInsurance)
				.map(Insurance::getName)
				.orElse("Unkown");				
	}
}
