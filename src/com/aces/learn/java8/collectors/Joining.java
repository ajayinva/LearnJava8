/**
 * 
 */
package com.aces.learn.java8.collectors;

import static java.util.stream.Collectors.joining;

import java.util.List;

import com.aces.learn.java8.LearnJava8Utils;
import com.aces.learn.java8.State;

/**
 * @author aagarwal
 *
 */
public class Joining {
	public static void main(String... args){	
		List<State> states = LearnJava8Utils.getAllStates();					
		System.out.println("State Names Ugly::"+states.stream().map(State::getName).collect(joining()));		
				
		System.out.println("-------------------------------------------------------------------------");			
		System.out.println("State Names Pretty::"+states.stream().map(State::getName).collect(joining(", ")));
	}
}
