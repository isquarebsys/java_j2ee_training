package regex;

import java.util.regex.Pattern;

/**
 * https://www.javatpoint.com/java-regex
 * @author user
 *
 */
public class RegexSimple1 {

	public static void main(String[] args) {
		// Check chars
		//. represents first 1 char, .. represents first 2
		System.out.println(Pattern.matches(".s", "as"));//true (Check if 2nd char is s)
		System.out.println(Pattern.matches(".s", "mk"));//false (Check if 2nd char is s)
		System.out.println(Pattern.matches("..s", "mas"));//true (Check if 3rd char is s)
		
		// Check words
		//. represents first 1 char, .. represents first 2
		System.out.println(Pattern.matches("....nai", "chennai"));//true (Check if the word nai starts from 5th char)
		
		/**
		 *		1	[abc]	a, b, or c (simple class)
				2	[^abc]	Any character except a, b, or c (negation)
				3	[a-zA-Z]	a through z or A through Z, inclusive (range)
				4	[a-d[m-p]]	a through d, or m through p: [a-dm-p] (union)
				5	[a-z&&[def]]	d, e, or f (intersection)
				6	[a-z&&[^bc]]	a through z, except for b and c: [ad-z] (subtraction)
				7	[a-z&&[^m-p]]	a through z, and not m through p: [a-lq-z](subtract
		 */
		System.out.println(Pattern.matches("[^abc]", "vennai"));//false (Check if the word nai starts from 5th char)
	}

}
