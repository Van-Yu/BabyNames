import java.util.List;
import java.util.ArrayList;

public class NameExplorer {

	/**
	 * Task 1. Find the most popular name for a given year.
	 * 
	 * @param year
	 * @return the name with the most occurrences
	 */
	public static String mostPopularNameForYear(String year) {
		ArrayList<NameData> nameForYear = NameService.getListForYear(year);
		String s = null;
		int largest = 0;
		for(NameData n: nameForYear){
			if (n.getNumBabies() > largest){
				s = n.getGivenName();
				largest = n.getNumBabies();
			}
		}

		return s;
	}

	/**
	 * Task 2. Find the most popular name for a year for the indicated gender.
	 * 
	 * @param year
	 * @param gender,
	 *            "M" or "F"
	 * @return the name with the most occurrences
	 */
	public static String mostPopularNameForYearByGender(String year, String gender) {
		ArrayList<NameData> nameForYear = NameService.getListForYear(year);
    	ArrayList<NameData> nameForGender = new ArrayList<NameData>();
		for(NameData n: nameForYear){
			if (n.getGender().equals("F") && gender.equals("F")){
				nameForGender.add(n);
			}
			if (n.getGender().equals("M") && gender.equals("M")){
				nameForGender.add(n);
			}
		}

		String s = null;
		int largest = 0;
		for(NameData n: nameForGender){
			if (n.getNumBabies() > largest){
				s = n.getGivenName();
				largest = n.getNumBabies();
			}
		}

		return s;
	}

	/**
	 * Task 3. Return a count of the number of babies born in a given year, by
	 * gender.
	 * 
	 * @param year
	 * @return the number of babies born with the indicated gender
	 */
	public static int numBabiesByGender(String year, String gender) {
		ArrayList<NameData> nameForYear = NameService.getListForYear(year);
    	ArrayList<NameData> nameForGender = new ArrayList<NameData>();
		for(NameData n: nameForYear){
			if (n.getGender().equals("F") && gender.equals("F")){
				nameForGender.add(n);
			}
			if (n.getGender().equals("M") && gender.equals("M")){
				nameForGender.add(n);
			}
		}

		int total = 0;
		for(NameData n: nameForGender){
			total += n.getNumBabies();
		}

		return total; 
	}

	/**
	 * Task 4. Return a count of the total number of babies born during a given
	 * year, regardless of gender.
	 * 
	 * @param year
	 * @return the number of babies born
	 */
	public static int numBabiesTotal(String year) {
		ArrayList<NameData> namesForYear = NameService.getListForYear(year);
		int total = 0;
		for(NameData n: namesForYear){
			total += n.getNumBabies();
		}

		return total;
	}

	/**
	 * Task 5. Return a list holding the top ten names for the year, in
	 * decreasing popularity, no matter the gender.
	 * 
	 * @param year
	 * @return the ten most popular names
	 */
	public static ArrayList<String> topTenForYear(String year) {

		return null; // TODO implement
	}

	/**
	 * Task 6. Given a name, locate and return the NameData object from the
	 * name's most popular year (in terms of ranking). If a name has the same
	 * popularity across multiple years, return the NameData object from any one
	 * of them.
	 * 
	 * @param the
	 *            name of interest
	 * @return the NameData object of the year that name was most popular
	 */
	public static NameData getMostPopularYear(String name) {
		return null; // TODO implement
	}

	/**
	 * Task 7. Often, several names might be considered nicknames for a common
	 * name. For example, "William", "Will", "Bill", "Billy", "Willie", and
	 * "Willy" are all derived from the base name "William". Write a method that
	 * accepts an array/list of names (strings) and returns the total count for
	 * all.
	 * 
	 * @param original
	 *            a list of string names
	 * @param year
	 *            the year of interest
	 */
	public static int countAsSingleName(List<String> nickNames, String year) {
		int total = 0;
		ArrayList<NameData> namesForYear = NameService.getListForYear(year);
		
		for(String name: nickNames){
			for(NameData baby: namesForYear){
				if (baby.getGivenName().equals(name)) total += baby.getNumBabies();
			}
		}

		return total; // TODO implement
	}

	/**
	 * Task 8. What is the most popular name ever given that starts with the
	 * letter "X"?
	 * 
	 * @param startingLetter
	 *            the year of interest
	 */
	public static String mostPopularStartingWith(String startingLetter) {
		return null;
	}

	/** Additional challenges to consider:
	 * 
	 *  When was the height of popularity for your own name?
	 *  
	 *  How many different names were given to girls in 1880? in 1980?
	 *  
	 *  How many names account for 50% of the babies named in 1880? in 1980?
	 *  
	 *  What is the most popular initial letter?
	 * 
	 *  Prepare an alphabetical list of names that have repeated letters, such 
	 *  as the "n" in "Donna", the "s" in "Massimo", or the "a" in "Pumbaa".
	 * 
	 *  Find names that entered the top 10 in a dramatic or explosive way. For 
	 *  example, You might determine the percent change for each name
	 *  that was NOT in the top 10 the previous year and from those, identify
	 *  the name that entered the top 10 with the highest percentage change.
	 *  Can you link this suddenly popularity to a movie, TV show, or
	 *  historic event?
	 */
	
	public static void main(String[] args) {
		int mostPopularName1986 = numBabiesTotal("1986"); // Michael
		System.out.println("The number of boys born in 1986 was: "+mostPopularName1986);
	}
}
