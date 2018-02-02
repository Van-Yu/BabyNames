package org.asl.namebank;

import java.util.List;

public class NameExplorer {

	/**
	 * Task 1. Find the most popular name for a year, regardless of gender.
	 * 
	 * @param year
	 * @return the name with the most occurrences
	 */
	public static String mostPopularNameForYear(String year) {
		NameData[] names = NameBank.getArrayForYear(year);
		return names[0].getGivenName(); // this is inaccurate! fix it
	}

	/**
	 * Task 2. Find the most popular name for a year, filtered by gender.
	 * 
	 * @param year
	 * @param gender
	 * @return the name with the most occurrences
	 */
	public static String mostPopularNameForYearByGender(String year, String gender) {
		return null;
	}

	/**
	 * Task 3. Return an array holding the top ten names for the year, in decreasing
	 * popularity, regardless of gender.
	 * 
	 * @param year
	 * @return an array holding, in order, the ten most popular names for that year
	 */
	public static String[] topTenForYear(String year) {
		return null;
	}

	/**
	 * Task 4. Return a count of the number of babies born in a given year, by
	 * gender.
	 * 
	 * @param year
	 * @return the number of babies born with the indicated gender
	 */
	public static int numBabiesByGender(String year, String gender) {
		return 0;
	}

	/**
	 * Task 5. Return a count of the total number of babies born during a given
	 * year, regardless of gender.
	 * 
	 * @param year
	 * @return the number of babies born
	 */
	public static int numBabiesTotal(String year) {
		return 0;
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
		return null;
	}

	/**
	 * Task 7. What name has been assigned to the most babies on record?
	 */
	public static String mostFrequentlyAssignedName() {
		return null;
	}

	/**
	 * Task 8. Collect the name(s) of babies who share the same number of 
	 * occurrences.  Return an array holding their names.
	 * 
	 * @param numberOfOccurrences
	 *            the shared popularity
	 * @return
	 */
	public static String[] getTiedNames(int numberOfOccurrences) {
		return null;
	}

	/**
	 * Task 9a. Often, several names might be considered nicknames for a common
	 * name. For example, "William", "Will", "Bill", "Billy", "Willie", and "Willy"
	 * are all derived from the name "William". Write a method that accepts an
	 * array/list of names and produces an array/list where the derived names have
	 * been removed but their individual counts have been added to the count of the
	 * first (base) name.
	 * 
	 * @param original
	 *            an array of NameData elements
	 * @param year
	 *            the year of interest
	 */
	public static NameData[] mergeDerivedNames(NameData[] original, String year) {
		return null;
	}

	/**
	 * Task 9b. Same as task 9a, but using lists.
	 * 
	 * @param original
	 *            a list of NameData elements
	 * @param year
	 *            the year of interest
	 */
	public static List<NameData> mergeDerivedNames(List<NameData> original) {
		return null;
	}

	/**
	 * Task 10. What is the most popular name given to both females and males in a
	 * given year? As the basis for comparison, determine which names are present
	 * for both males and females then use the minimum of the two counts.
	 * 
	 * @param year
	 *            the year of interest
	 */
	public static String mostPopularGenderNeutral(String year) {
		return null;
	}

	public static void main(String[] args) {
		// Task 1.
		String mp1964 = mostPopularNameForYear("1964"); // Michael
		System.out.println("The most popular name for 1964: " + mp1964);
		String mp1987 = mostPopularNameForYear("1987"); // Michael
		System.out.println("The most popular name for 1987: " + mp1987);
		// Task 2.
		String mpg2001 = mostPopularNameForYearByGender("2001", "F");
		System.out.println("The most popular male name for 2001: " + mpg2001); // Emily
		// Task 3.

		// Task 4.

		// Task 5

		// Task 6

		// Task 7

		/** How might you go about answering the following questions: */
		// When was the height of popularity of your own name?
		// How many different names were given to girls in 1880? in 1980?
		// How many names account for 50% of the babies named in 1880? in 1980?
		// What was the most popular initial letter for a given year?

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
