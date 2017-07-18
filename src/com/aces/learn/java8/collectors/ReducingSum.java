/**
 * 
 */
package com.aces.learn.java8.collectors;

import static java.util.stream.Collectors.reducing;

import java.util.List;

import com.aces.learn.java8.LearnJava8Utils;
import com.aces.learn.java8.State;

/**
 * @author aagarwal
 *
 */
public class ReducingSum {
	public static void main(String... args){	
		List<State> states = LearnJava8Utils.getAllStates();		
		System.out.println("--------------------------Total Counties-1---------------------");		
		long totalCounties1 =  states
								.stream()
								.collect(
									reducing(
										0
									,	State::getCounties
									, 	(a,b)->a+b)
									);		
		System.out.println("Total Counties::"+totalCounties1);
		
		
		System.out.println("--------------------------Total Counties-2---------------------");		
		long totalCounties2 =  states
								.stream()
								.collect(
									reducing(
										0
									,	State::getCounties
									, 	Integer::sum)
									);		
		System.out.println("Total Counties::"+totalCounties2);
			
		System.out.println("--------------------------Total Counties-3---------------------");		
		Integer totalCounties3 =  states
								.stream()
								.map(State::getCounties)
								.reduce(Integer::sum).get();
		System.out.println("Total Counties::"+totalCounties3);
		
		System.out.println("--------------------------Total Counties-4---------------------");		
		Integer totalCounties4 =  states
								.stream()
								.mapToInt(State::getCounties)
								.sum();
		System.out.println("Total Counties::"+totalCounties4);
	}
}
