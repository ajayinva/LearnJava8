/**
 *
 */
package com.aces.learn.java8.collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.maxBy;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import com.aces.learn.java8.LearnJava8Utils;
import com.aces.learn.java8.State;

/**
 * @author aagarwal
 *
 */
public class Max {
  public static void main(final String... args){
    final List<State> states = LearnJava8Utils.getAllStates();

    System.out.println("--------------------------MaxBy takes a comparator 1-------1----------------------");
    final Comparator<State> comparator1 = new Comparator<State>(){
      @Override
      public int compare(final State o1, final State o2) {
        return o1.getCounties().compareTo(o2.getCounties());
      }
    };
    final Optional<State> state1 = states
        .stream()
        .collect(maxBy(comparator1));
    System.out.println("State with Maximum Counties::"+state1.get());


    System.out.println("--------------------------MaxBy takes a comparator-------1----------------------");
    final Comparator<State> comparator2 = Comparator.comparingInt(State::getCounties);
    final Optional<State> state2 = states
        .stream()
        .collect(maxBy(comparator2));
    System.out.println("State with Maximum Counties::"+state2.get());


    System.out.println("--------------------------MaxBy takes a comparator-------3----------------------");
    final Optional<State> state3 = states
        .stream()
        .collect(maxBy((o1,o2)->o1.getCounties().compareTo(o2.getCounties())));
    System.out.println("State with Maximum Counties::"+state3.get());


    System.out.println("--------------------------MaxBy takes a comparator-------4----------------------");
    final Optional<State> state = states
        .stream()
        .collect(maxBy(comparing(s->s.getCounties())));
    System.out.println("State with Maximum Counties::"+state.get());
  }
}
