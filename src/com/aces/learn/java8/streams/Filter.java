/**
 * 
 */
package com.aces.learn.java8.streams;

import java.util.List;
import static java.util.stream.Collectors.toList;

import com.aces.learn.java8.LearnJava8Utils;
import com.aces.learn.java8.State;

/**
 * @author aagarwal
 *
 */
public class Filter {
	public static void main(String... args){	
		List<State> states = LearnJava8Utils.getAllStates();
		
		System.out.println("--------------------------------Filter All US East Coast States use Lambda--------------------------------------");
		List<State> eastCoastStatesWithLambda = states.stream().filter(s->s.isEastCoast()).collect(toList());
		System.out.println(eastCoastStatesWithLambda);
		
		System.out.println("--------------------------------Filter All US East Coast States use Method Reference--------------------------------------");
		List<State> eastCoastStatesWithMethodRef = states.stream().filter(State::isEastCoast).collect(toList());
		System.out.println(eastCoastStatesWithMethodRef);
	}
}
