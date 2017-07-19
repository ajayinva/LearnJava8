/**
 * 
 */
package com.aces.learn.java8.defaultmethods;

/**
 * @author aagarwal
 *
 */
public class J implements A , I{	
	//The class wont compile without this method
	public void sayHello(){
		A.super.sayHello();
	}
	public static void main(String... args){
		new J().sayHello();
	}
}
