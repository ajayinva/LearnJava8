/**
 * 
 */
package com.aces.learn.java8.collectors;

import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.*;
import com.aces.learn.java8.LearnJava8Utils;
import com.aces.learn.java8.State;

/**
 * @author aagarwal
 *
 */
public class ReducingMax {
	public static void main(String... args){	
		List<State> states = LearnJava8Utils.getAllStates();
		
		System.out.println("--------------------------MaxBy takes a comparator-------1----------------------");	
		Optional<State> state = states
								.stream()
								.collect(reducing((s1,s2)-> s1.getCounties() > s2.getCounties() ? s1 : s2));		
		System.out.println("State with Maximum Counties::"+state.get());
	}
}
