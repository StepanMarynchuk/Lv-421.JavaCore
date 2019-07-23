package less.ons10;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;

public class NewJava {

	private static final DayOfWeek MONDAY = null;

	public static void main(String[] args) {
		
		//Print n random numbers on console using Java 8
		Random random = new Random();
		random.ints(1,10).limit(10).forEach(System.out::println);
		
		//Print n random numbers on console using Java 8 in a sorted order
		random.ints(5,34).limit(10).sorted().forEach(System.out::println);
		
		//Using Java 8 show the biggest number from n random numbers

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 5);
		IntSummaryStatistics stats = numbers.stream()
			.mapToInt((x) -> x).summaryStatistics();
		System.out.println("Highest number in List : " + stats.getMax());
		
		//Show witch today is a day of a week
		LocalDate currentTime = LocalDate.now();
		System.out.println(currentTime.getDayOfWeek());	
		
		//Show a date of first Monday for current month
		
		LocalDate a = LocalDate.of(2019, 7, 23);
		LocalDate  t = a.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println(t);


		
	}

}
