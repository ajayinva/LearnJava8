/**
 * 
 */
package com.aces.learn.java8.collectors;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.summingInt;
import static java.util.stream.Collectors.toCollection;
import static java.util.stream.Collectors.toSet;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

import com.aces.learn.java8.LearnJava8Utils;
import com.aces.learn.java8.State;

/**
 * @author aagarwal
 *
 */
public class Grouping {
	
	private enum StateSize {LARGE, MEDIUM, SMALL};
	
	public static void main(String... args){	
		List<State> states = LearnJava8Utils.getAllStates();		
		
		System.out.println("--------------------------Group By Location----------------------");		
		Map<State.LOCATION, List<State>> groupByLocation = states.stream().collect(groupingBy(s->s.getLocation()));	
		groupByLocation.forEach((k,v)->{
			System.out.println(k);
			System.out.println(v);
		});
				
		System.out.println("--------------------------Group By Size----------------------");		
		Map<StateSize, List<State>> groupBySize = states.stream().collect(groupingBy(s->{
			int counties = s.getCounties();
			if(counties>=0 && counties<=100) return StateSize.SMALL;
			if(counties>100 && counties<=500) return StateSize.MEDIUM;
			return StateSize.LARGE;
		}));	
		groupBySize.forEach((k,v)->{
			System.out.println(k);
			System.out.println(v);
		});
				
		System.out.println("--------------------------Group By Location and Size----------------------");		
		Map<State.LOCATION, Map<StateSize, List<State>>> groupByLocationAndSize = states.stream().collect(groupingBy(State::getLocation, groupingBy(s->{
			int counties = s.getCounties();
			if(counties>=0 && counties<=100) return StateSize.SMALL;
			if(counties>100 && counties<=500) return StateSize.MEDIUM;
			return StateSize.LARGE;
		})));	
		groupByLocationAndSize.forEach((k,v)->{
			System.out.println(k);
			System.out.println(v);
		});
				
		System.out.println("--------------------------Largest State in each location with Optional----------------------");		
		Map<State.LOCATION,Optional<State>> largestStateInEachLocation1 = states.stream().collect(groupingBy(State::getLocation, maxBy(Comparator.comparingInt(State::getCounties))));	
		largestStateInEachLocation1.forEach((k,v)->{
			System.out.println(k);
			System.out.println(v);
		});
		
		System.out.println("--------------------------Largest State in each location without Optional(Adapting)----------------------");		
		Map<State.LOCATION,State> largestStateInEachLocation2 = states
																.stream()
																	.collect(
																		groupingBy(
																			State::getLocation
																		, 	collectingAndThen(
																				maxBy(Comparator.comparingInt(State::getCounties))
																			, 	Optional::get
																			)
																		)
																	);	
		largestStateInEachLocation2.forEach((k,v)->{
			System.out.println(k);
			System.out.println(v);
		});
		
		
		System.out.println("--------------------------Number of Counties by Location----------------------");		
		Map<State.LOCATION,Integer> numberOfCountiesByLocation = states.stream().collect(groupingBy(State::getLocation, summingInt(State::getCounties)));	
		numberOfCountiesByLocation.forEach((k,v)->{
			System.out.println(k);
			System.out.println(v);
		});
		
		System.out.println("--------------------------Group By Location and Size----------------------");		
		Map<State.LOCATION, Set<Object>> stateSizePerLocation1 
				= states.stream().collect(groupingBy(State::getLocation, mapping(s->{
							int counties = s.getCounties();
							if(counties>=0 && counties<=100) return StateSize.SMALL;
							if(counties>100 && counties<=500) return StateSize.MEDIUM;
							return StateSize.LARGE;
						}, toSet()
				)));	
		stateSizePerLocation1.forEach((k,v)->{
			System.out.println(k);
			System.out.println(v);
		});
		
		System.out.println("--------------------------Group By Location and Size-----Sorted-----------------");		
		Map<State.LOCATION, Set<Object>> stateSizePerLocation2 
				= states.stream().collect(groupingBy(State::getLocation, mapping(s->{
							int counties = s.getCounties();
							if(counties>=0 && counties<=100) return StateSize.SMALL;
							if(counties>100 && counties<=500) return StateSize.MEDIUM;
							return StateSize.LARGE;
						}, toCollection(TreeSet::new)
				)));	
		stateSizePerLocation2.forEach((k,v)->{
			System.out.println(k);
			System.out.println(v);
		});
	}
}
