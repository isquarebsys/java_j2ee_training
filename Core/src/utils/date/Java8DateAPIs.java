package utils.date;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;

/**
 * https://www.journaldev.com/2800/java-8-date-localdate-localdatetime-instant
 * @author user
 *
 */
public class Java8DateAPIs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		instantExamples();
		formatExamples();
		apiUtils();
	}

	public static void instantExamples() {
		Instant timestamp = Instant.now();
		System.out.println("Current Timestamp = " + timestamp);

		// Instant from timestamp
		Instant specificTime = Instant.ofEpochMilli(timestamp.toEpochMilli());
		System.out.println("Specific Time = " + specificTime);

		// Duration example
		Duration thirtyDay = Duration.ofDays(30);
		System.out.println(thirtyDay);
	}

	public static void formatExamples() {
		// Format examples
		LocalDate date = LocalDate.now();
		// default format
		System.out.println("Default format of LocalDate=" + date);
		// specific format
		System.out.println(date.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy")));
		System.out.println("Basic ISO Date: "+date.format(DateTimeFormatter.BASIC_ISO_DATE));

		LocalDateTime dateTime = LocalDateTime.now();
		// default format
		System.out.println("Default format of LocalDateTime=" + dateTime);
		// specific format
		System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss")));

		Instant timestamp = Instant.now();
		// default format
		System.out.println("Default format of Instant=" + timestamp);

		// Parse examples
		LocalDateTime dt = LocalDateTime.parse("27::Apr::2014 21::39::48",
				DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss"));
		System.out.println("Default format after parsing = " + dt);

		try {
			LocalDateTime thingsAlertTime = LocalDateTime.parse("2017-08-16T02:29:56Z",
					DateTimeFormatter.ofPattern("yyyy-mm-dd'T'HH:mm:ss'Z'"));
			System.out.println("ThingsAlert Time Issue: Default format after parsing = " + thingsAlertTime);				
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception during ThingsAlert Time Issue: "+e.toString());
		}
	}

	public static void apiUtils() {
		// Current Date
		LocalDateTime today = LocalDateTime.now();
		System.out.println("Current DateTime=" + today);

		// Current Date using LocalDate and LocalTime
		today = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println("Current DateTime=" + today);

		// Creating LocalDateTime by providing input arguments
		LocalDateTime specificDate = LocalDateTime.of(2014, Month.JANUARY, 1, 10, 10, 30);
		System.out.println("Specific Date=" + specificDate);

		// Try creating date by providing invalid inputs
		// LocalDateTime feb29_2014 = LocalDateTime.of(2014, Month.FEBRUARY, 28,
		// 25,1,1);
		// Exception in thread "main" java.time.DateTimeException:
		// Invalid value for HourOfDay (valid values 0 - 23): 25

		// Current date in "Asia/Kolkata", you can get it from ZoneId javadoc
		LocalDateTime todayKolkata = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Current Date in IST=" + todayKolkata);

		LocalDateTime nowAtNewYork = LocalDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("Current Date in New York=" + nowAtNewYork);

		// java.time.zone.ZoneRulesException: Unknown time-zone ID: IST
		// LocalDateTime todayIST = LocalDateTime.now(ZoneId.of("IST"));

		// Getting date from the base date i.e 01/01/1970
		LocalDateTime dateFromBase = LocalDateTime.ofEpochSecond(10000, 0, ZoneOffset.UTC);
		System.out.println("10000th second time from 01/01/1970= " + dateFromBase);

		LocalDate today1 = LocalDate.now();

		// Get the Year, check if it's leap year
		System.out.println("Year " + today1.getYear() + " is Leap Year? " + today1.isLeapYear());

		// Compare two LocalDate for before and after
		System.out.println("Today is before 01/01/2015? " + today1.isBefore(LocalDate.of(2015, 1, 1)));

		// Create LocalDateTime from LocalDate
		System.out.println("Current Time=" + today1.atTime(LocalTime.now()));

		// plus and minus operations
		System.out.println("10 days after today will be " + today1.plusDays(10));
		System.out.println("3 weeks after today will be " + today1.plusWeeks(3));
		System.out.println("20 months after today will be " + today1.plusMonths(20));

		System.out.println("10 days before today will be " + today1.minusDays(10));
		System.out.println("3 weeks before today will be " + today1.minusWeeks(3));
		System.out.println("20 months before today will be " + today1.minusMonths(20));

		// Temporal adjusters for adjusting the dates
		System.out.println("First date of this month= " + today1.with(TemporalAdjusters.firstDayOfMonth()));
		LocalDate lastDayOfYear = today1.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("Last date of this year= " + lastDayOfYear);

		Period period = today1.until(lastDayOfYear);
		System.out.println("Period Format= " + period);
		System.out.println("Months remaining in the year= " + period.getMonths());
		System.out.println("DAYS remaining in the year= " + period.getDays());
	}
}
