/**
 * 
 */
package com.aces.learn.java8;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
/**
 * @author aagarwal
 *
 */
public class StateServiceJava7 {
	/**
	 * 
	 * @param args
	 */
	public static void main(String... args){	
		StateServiceJava7 stateService = new StateServiceJava7();		
				
		System.out.println("----------All States-----------");
		List<State> states = LearnJava8Utils.getAllStates();			
		System.out.println(states);
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
		
		System.out.println("----------All East Coast States-----------");
		List<State> statesOnEastCoast= stateService.getStatesOnEastCoast(states);	
		System.out.println(statesOnEastCoast);
		System.out.println("--------------------------------------------------------------------------------------------------------------");
				
		
		System.out.println("----------Sort States By Name-----------");
		Collections.sort(states, new Comparator<State>(){
			@Override
			public int compare(State o1, State o2) {				
				return o1.getName().compareTo(o2.getName());
			}			
		});		
		System.out.println(states);
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
		
		
		System.out.println("----------Sort States By No Of Counties-----------");
		Collections.sort(states, new Comparator<State>(){
			@Override
			public int compare(State o1, State o2) {				
				return o1.getCounties().compareTo(o2.getCounties());
			}			
		});		
		System.out.println(states);
		System.out.println("--------------------------------------------------------------------------------------------------------------");		
	}	
	/**
	 * 
	 * @return
	 */
	public List<State> getStatesOnEastCoast(List<State> states){
		List<State> statesOnEastCoast = new ArrayList<>();	
		for(State state: states){
			if(state.isEastCoast()){
				statesOnEastCoast.add(state);
			}
		}
		return statesOnEastCoast;
	}
}
