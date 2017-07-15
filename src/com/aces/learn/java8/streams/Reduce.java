/**
 * 
 */
package com.aces.learn.java8.streams;

import java.util.Arrays;
import java.util.List;
import com.aces.learn.java8.LearnJava8Utils;
import com.aces.learn.java8.State;

/**
 * @author aagarwal
 *
 */
public class Reduce {
	public static void main(String... args){	
		List<State> states = LearnJava8Utils.getAllStates();		
		System.out.println("--------------------------------Total Number of Counties in US using Lambda----------------------------");
		System.out.println(states.stream().map(s->s.getCounties()).reduce(0, (a,b)->a+b));
		
		System.out.println("--------------------------------Total Number of Counties in US using method Reference----------------------------");
		System.out.println(states.stream().map(s->s.getCounties()).reduce(0, Integer::sum));
		
		System.out.println("--------------------------------The largest number using method Ref----------------------------");
		List<Integer> numbers = Arrays.asList(1,2,3,4,9,10,8,2,4,5);
		System.out.println(numbers.stream().reduce(Integer::max));
		
		System.out.println("--------------------------------The Smallest number using Lambda----------------------------");		
		System.out.println(numbers.stream().reduce((n1,n2)-> n1<n2 ? n1:n2));
		
		System.out.println("-------------------------------Count the number of states using map and reduce----------------------------");		
		System.out.println(states.stream().map(s->1).reduce(Integer::sum));
	}
}
