package less.ons10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListSt {

	public static void main(String[] args) {
		
		// Write a method for sorting list of Strings using Java 8
		List<String> strings = Arrays.asList("Stepan", "Anna", "Ira", "Paul");

		List<String> sortedList = strings.stream().sorted().collect(Collectors.toList());

		sortedList.forEach(System.out::println);

	}

}
