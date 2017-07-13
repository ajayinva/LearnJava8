/**
 * 
 */
package com.aces.learn.java8.lambda;

/**
 * @author aagarwal
 *
 */
@FunctionalInterface
public interface TestFunctionalInterface<T, R> {
	R test(T t);
}
