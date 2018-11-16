/**
 *
 */
package com.aces.learn.java8.collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.partitioningBy;

import java.util.List;
import java.util.Map;

import com.aces.learn.java8.LearnJava8Utils;
import com.aces.learn.java8.State;
import com.aces.learn.java8.State.LOCATION;

/**
 * @author aagarwal
 *
 */
public class Partitioning {
  public static void main(final String... args){
    final List<State> states = LearnJava8Utils.getAllStates();

    System.out.println("--------------------------Group By Location----------------------");
    final Map<Boolean, List<State>> statesByCoast1 = states.stream().collect(partitioningBy(State::isEastCoast));
    System.out.println("**************************************East Coast States 1**************************************");
    System.out.println(statesByCoast1.get(true));
    System.out.println("**********************************Non East Coast States**************************************");
    System.out.println(statesByCoast1.get(false));


    final Map<Boolean, Map<LOCATION, List<State>>> statesByCoast2 = states.stream().collect(partitioningBy(State::isEastCoast, groupingBy(State::getLocation)));
    System.out.println("**************************************East Coast States**************************************");
    System.out.println(statesByCoast2.get(true));
    System.out.println("**********************************Non East Coast States**************************************");
    System.out.println(statesByCoast2.get(false));


    final Map<Boolean, Long> statesByCoast3 = states.stream().collect(partitioningBy(State::isEastCoast, counting()));
    System.out.println("*********************************Count East Coast States**************************************");
    System.out.println(statesByCoast3.get(true));
    System.out.println("*********************************Count Non East Coast States**************************************");
    System.out.println(statesByCoast3.get(false));
  }
}
