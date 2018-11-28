package org.asl.namebank;

import java.util.List;
import java.util.ArrayList;

public class NameExplorer {

	/**
	 * Task 1. Find the most popular name for a given year, regardless of gender.
	 * 
	 * @param year
	 * @return the name with the most occurrences
	 */
	public static String mostPopularNameForYear(String year) {
		return null;
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
	 * Task 3. Return a list holding the top ten names for the year, in decreasing
	 * popularity, regardless of gender.
	 * 
	 * @param year
	 * @return an array holding, in order, the ten most popular names for that year
	 */
	public static List<String> topTenForYear(String year) {
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
	 * Task 6. Given a name, locate and return the NameData object from the name's
	 * most popular year (in terms of ranking). If a name has the same popularity
	 * across multiple years, return the NameData object from any one of them.
	 * 
	 * @param the
	 *            name of interest
	 * @return the NameData object of the year that name was most popular
	 */
	public static NameData getMostPopularYear(String name) {
		return null;
	}

	/**
	 * Task 7. Often, several names might be considered nicknames for a common name.
	 * For example, "William", "Will", "Bill", "Billy", "Willie", and "Willy" are
	 * all derived from the base name "William". Write a method that accepts an
	 * array/list of names and produces an array/list where the derived names have
	 * been removed but their individual counts have been added to the count of the
	 * original (base) name.
	 * 
	 * @param original
	 *            an array of NameData elements
	 * @param year
	 *            the year of interest
	 */
	public static NameData mergeNames(List<NameData> original, String year) {
		return null;
	}

	/**
	 * Task 8. What is the most popular name given to both females and males in a
	 * given year?
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
		String mp1987 = mostPopularNameForYear("1987"); // Michael
		// Task 2.
		String mpg2001 = mostPopularNameForYearByGender("2001", "F");// Emily
		// Task 3.

		// Task 4.

		// Task 5

		// Task 6

		// Task 7

		// When was the height of popularity of your own name?
		// How many different names were given to girls in 1880? in 1980?
		// How many names account for 50% of the babies named in 1880? in 1980?
		// What was the most popular initial letter for a given year?

		/**
		 * Extreme challenge 1. Identify the names in a year that had repeated letters,
		 * such as the "n" in "Donna", the "s" in "Massimo", or the "a" in "Pumbaa".
		 * Prepare a list/array of these names in alphabetical order.
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
