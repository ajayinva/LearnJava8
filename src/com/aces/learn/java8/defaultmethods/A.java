/**
 * 
 */
package com.aces.learn.java8.defaultmethods;

/**
 * @author aagarwal
 *
 */
public interface A {	
	default void sayHello(){
		System.out.println("Hello from A");
	}

}
