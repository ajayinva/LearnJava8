/**
 * 
 */
package com.aces.learn.java8.lambda;

import java.util.function.Predicate;

import com.aces.learn.java8.State;

/**
 * @author aagarwal
 *
 */
public class MoreThan500CountiesPredicate implements Predicate<State>{
	/**
	 * 
	 */
	public boolean test(State t) {
		return t.getCounties() > 500;
	}
	
}
