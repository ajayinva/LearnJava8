/**
 * 
 */
package com.aces.learn.java8;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

import static java.util.Comparator.comparing;

import java.util.ArrayList;
/**
 * @author aagarwal
 *
 */
public class StateServiceJava8 {
	/**
	 * 
	 * @param args
	 */
	public static void main(String... args){	
		StateServiceJava8 stateService = new StateServiceJava8();		
				
		System.out.println("----------All States-----------");
		List<State> states = stateService.getAllStates();			
		System.out.println(states);
		System.out.println("--------------------------------------------------------------------------------------------------------------");
	
		System.out.println("----------All East Coast States Java 8-----------");
		List<State> statesOnEastCoastJava8 = stateService.filter(states, State::isEastCoast);
		System.out.println(statesOnEastCoastJava8);
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
		
		System.out.println("----------All States with more than 500 Counties Java 8-----------");
		List<State> statesMoreThan500Counties1 = stateService.filter(states, new MoreThan500CountiesPredicate());
		System.out.println(statesMoreThan500Counties1);
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
		
		System.out.println("----------All States with more than 500 Counties Java 8-----------");
		List<State> statesMoreThan500Counties2 = stateService.filter(states, (State s) -> s.getCounties() > 500);
		System.out.println(statesMoreThan500Counties2);
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
		
		System.out.println("----------All States with more than 200 Counties on East Coast Java 8-----------");
		List<State> statesMoreThan500CountiesOnEastCoast 
					= stateService.filter(states, (State s) -> {
						return s.getCounties() > 200 && s.isEastCoast();
					});
		System.out.println(statesMoreThan500CountiesOnEastCoast);		
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
		
	
		System.out.println("----------Sort States By Name Java 8----1-------");
		Collections.sort(states, (State a, State b) -> a.getName().compareTo(b.getName()));
		System.out.println(states);
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
		
		
		System.out.println("----------Sort States By Name Java 8----2-------");
		Collections.sort(states, comparing(State::getName));
		System.out.println(states);
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
		
		
		System.out.println("----------Sort States By No Of Counties Java 8----1-------");
		Collections.sort(states, (State a, State b) -> a.getCounties().compareTo(b.getCounties()));
		System.out.println(states);
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
		
		
		System.out.println("----------Sort States By No Of Counties Java 8----2-------");
		Collections.sort(states, comparing(State::getCounties));
		System.out.println(states);
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
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
