/**
 * 
 */
package com.aces.learn.java8.collectors;

import static java.util.stream.Collectors.summingInt;

import java.util.List;

import com.aces.learn.java8.LearnJava8Utils;
import com.aces.learn.java8.State;

/**
 * @author aagarwal
 *
 */
public class Sum {
	public static void main(String... args){	
		List<State> states = LearnJava8Utils.getAllStates();		
		System.out.println("--------------------------Total Counties-1---------------------");		
		long totalCounties =  states.stream().collect(summingInt(s->s.getCounties()));		
		System.out.println("Total Counties::"+totalCounties);
		
		
		System.out.println("--------------------------Total Counties-2---------------------");			
		System.out.println("Total Counties::"+states.stream().collect(summingInt(State::getCounties)));
	}
}
