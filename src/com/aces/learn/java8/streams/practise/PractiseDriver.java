/**
 * 
 */
package com.aces.learn.java8.streams.practise;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;
import static java.util.Comparator.comparing;

/**
 * @author aagarwal
 *
 */
public class PractiseDriver {
	public static void main(String... args){
		
		Trader ajay = new Trader("Ajay", "Mumbai");
        Trader vijay = new Trader("Vijay","Delhi");
        Trader sanjay = new Trader("Sanjay","Mumbai");
        Trader zaheer = new Trader("Zaheer","Mumbai");
		
		List<Transaction> transactions = Arrays.asList(
            new Transaction(ajay, 2011, 300), 
            new Transaction(vijay, 2012, 1000),
            new Transaction(vijay, 2011, 400),
            new Transaction(sanjay, 2012, 710),	
            new Transaction(ajay, 2012, 700),
            new Transaction(zaheer, 2012, 950)
        );
		
		System.out.println("----------------------------All Transactions in 2012 and sort them by value using Lambda------------------------");
		System.out.println(
			transactions
			.stream()
			.filter(t->t.getYear()==2012)
			.sorted((v1,v2)-> new Integer(v1.getValue()).compareTo(v2.getValue()))
			.collect(toList())
		);
		
		System.out.println("----------------------------All Transactions in 2012 and sort them by value using Method Reference------------------------");
		System.out.println(
			transactions
			.stream()
			.filter(t->t.getYear()==2012)
			.sorted(comparing(Transaction::getValue))
			.collect(toList())
		);
		
		System.out.println("----------------------------Unique Cities for the traders------------------------");
		System.out.println(
			transactions
			.stream()
			.map(t->t.getTrader().getCity())
			.distinct()
			.collect(toList())
		);
		
		System.out.println("----------------------------All Traders in Mumbai sorted by their name------------------------");
		System.out.println(
			transactions
			.stream()
			.filter(t->t.getTrader().getCity().equals("Mumbai"))
			.map(t->t.getTrader().getName())
			.distinct()
			.sorted()
			.collect(toList())
		);		
		System.out.println("----------------------------All Traders as a String sorted by their name------------------------");
		System.out.println(
			transactions
			.stream()				
			.map(t->t.getTrader().getName())
			.distinct()
			.sorted()
			.reduce((a,b)-> a+" "+b).get()
		);
		System.out.println("----------------------------Are any traders based in Jaipur------------------------");
		System.out.println(
			transactions
			.stream()
			.anyMatch(t->t.getTrader().getCity().equals("Jaipur"))
		);
		System.out.println("----------------------------Print all transaction values for the trades in Mumbai------------------------");		
			transactions
			.stream()
			.filter(t->t.getTrader().getCity().equals("Mumbai"))
			.forEach(t-> System.out.println(t.getValue())
		);
		
		System.out.println("---------------------------Highest value of Transaction------------------------");	
		System.out.println(
			transactions
			.stream()
			.map(t->t.getValue())
			.reduce(Integer::max)
		);
		System.out.println("---------------------------The transaction with the smallest value------------------------");	
		System.out.println(
			transactions
			.stream()
			.reduce((t1,t2)->t1.getValue() < t2.getValue() ? t1 :t2)
		);
		System.out.println("---------------------------The transaction with the smallest value------------------------");	
		System.out.println(
			transactions
			.stream()
			.min(comparing(Transaction::getValue))
		);
	}
}
