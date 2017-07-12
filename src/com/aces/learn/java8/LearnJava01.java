/**
 * 
 */
package com.aces.learn.java8;
import java.util.List;

/**
 * @author aagarwal
 *
 */
public class LearnJava01 {
	/**
	 * 
	 * @param args
	 */
	public static void main(String... args){	
		StateService stateService = new StateService();		
				
		System.out.println("----------All States-----------");
		List<State> states = stateService.getAllStates();			
		System.out.println(states);
		
		System.out.println("----------All East Coast States Java 7-----------");
		List<State> statesOnEastCoastJava7 = stateService.getStatesOnEastCoastJava7(states);	
		System.out.println(statesOnEastCoastJava7);
		
		System.out.println("----------All East Coast States Java 8-----------");
		List<State> statesOnEastCoastJava8 = stateService.filterStates(states, State::isEastCoast);
		System.out.println(statesOnEastCoastJava8);
		
		System.out.println("----------All States with more than 500 Counties Java 8-----------");
		List<State> statesMoreThan500Counties1 = stateService.filterStates(states, new MoreThan500CountiesPredicate());
		System.out.println(statesMoreThan500Counties1);
		
		System.out.println("----------All States with more than 500 Counties Java 8-----------");
		List<State> statesMoreThan500Counties2 = stateService.filterStates(states, (State s) -> s.getCounties() > 500);
		System.out.println(statesMoreThan500Counties2);
		
		System.out.println("----------All States with more than 200 Counties on East Coast Java 8-----------");
		List<State> statesMoreThan500CountiesOnEastCoast = stateService.filterStates(states, (State s) -> {
													return s.getCounties() > 200 && s.isEastCoast();
												});
		System.out.println(statesMoreThan500CountiesOnEastCoast);
		
	}	
}
