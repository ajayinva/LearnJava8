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
		states.add(new State("NY", "New York",   100, true,  State.LOCATION.EAST));
		states.add(new State("VA", "Virginia",   200, true,  State.LOCATION.EAST));
		states.add(new State("MD", "Maryland",   300, true,  State.LOCATION.EAST));
		states.add(new State("ME", "Maine",      300, true,  State.LOCATION.EAST));
		states.add(new State("CA", "California", 100, false, State.LOCATION.WEST));
		states.add(new State("WA", "Washington", 500, false, State.LOCATION.WEST));
		states.add(new State("AZ", "Arizona", 	  50, false, State.LOCATION.SOUTH));
		states.add(new State("NB", "Nebraska", 	 200, false, State.LOCATION.NORTH));
		states.add(new State("MT", "Montana",    800, false, State.LOCATION.NORTH));
		states.add(new State("TX", "Texas",     1000, false, State.LOCATION.SOUTH));
		states.add(new State("UT", "Utah",      2000, false, State.LOCATION.WEST));
		states.add(new State("KT", "Kentucky",  1000, false, State.LOCATION.SOUTH));		
		return states;
	}
}
