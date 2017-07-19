/**
 * 
 */
package com.aces.learn.java8.defaultmethods;

/**
 * @author aagarwal
 *
 */
public interface B extends A{	
	default void sayHello(){
		System.out.println("Hello from B");
	}

}
