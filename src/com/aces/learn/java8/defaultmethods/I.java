/**
 * 
 */
package com.aces.learn.java8.defaultmethods;

/**
 * @author aagarwal
 *
 */
public interface I {	
	default void sayHello(){
		System.out.println("Hello from I");
	}

}
