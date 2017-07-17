/**
 * 
 */
package com.aces.learn.java8.collectors;

import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.*;
import java.util.Comparator;
import static java.util.Comparator.comparing;
import com.aces.learn.java8.LearnJava8Utils;
import com.aces.learn.java8.State;

/**
 * @author aagarwal
 *
 */
public class Max {
	public static void main(String... args){	
		List<State> states = LearnJava8Utils.getAllStates();
		
		System.out.println("--------------------------MaxBy takes a comparator-------1----------------------");
		Comparator<State> comparator1 = new Comparator<State>(){
			@Override
			public int compare(State o1, State o2) {
				return o1.getCounties().compareTo(o2.getCounties());
			}			
		};
		Optional<State> state1 = states
				.stream()
				.collect(maxBy(comparator1));		
		System.out.println("State with Maximum Counties::"+state1.get());
		
		
		System.out.println("--------------------------MaxBy takes a comparator-------1----------------------");
		Comparator<State> comparator2 = Comparator.comparingInt(State::getCounties);
		Optional<State> state2 = states
				.stream()
				.collect(maxBy(comparator2));		
		System.out.println("State with Maximum Counties::"+state2.get());
		
		
		System.out.println("--------------------------MaxBy takes a comparator-------3----------------------");		
		Optional<State> state3 = states
				.stream()
				.collect(maxBy((o1,o2)->o1.getCounties().compareTo(o2.getCounties())));		
		System.out.println("State with Maximum Counties::"+state3.get());
		
		
		System.out.println("--------------------------MaxBy takes a comparator-------4----------------------");		
		Optional<State> state = states
								.stream()
								.collect(maxBy(comparing(s->s.getCounties())));		
		System.out.println("State with Maximum Counties::"+state.get());
	}
}
