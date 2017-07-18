/**
 * 
 */
package com.aces.learn.java8.collectors;

import java.util.List;
import java.util.Optional;
import static java.util.stream.Collectors.reducing;
import com.aces.learn.java8.LearnJava8Utils;
import com.aces.learn.java8.State;

/**
 * @author aagarwal
 *
 */
public class ReduceJoining {
	public static void main(String... args){	
		List<State> states = LearnJava8Utils.getAllStates();		
		System.out.println("--------------------------State Names--1-------------------");		
		Optional<String> stateString1 =  states
								.stream()
								.map(State::getName)
								.reduce((s1,s2)->s1+s2);
		System.out.println("All States::"+stateString1);
		
		System.out.println("--------------------------State Names--2-------------------");		
		String stateString2 =  states
								.stream()
								.collect(reducing("", State::getName, (s1,s2)->s1+s2));							
		System.out.println("All States::"+stateString2);
		
		System.out.println("--------------------------State Names--3-------------------");		
		Optional<String> stateString3 =  states
										.stream()
										.map(State::getName)
										.collect(reducing((s1,s2)->s1+s2));							
		System.out.println("All States::"+stateString3);
	}
}
