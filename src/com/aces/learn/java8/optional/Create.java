/**
 * 
 */
package com.aces.learn.java8.optional;

import java.util.Optional;

/**
 * @author aagarwal
 *
 */
public class Create {
	public static void main(String... args){			
		 Optional<Car> car = Optional.empty();
		 System.out.println("Empty Car::"+car);
		  
		 Car iAmNull = null;
		 Optional<Car> mayBeNull = Optional.ofNullable(iAmNull);
		 System.out.println("May be Null Car::"+mayBeNull);
		 		 
		 Optional<Car> car1 = Optional.of(new Car("Toyota", "Rav4", 2010));
		 System.out.println("Optional Car::"+car1);		
		 try{
			 Optional<Car> nullCar = Optional.of(iAmNull);
			 System.out.println("This will never be executed. Will throw NPE at the above line::"+nullCar);
		 }catch(NullPointerException npe){
			 System.out.println("A NullPointerException was thrown above as expected"); 
		 }
	}
}
