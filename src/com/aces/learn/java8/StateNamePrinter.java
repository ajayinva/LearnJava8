/**
 * 
 */
package com.aces.learn.java8;

/**
 * @author aagarwal
 *
 */
public class StateNamePrinter implements TestFunctionalInterface<State, String>{
	/**
	 * 
	 */
	@Override
	public String test(State t) {
		return t.getName();
	}
}
