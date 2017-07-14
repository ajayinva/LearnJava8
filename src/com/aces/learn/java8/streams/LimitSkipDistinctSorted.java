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
public class LimitSkipDistinctSorted {
	public static void main(String... args){	
		List<State> states = LearnJava8Utils.getAllStates();		
		System.out.println("--------------------------------Return the first 3 states--------------------------------------");
		List<State> first3States = states
										.stream()
										.limit(3)
										.collect(toList());
		System.out.println(first3States);
		
		
		System.out.println("--------------------------------All States, but the first 3--------------------------------------");
		List<State> allStatesButTheFirst3 = states
										.stream()
										.skip(3)
										.collect(toList());
		System.out.println(allStatesButTheFirst3);			
		
		
		System.out.println("--------------------------------Distinct No of Counties--------------------------------------");
		List<Integer> distinctValuesForCounties = states
										.stream()
										.map(s->s.getCounties())
										.distinct()
										.collect(toList());
		System.out.println(distinctValuesForCounties);		
		System.out.println("-------------------------------Count the Number of States--------------------------------------");	
		System.out.println("Total States in Collection::"+states.stream().count());
		
		System.out.println("--------------------------------Distinct and Sorted No of Counties--------------------------------------");
		List<Integer> distinctAndSortedValuesForCounties = states
										.stream()
										.map(s->s.getCounties())
										.distinct()
										.sorted()
										.collect(toList());
		System.out.println(distinctAndSortedValuesForCounties);
		
		
		System.out.println("-------------------------------All Together--------------------------------------");	
		System.out.println(
			"All Operations Output::"
					+ states.stream()
							.map(s->s.getCounties())
							.distinct() //returns 8
							.sorted() //sorts
							.skip(5) //skips the first 5
							.limit(2) // Limits to 2
							.count() // count is 2
		);
	}
}
