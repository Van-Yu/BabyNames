/***
 * Runner for testing methods of the NameExplorer class.
 * 
 * @author kentcollins
 *
 */
package org.asl.namebank;

public class ProjectTester {

	public static void main(String[] args) {
		NameExplorer explorer = new NameExplorer();
		// Task 1.
		String mp1964 = explorer.mostPopularNameForYear("1964"); // Michael
		System.out.println(
				"The most popular name for 1964: " + mp1964);
		String mp1987 = explorer.mostPopularNameForYear("1987"); // Michael
		System.out.println(
				"The most popular name for 1987: " + mp1987);
		// Task 2.
		String mpg2001 = explorer
				.mostPopularNameForYearByGender("2001", "M");
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
