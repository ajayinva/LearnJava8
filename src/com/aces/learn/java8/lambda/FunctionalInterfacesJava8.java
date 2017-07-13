/**
 * 
 */
package com.aces.learn.java8.lambda;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
/**
 * @author aagarwal
 *
 */
public class FunctionalInterfacesJava8 {
	/**
	 * 
	 * @param args
	 */
	public static void main(String... args){														
		System.out.println("----------Functional Interface-------");	
		System.out.println("----------------A Functional Interface is an interface with a single abstract method---------------------");		
		
		FunctionalInterfacesJava8 service = new FunctionalInterfacesJava8();
		List<State> states = LearnJava8Utils.getAllStates();		
		System.out.println("-------------------------------------Custom Functional Interface with anonymous inner class----------------------------------------------");
		service.print1(
			states
		, 	new TestFunctionalInterface<State, String> (){
				@Override
				public String test(State t) {
					return t.getName();
				}
			}
		);	
		System.out.println("----------------------------Custom Functional Interface with Lambda-------------------------");
		service.print1(states, (s)->s.getCode());		
		
		System.out.println("----------------------------Consumer Functional Interface----------------_------------------");
		service.print2(states, (s)->System.out.println(s.getCode()));
		
		System.out.println("----------------------------'Function' Interface with Lambda--------------------------------");
		service.print3(states, (s)->s.getCounties());		
	}	
	/**
	 * 
	 * @param states
	 * @param tfi
	 */
	public void print1(List<State> states, TestFunctionalInterface<State, String> tfi){
        for(State state : states){
        	System.out.println(tfi.test(state));
        }        
    }   
	/**
	 * 
	 * @param states
	 * @param Consumer is a Functional Interface. It takes 'State' and returns nothing
	 * @return
	 */
	public void print2(List<State> states, Consumer<State> s){
        for(State state : states){
        	s.accept(state);
        }        
    }
	/**
	 * 
	 * @param states
	 * @param func
	 */
	public void print3(List<State> states, Function<State, Integer> func){
        for(State state : states){
        	System.out.println(func.apply(state));
        }        
    }   
}