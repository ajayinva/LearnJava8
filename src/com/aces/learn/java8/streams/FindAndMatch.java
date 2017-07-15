/**
 * 
 */
package com.aces.learn.java8.streams;

import java.util.List;
import java.util.Optional;

import com.aces.learn.java8.LearnJava8Utils;
import com.aces.learn.java8.State;

/**
 * @author aagarwal
 *
 */
public class FindAndMatch {
	public static void main(String... args){	
		List<State> states = LearnJava8Utils.getAllStates();		
		System.out.println("--------------------------------Is there a state with 50 Counties----------------------------");		
		System.out.println("Is there a state with 50 Counties::"+states.stream().anyMatch(s->s.getCounties()==50));
		
		System.out.println("--------------------------------Do all states have more than 100 Counties----------------------------");		
		System.out.println("Do all states have more than 100 Counties::"+states.stream().allMatch(s->s.getCounties() > 100));
		
		System.out.println("--------------------------------Is there a state which doesnt not have exactly 400 counties----------------------------");		
		System.out.println("Is there a state which doesn not have exactly 400 counties::"+states.stream().noneMatch(s->s.getCounties() == 400));
		
		
		System.out.println("--------------------------------A State on east coast----------------------------");
		Optional<State> anyEastCoastState = states.stream().filter(State::isEastCoast).findAny();
		System.out.println(anyEastCoastState);
		
		System.out.println("--------------------------------A State on east coast----------------------------");
		Optional<State> firstEastCoastState = states.stream().filter(State::isEastCoast).findFirst();
		System.out.println(firstEastCoastState);		
	}
}
