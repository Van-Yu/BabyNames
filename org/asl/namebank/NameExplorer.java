package org.asl.namebank;

public class NameExplorer {

	/**
	 * Task 1. Find the most popular name for a year, regardless of gender.
	 * 
	 * @param year
	 * @return the name with the most occurrences
	 */
	public String mostPopularNameForYear(String year) {
		return null;
	}

	/**
	 * Task 2. Find the most popular name for a year, filtered by gender.
	 * 
	 * @param year
	 * @param gender
	 * @return the name with the most occurrences
	 */
	public String mostPopularNameForYearByGender(String year,
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
	public String[] topTenForYear(String year) {
		return null;
	}

	/**
	 * Task 4. Return a count of the number of babies born in a given year, by
	 * gender.
	 * 
	 * @param year
	 * @return the number of babies born with the indicated gender
	 */
	public int numBabiesByGender(String year, String gender) {
		return 0;
	}

	/**
	 * Task 5. Return a count of the total number of babies born during a given
	 * year, regardless of gender.
	 * 
	 * @param year
	 * @return the number of babies born
	 */
	public int numBabiesTotal(String year) {
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
	public NameData getMostPopularYear(String name) {
		return null;
	}

	/**
	 * Task 7. What name has been assigned to the most babies on record?
	 */
	public String mostFrequentlyAssignedName() {
		return null;
	}
}
