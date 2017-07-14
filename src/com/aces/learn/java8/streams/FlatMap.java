/** 
 * 
 */
package com.aces.learn.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 * @author aagarwal
 *
 */
public class FlatMap {
	public static void main(String... args){	
		List<String> words = Arrays.asList("Hello", "World");		
		System.out.println("-----------------------------Flat Map in One go. Find Distinct letters in a list of words");
		List<String> letters =	words
								.stream()
								.map(word->word.split("")) //Produces a stream of Arrays Stream<String[]>
								.flatMap(array->Arrays.stream(array)) // Produces a stream of strings ; Stream<String>
								.distinct() //distinct
								.collect(Collectors.toList());			
		System.out.println(letters);		
		System.out.println("-----------------------------Flat Map Step By Step. Find Distinct letters in a list of words----------------------------");
		Stream<String[]> streamOfLetterArrays = words.stream().map(word->word.split(""));//Produces a stream of Arrays Stream<String[]>	
		Stream<String> streamOfLetter =	 streamOfLetterArrays.flatMap(array->Arrays.stream(array)); // Produces a stream of strings ; Stream<String>
		List<String> distinctLetters = streamOfLetter.distinct().collect(Collectors.toList());			
		System.out.println(distinctLetters);
		
		System.out.println("-----------------------------Create Number Pairs----------------------------");
		//[1,2,3] [4, 5] = (1,4) (1,5) (2,4) (2,5) (3,4) (3,5)		
		
		List<Integer> numbers1= Arrays.asList(1,2,3);//[1,2,3] 
		List<Integer> numbers2= Arrays.asList(4,5);//[4, 5]
		
		List<Value> numberPairs = numbers1.stream().flatMap(i-> {
			Stream<Value> s = numbers2.stream().map(j-> new Value(i, j));
			return s;
		}).collect(Collectors.toList());
		
		System.out.println(numberPairs);//(1,4) (1,5) (2,4) (2,5) (3,4) (3,5)
		
		
		System.out.println("-----------------------------Number Pairs only Divisible by 3----------------------------");
		List<Value> numberPairsDivisibleBy3 = numbers1.stream().flatMap(i->
			numbers2.stream().filter(j->(i+j)%3==0).map(j-> new Value(i, j))			
		).collect(Collectors.toList());
		System.out.println(numberPairsDivisibleBy3);
	}
}
class Value {
	int i = 0;
	int j = 0;
	Value(int i, int j){
		this.i = i;
		this.j= j;
	}
	public String toString(){
		return "("+i+","+j+")"; 
	}
}
