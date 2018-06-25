package org.asl.namebank;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class NameExplorerStreams {

	/**
	 * Task 1. Find the most popular name for a year, regardless of birth gender.
	 * 
	 * @param year
	 * @return the name with the most occurrences
	 */
	public static String mostPopularNameForYear(String year) {
		return NameBank.getAllNameData().parallelStream()
				.filter(nd -> nd.getYear().equals(year))
				.sorted(Collections.reverseOrder(
						Comparator.comparing(NameData::getNumber)))
				.map(nd -> nd.getGivenName()).findFirst()
				.orElse("No matches found");
	}

	/**
	 * Task 2. Find the most popular name for a year, differentiated by birth
	 * gender.
	 * 
	 * @param year
	 * @param gender
	 * @return the name with the most occurrences
	 */
	public static String mostPopularNameForYearByGender(String year,
			String gender) {
		return NameBank.getListForYear(year).parallelStream()
				.filter(nd -> gender.equals(nd.getGender()))
				.sorted(Collections.reverseOrder(
						Comparator.comparing(NameData::getNumber)))
				.map(nd -> nd.getGivenName()).findFirst()
				.orElse("No matches found");
	}

	/**
	 * Task 3. Return a List holding the top names for the year, in decreasing
	 * popularity, regardless of birth gender.
	 * 
	 * @param year
	 * @param n
	 *            the number of names to return
	 * @return a list holding, in descending order, the n most popular names for
	 *         that year
	 */
	public static List<NameData> topNForYear(String year, int n) {
		return NameBank.getListForYear(year).parallelStream()
				.sorted(Collections.reverseOrder(
						Comparator.comparing(NameData::getNumber)))
				.limit(n).collect(toList());
	}

	/**
	 * Task 4. Return a count of the number of babies born in a given year, by
	 * gender.
	 * 
	 * @param year
	 * @return the number of babies born with the indicated gender
	 */
	public static int numBabiesByGender(String year, String gender) {
		return (int) NameBank.getListForYear("1880").parallelStream()
				.filter(nd -> nd.getGender().equals(gender))
				.map(nd -> nd.getNumber()).reduce(0, Integer::sum);
	}

	/**
	 * Task 5. Return a count of the total number of babies born during a given
	 * year, regardless of gender.
	 * 
	 * @param year
	 * @return the number of babies born
	 */
	public static int numBabiesTotal(String year) {
		return (int) NameBank.getListForYear(year).parallelStream()
				.map(nd -> nd.getNumber()).reduce(0, Integer::sum);
	}

	/**
	 * Task 6. Given a name, find the NameData object associated with the name's
	 * most popular year (in terms of ranking). If a name has the same popularity
	 * across multiple years, return the data for year with the highest number of
	 * babies given the name (within a gender).
	 * 
	 * @param the
	 *            name of interest
	 * @return the NameData object of the year that name was most popular
	 */
	public static NameData getMostPopularYear(String name) {
		return NameBank.getAllNameData().parallelStream()
				.filter(nd -> name.equals(nd.getGivenName()))
				.sorted(Collections.reverseOrder(
						Comparator.comparing(NameData::getNumber)))
				.findFirst().orElse(null);
	}

	/**
	 * Task 7. What name has been assigned to the most babies on record?
	 */
	public static String mostFrequentlyAssignedName() {
		return null;
	}

	public static void main(String[] args) {
		// Task 1.
		System.out.println("The most popular name for 1964: "
				+ mostPopularNameForYear("1964"));
		// Task 2.
		String mpg2001 = mostPopularNameForYearByGender("2001", "M");
		System.out.println(
				"The most popular male name for 2001: " + mpg2001); // Michael
		System.out.println("The most popular female name for 2001: "
				+ mostPopularNameForYearByGender("2001", "F"));
		// Task 3.
		List<NameData> topTen2010 = topNForYear("2010", 5);
		System.out.println("Top ten for year 2010: ");
		for (NameData nd : topTen2010)
			System.out.println(nd);

		// Task 4.
		int males1880 = numBabiesByGender("1880", "M");
		int females1880 = numBabiesByGender("1880", "F");
		System.out.println("The number of male babies born in 1880: "
				+ males1880);
		System.out
				.println("The number of female babies born in 1880: "
						+ females1880);

		// Task 5
		int numBabies1880 = numBabiesTotal("1880");
		System.out.println("Total number of babies born in 1880: "
				+ numBabies1880);

		// Task 6
		System.out.println("Most popular year for Kent was ");
		NameData popularData = getMostPopularYear("Kent");
		System.out.println(popularData.getNumber() + " in year "
				+ popularData.getYear());

		// Task 7

		/** How might you go about answering the following questions: */
		// How many different names were given to girls in 1880? in 1980?
		System.out.print("Number of distinct girls names in 1880: ");
		int num1880 = (int) NameBank.getAllNameData()
				.parallelStream()
				.filter(nd -> "F".equals(nd.getGender())
						&& "1880".equals(nd.getYear()))
				.map(nd -> nd.getGivenName()).distinct().count();
		System.out.println(num1880);
		System.out.print("Number of distinct girls names in 1980: ");
		int num1980 = (int) NameBank.getAllNameData()
				.parallelStream()
				.filter(nd -> "F".equals(nd.getGender())
						&& "1980".equals(nd.getYear()))
				.map(nd -> nd.getGivenName()).distinct().count();
		System.out.println(num1980);

		// How many names account for 50% of the babies named in 1880? in 1980?
		List<NameData> allFor1880 = NameBank.getAllNameData()
				.parallelStream()
				.filter(nd -> "1880".equals(nd.getYear()))
				.sorted(Collections.reverseOrder(
						Comparator.comparing(NameData::getNumber)))
				.collect(toList());
		long totalBabies1880 = numBabiesTotal("1880");
		long numSoFar = 0;
		Iterator<NameData> it = allFor1880.iterator();
		NameData nameData = null;
		while (it.hasNext() && numSoFar < totalBabies1880 / 2.0) {
			nameData = it.next();
			numSoFar += nameData.getNumber();
		}
		System.out.println("50% of births covered by "
				+ (allFor1880.indexOf(nameData) + 1)
				+ " names in 1880.");
		List<NameData> allFor1980 = NameBank.getAllNameData()
				.parallelStream()
				.filter(nd -> "1980".equals(nd.getYear()))
				.sorted(Collections.reverseOrder(
						Comparator.comparing(NameData::getNumber)))
				.collect(toList());
		long totalBabies1980 = numBabiesTotal("1980");
		numSoFar = 0;
		it = allFor1980.iterator();
		NameData nd = null;
		while (it.hasNext() && numSoFar < totalBabies1980 / 2.0) {
			nd = it.next();
			numSoFar += nd.getNumber();
		}
		System.out.println("50% of births covered by "
				+ (allFor1980.indexOf(nd) + 1) + " names in 1880.");

		// What was the most popular initial letter for a given year?
		Map<Object, Long> initLetters = NameBank
				.getAllNameData().parallelStream()
				.filter(rec -> "2016".equals(rec.getYear()))
				.collect(groupingBy(
						rec -> rec.getGivenName().substring(0, 1),
						counting()));
		Map<Object, Long> sortedInitLetters = initLetters.entrySet().parallelStream()
				.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new ));
		System.out.println(initLetters);
		System.out.println(sortedInitLetters);

		/**
		 * Extreme challenge 1. Identify the names in a year that had repeated letters,
		 * such as the "n" in "Donna", the "s" in "Massimo", or the "a" in "Pumbaa".
		 * Prepare a list/array of these names in alphabetical order of the repeated
		 * letter, ie. {"Pumbaa", "Donna", "Massimo"}
		 */

		/**
		 * Extreme challenge 2. Which names entered the top 10 for their gender in a
		 * dramatic or explosive way? You might determine the percent change for each
		 * name that was NOT in the top 10 the previous year and from those, identify
		 * the name that entered the top 10 with the highest percentage change. Can you
		 * link this suddenly popular name to a movie, TV show, or historic event?
		 */
	}

}
