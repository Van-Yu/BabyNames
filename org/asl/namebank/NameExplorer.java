package org.asl.namebank;

public class NameExplorer {

	/**
	 * Task 1. Find the most popular name for a year, regardless of gender.
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
	public static String mostPopularNameForYearByGender(String year,
			String gender) {
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
	
	public static void main(String[] args) {
		// Task 1.
		String mp1964 = mostPopularNameForYear("1964"); // Michael
		System.out.println(
				"The most popular name for 1964: " + mp1964);
		String mp1987 = mostPopularNameForYear("1987"); // Michael
		System.out.println(
				"The most popular name for 1987: " + mp1987);
		// Task 2.
		String mpg2001 = mostPopularNameForYearByGender("2001", "M");
		System.out.println(
				"The most popular male name for 2001: " + mpg2001); // Michael
		// Task 3.

		// Task 4.

		// Task 5

		// Task 6

		// Task 7

		/** How might you go about answering the following questions: */
		// Is Michael always the most popular name given in a year?
		// When was the height of popularity of your own name?
		// How many different names were given to girls in 1880? in 1980?
		// How many names account for 50% of the babies named in 1880? in 1980?
	}

}
