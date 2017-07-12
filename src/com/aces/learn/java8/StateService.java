/**
 * 
 */
package com.aces.learn.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author aagarwal
 *
 */
public class StateService {
	/**
	 * 
	 * @return
	 */
	public List<State> getStatesOnEastCoastJava7(List<State> states){
		List<State> statesOnEastCoast = new ArrayList<>();	
		for(State state: states){
			if(state.isEastCoast()){
				statesOnEastCoast.add(state);
			}
		}
		return statesOnEastCoast;
	}
	/**
	 * 
	 * @return
	 */
	public List<State> getAllStates(){
		List<State> states = new ArrayList<>();			
		states.add(new State("New York", 100, true));
		states.add(new State("Virginia", 200, true));
		states.add(new State("Maryland", 300, true));
		states.add(new State("California", 100, false));
		states.add(new State("Washington", 500, false));
		states.add(new State("Arizona", 50, false));
		states.add(new State("Nebraska", 200, false));
		states.add(new State("Montana", 800, false));
		states.add(new State("Texas", 1000, false));
		states.add(new State("Utah", 2000, false));
		states.add(new State("Kentucky", 1000, false));		
		return states;
	}
	/**
	 * 
	 * @param states
	 * @param p
	 * @return
	 */
	public List<State> filter(List<State> states, Predicate<State> p){
        List<State> result = new ArrayList<>();
        for(State state : states){
            if(p.test(state)){
                result.add(state);
            }
        }
        return result;
    }       
}
