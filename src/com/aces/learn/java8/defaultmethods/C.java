/**
 * 
 */
package com.aces.learn.java8.defaultmethods;

/**
 * @author aagarwal
 *
 */
public class C implements A , B{	
	public void sayHello(){
		System.out.println("Hello from C");
	}
	public static void main(String... args){
		new C().sayHello();
	}
}
