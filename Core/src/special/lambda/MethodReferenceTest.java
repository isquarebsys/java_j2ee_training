package special.lambda;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collection;
import java.util.function.Supplier;
import java.util.Set;
import java.util.HashSet;
import java.time.chrono.IsoChronology;

/**
 * https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html
 * https://docs.oracle.com/javase/tutorial/java/javaOO/methodreferences.html
 * 
 * @author vijay
 *
 */
public class MethodReferenceTest {

	// The method transferElements copies elements from one collection to
	// another

	public static <T, SOURCE extends Collection<T>, DEST extends Collection<T>> DEST transferElements(
			SOURCE sourceCollection, Supplier<DEST> collectionFactory) {

		DEST result = collectionFactory.get();
		for (T t : sourceCollection) {
			result.add(t);
		}
		return result;
	}

	public static void main(String... args) {

		List<Person> roster = Person.createRoster();

		for (Person p : roster) {
			p.printPerson();
		}

		Person[] rosterAsArray = roster.toArray(new Person[roster.size()]);

		class PersonAgeComparator implements Comparator<Person> {
			public int compare(Person a, Person b) {
				int isDateEqual=a.getBirthday().compareTo(b.getBirthday());
				System.out.println("   isDateEqual: "+isDateEqual);
				return a.getBirthday().compareTo(b.getBirthday());
			}
		}

		// Without method reference
		Arrays.sort(rosterAsArray, new PersonAgeComparator());
		System.out.println("Without method reference");
		for(int i=0;i<rosterAsArray.length;i++) {
			Person p=rosterAsArray[i];
			System.out.println("   Person: "+p.getName());
		}

		// With lambda expression
		Arrays.sort(rosterAsArray, (Person a, Person b) -> {
			System.out.println("With lambda expression");
			return a.getBirthday().compareTo(b.getBirthday());
		});
		for(int i=0;i<rosterAsArray.length;i++) {
			Person p=rosterAsArray[i];
			System.out.println("   Person: "+p.getName());
		}
		

		// With method reference
		Arrays.sort(rosterAsArray, Person::compareByName);
		System.out.println("With method reference");
		for(int i=0;i<rosterAsArray.length;i++) {
			Person p=rosterAsArray[i];
			System.out.println("   Person: "+p.getName());
		}

		// Reference to an instance method of a particular object
		class ComparisonProvider {
			public int compareByName(Person a, Person b) {
				return a.getName().compareTo(b.getName());
			}

			@SuppressWarnings("unused")
			public int compareByAge(Person a, Person b) {
				return a.getBirthday().compareTo(b.getBirthday());
			}
		}
		ComparisonProvider myComparisonProvider = new ComparisonProvider();
		Arrays.sort(rosterAsArray, myComparisonProvider::compareByName);
			

		// Reference to an instance method
		// of an arbitrary object of a particular type

		String[] stringArray = { "Barbara", "James", "Mary", "John", "Patricia", "Robert", "Michael", "Linda" };
		Arrays.sort(stringArray, String::compareToIgnoreCase);
		System.out.println("Printing Sorted Names using METHOD REFERENCES");
		for(int i=0;i<stringArray.length;i++) {
			System.out.println("   "+stringArray[i]);
		}		

		Set<Person> rosterSetLambda = transferElements(roster, () -> {
			return new HashSet<>();
		});

		// new HashSet<>() is equal to HashSet::new
		Set<Person> rosterSet = transferElements(roster, HashSet::new);
		System.out.println("Printing rosterSet:");
		rosterSet.stream().forEach(p -> p.printPerson());
	}

}
