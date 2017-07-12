/**
 * 
 */
package com.aces.learn.java8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aagarwal
 *
 */
public class LearnJava8Utils {
	/**
	 * 
	 * @return
	 */
	public static List<State> getAllStates(){
		List<State> states = new ArrayList<>();			
		states.add(new State("NY", "New York", 100, true));
		states.add(new State("VA", "Virginia", 200, true));
		states.add(new State("MD", "Maryland", 300, true));
		states.add(new State("CA", "California", 100, false));
		states.add(new State("WA", "Washington", 500, false));
		states.add(new State("AZ", "Arizona", 50, false));
		states.add(new State("NB", "Nebraska", 200, false));
		states.add(new State("MT", "Montana", 800, false));
		states.add(new State("TX", "Texas", 1000, false));
		states.add(new State("UT", "Utah", 2000, false));
		states.add(new State("KT", "Kentucky", 1000, false));		
		return states;
	}
}
