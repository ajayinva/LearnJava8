/**
 * 
 */
package com.aces.learn.java8.collectors;

import static java.util.stream.Collectors.averagingInt;

import java.util.List;

import com.aces.learn.java8.LearnJava8Utils;
import com.aces.learn.java8.State;

/**
 * @author aagarwal
 *
 */
public class Average {
	public static void main(String... args){	
		List<State> states = LearnJava8Utils.getAllStates();		
		System.out.println("--------------------------Avearage Number of Counties 1----------------------");		
		Double average =  states.stream().collect(averagingInt(s->s.getCounties()));		
		System.out.println("Avearage Number of Counties::"+average);
		
		System.out.println("--------------------------Avearage Number of Counties 2----------------------");			
		System.out.println("Avearage Number of Counties::"+states.stream().collect(averagingInt(State::getCounties)));
	}
}
