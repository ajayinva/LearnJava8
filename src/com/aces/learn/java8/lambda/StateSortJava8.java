package com.aces.learn.java8.lambda;
import static java.util.Comparator.comparing;

import java.util.Collections;
import java.util.List;

import com.aces.learn.java8.LearnJava8Utils;
import com.aces.learn.java8.State;
/**
 * @author aagarwal
 *
 */
public class StateSortJava8 {
	/**
	 * 
	 * @param args
	 */
	public static void main(String... args){				
		System.out.println("----------All States-----------");
		List<State> states = LearnJava8Utils.getAllStates();			
		System.out.println(states);
		System.out.println("--------------------------------------------------------------------------------------------------------------");
				
//******************************************************************************************************************************************************	
		System.out.println("----------Sort States By Name, Specifying Type of 'a' and 'b'----1-------");
		Collections.sort(states, (State a, State b) -> a.getName().compareTo(b.getName()));
		System.out.println(states);
		System.out.println("--------------------------------------------------------------------------------------------------------------");
				
		System.out.println("----------Sort States By Name, Type Inference----2-------");
		Collections.sort(states, (a, b) -> a.getName().compareTo(b.getName()));
		System.out.println(states);
		System.out.println("--------------------------------------------------------------------------------------------------------------");
					
		System.out.println("----------Sort States By Name, Using 'comparing' and Lambda----3-------");
		Collections.sort(states, comparing((s)->s.getName()));
		System.out.println(states);
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
		System.out.println("----------Sort States By Name, Using 'comparing' and Method Reference----4-------");
		Collections.sort(states, comparing(State::getName));
		System.out.println(states);
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
//******************************************************************************************************************************************************		
		
		System.out.println("----------Sort States By No Of Counties, Specifying Type of 'a' and 'b'----1-------");
		Collections.sort(states, (State a, State b) -> a.getCounties().compareTo(b.getCounties()));
		System.out.println(states);
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
		System.out.println("----------Sort States By No Of Counties, Type Inference--------------------2-------");
		Collections.sort(states, (a, b) -> a.getCounties().compareTo(b.getCounties()));
		System.out.println(states);
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
		System.out.println("----------Sort States By No Of Counties, Using 'comparing' and Lambda----3-------");
		Collections.sort(states, comparing((s)->s.getCounties()));
		System.out.println(states);
		System.out.println("--------------------------------------------------------------------------------------------------------------");
				
		System.out.println("----------Sort States By No Of Counties, Using 'comparing' and Method Reference----4-------");
		Collections.sort(states, comparing(State::getCounties));
		System.out.println(states);
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		
//******************************************************************************************************************************************************
		System.out.println("----------Sort States By Counties, then reverse and then Name---------------------------------------------");
		Collections.sort(states, comparing(State::getCounties).reversed().thenComparing(State::getName));
		System.out.println(states);
		System.out.println("--------------------------------------------------------------------------------------------------------------");
	}	
}
