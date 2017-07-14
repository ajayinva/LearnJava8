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
public class Map {
	public static void main(String... args){	
		List<State> states = LearnJava8Utils.getAllStates();		
		System.out.println("--------------------------------Return All US East Coast States Names use Method Reference----------------------------");
		List<String> eastCoastStateNamesMethodRef = states
											.stream()
											.filter(State::isEastCoast)
											.map(State::getName)
											.collect(toList());
		System.out.println(eastCoastStateNamesMethodRef);		
		System.out.println("--------------------------------Return All US East Coast States Names use Lambda--------------------------------------");
		List<String> eastCoastStateNamesLambda = states
											.stream()
											.filter(s->s.isEastCoast())
											.map(s->s.getName())
											.collect(toList());
		System.out.println(eastCoastStateNamesLambda);
		System.out.println("--------------------------------Return All US States Codes use Method Reference--------------------------------------");
		List<String> allStateCodes = states
										.stream()
										.map(State::getCode)
										.collect(toList());
		System.out.println(allStateCodes);
	}
}
