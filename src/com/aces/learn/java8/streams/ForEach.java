/**
 * 
 */
package com.aces.learn.java8.streams;

import java.util.List;

import com.aces.learn.java8.LearnJava8Utils;
import com.aces.learn.java8.State;

/**
 * @author aagarwal
 *
 */
public class ForEach {
	public static void main(String... args){	
		List<State> states = LearnJava8Utils.getAllStates();
		
		System.out.println("--------------------------------Print All States using Method Ref--------------------------------------");
		states.stream().forEach(System.out::println);
		
		System.out.println("--------------------------------Print All State Code using Lambda--------------------------------------");
		states.stream().forEach(s-> System.out.println(s.getCode()));
		
		System.out.println("--------------------------------Process all states using mupltiple statements in Lambda--------------------------------------");
		states.stream().forEach(s-> {
			String name = s.getName();
			String code = s.getCode();
			System.out.println(code+"-"+name);
		});
	}
}
