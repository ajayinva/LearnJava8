/**
 * 
 */
package com.aces.learn.java8;
import java.util.List;
import java.util.function.Consumer;
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
		FunctionalInterfacesJava8 service = new FunctionalInterfacesJava8();											
		System.out.println("----------Functional Interface-------");
		Runnable r = () -> {
			System.out.println("Runnable is a Functional Interface and can be passed as Lamda Function. A Functional Interface is an interface with a single abstract method");
			System.out.println("A Lambda can be assigned to a variable");
			System.out.println("This is an example of multiple statements in a Lambda Function");
		};
		Thread t1 = new Thread(r);
		t1.start();		
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
		List<State> states = LearnJava8Utils.getAllStates();		
		service.print1(states, new StateNamePrinter());		
		service.print1(states, (s)->s.getCode());		
		service.print2(states, (s)->System.out.println(s.getCode()));
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
