package functions;

import java.util.function.Predicate;
/**
 * Usage: Takes in a value and returns true or false
 * test is the default method. Functional interfaces are nothing but classes with 1 abstract method
 * @author user
 *
 */
public class PredicateSimple1 {
	public static void main(String[] args) {
		// Creating predicate
		Predicate<Integer> lesserthan = i -> (i < 18);

		// Calling Predicate method
		System.out.println(lesserthan.test(10));
	}
}
