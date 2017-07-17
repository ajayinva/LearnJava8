/**
 * 
 */
package com.aces.learn.java8.collectors;

import static java.util.stream.Collectors.summarizingInt;

import java.util.IntSummaryStatistics;
import java.util.List;

import com.aces.learn.java8.LearnJava8Utils;
import com.aces.learn.java8.State;

/**
 * @author aagarwal
 *
 */
public class Summary {
	public static void main(String... args){	
		List<State> states = LearnJava8Utils.getAllStates();		
		System.out.println("--------------------------Total Counties-1---------------------");		
		IntSummaryStatistics summaryStatistics =  states.stream().collect(summarizingInt(s->s.getCounties()));		
		System.out.println("Summary::"+summaryStatistics);		
		System.out.println("Count::"+summaryStatistics.getCount());
		System.out.println("Average::"+summaryStatistics.getAverage());
		
		
		System.out.println("--------------------------Total Counties-2---------------------");			
		System.out.println("Total Counties::"+states.stream().collect(summarizingInt(State::getCounties)));
	}
}
