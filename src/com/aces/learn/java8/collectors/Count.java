/**
 * 
 */
package com.aces.learn.java8.collectors;

import java.util.List;
import static java.util.stream.Collectors.*;

import com.aces.learn.java8.LearnJava8Utils;
import com.aces.learn.java8.State;

/**
 * @author aagarwal
 *
 */
public class Count {
	public static void main(String... args){	
		List<State> states = LearnJava8Utils.getAllStates();	
		System.out.println("Total States::"+states.stream().collect(counting()));
	}
}
