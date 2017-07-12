/**
 * 
 */
package com.aces.learn.java8;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
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
		List<State> states = LearnJava8Utils.getAllStates();			
		System.out.println(states);
		System.out.println("--------------------------------------------------------------------------------------------------------------");
	
		System.out.println("----------All East Coast States-----------");
		List<State> statesOnEastCoast = stateService.filter(states, State::isEastCoast);
		System.out.println(statesOnEastCoast);
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
		
		System.out.println("----------All States with more than 500 Counties-----------");
		List<State> statesMoreThan500Counties1 = stateService.filter(states, new MoreThan500CountiesPredicate());
		System.out.println(statesMoreThan500Counties1);
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
		
		System.out.println("----------All States with more than 500 Counties-----------");
		List<State> statesMoreThan500Counties2 = stateService.filter(states, (State s) -> s.getCounties() > 500);
		System.out.println(statesMoreThan500Counties2);
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
		
		System.out.println("----------All States with more than 200 Counties on East Coast-----------");
		List<State> statesMoreThan200CountiesOnEastCoast 
										= stateService.filter(states, (State s) -> {
											return s.getCounties() > 200 && s.isEastCoast();
										});
		System.out.println(statesMoreThan200CountiesOnEastCoast);		
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
		
	
		System.out.println("----------Sort States By Name----1-------");
		Collections.sort(states, (State a, State b) -> a.getName().compareTo(b.getName()));
		System.out.println(states);
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
		
		
		System.out.println("----------Sort States By Name----2-------");
		Collections.sort(states, comparing(State::getName));
		System.out.println(states);
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
		
		
		System.out.println("----------Sort States By No Of Counties----1-------");
		Collections.sort(states, (State a, State b) -> a.getCounties().compareTo(b.getCounties()));
		System.out.println(states);
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
		
		
		System.out.println("----------Sort States By No Of Counties----2-------");
		Collections.sort(states, comparing(State::getCounties));
		System.out.println(states);
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
		System.out.println("----------Functional Interface-------");
		Runnable r = () -> {
			System.out.println("Runnable is a Functional Interface and can be passed as Lamda Function. A Functional Interface is an interface with a single abstract method");
			System.out.println("A Lambda can be assigned to a variable");
			System.out.println("This is an example of multiple statements in a Lambda Function");
		};
		Thread t1 = new Thread(r);
		t1.start();		
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
				
		stateService.print1(states, new StateNamePrinter());		
		stateService.print1(states, (s)->s.getCode());
		
		stateService.print2(states, (s)->System.out.println(s.getCode()));
	}	
	/**
	 * 
	 * @param states
	 * @param Predicate is a Functional Interface. It takes 'State' as an Input and returns a boolean
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
	/**
	 * 
	 * @param states
	 * @param Consumer is a Functional Interface. It takes 'State' and returns nothing
	 * @return
	 */
	public void print2(List<State> states, Consumer<State> s){
		System.out.println("-------------------------------------Consumer Functional Interface----------------------------------------------");
		System.out.println("--------------------------------------------------------------------------------------------------------------");
        for(State state : states){
        	s.accept(state);
        }        
    }   
	/**
	 * 
	 * @param states
	 * @param Predicate is a Functional Interface. It takes 'State' as an Input and returns a boolean
	 * @return
	 */
	public void print1(List<State> states, TestFunctionalInterface<State, String> tfi){
		System.out.println("-------------------------------------Custom Functional Interface----------------------------------------------");
		System.out.println("--------------------------------------------------------------------------------------------------------------");
        for(State state : states){
        	System.out.println(tfi.test(state));
        }        
    }     
}
