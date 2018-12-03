/***
 * Provides a source of data based on US Social Security registered
 * birth names between 1880 and 2016, inclusive. 
 * 
 * Source: https://www.ssa.gov/oact/babynames/limits.html
 * 
 * Records are provided as NameData objects that associate a given name
 * with the gender of the baby and the total number of babies assigned
 * that name during a particular year.
 * 
 * K Collins, Spring 2018

 */
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NameBank {

	private static HashMap<String, List<NameData>> dataByYear;
	private static HashSet<NameData> names;

	static {
		initializeNameData();
	}
	
	/**
	 * Retrieves a list holding a String for each year on record.
	 * 
	 * @return a list of all years
	 */
	public static List<String> getListOfYears() {
		return new ArrayList<String>(dataByYear.keySet());
	}
	
	/**
	 * Retrieves an array holding a String for each year on record.
	 * 
	 * @return an array of all years
	 */
	public static String[] getArrayOfYears() {
		List<String> stringList = getListOfYears();
		int numEntries = stringList.size();
		return stringList.toArray(new String[numEntries]);
	}

	/**
	 * Retrieves a list of NameData entries for the given year.
	 * 
	 * @param year of interest
	 * @return a list of NameData entries
	 */
	public static List<NameData> getListForYear(String year) {
		return dataByYear.get(year);
	}

	/**
	 * Retrieves an array of NameData entries for the given year.
	 * 
	 * @param year of interest
	 * @return an array of NameData entries
	 */
	public static NameData[] getArrayForYear(String year) {
		List<NameData> data = getListForYear(year);
		int numEntries = data.size();
		return data.toArray(new NameData[numEntries]);
	}
	
	public static Set<NameData> getAllNameData() {
		return names;
	}

	private static void initializeNameData() {
		dataByYear = new HashMap<String, List<NameData>>();
		names = new HashSet<NameData>();
		File directory = new File(
				NameBank.class.getResource("/names/").getFile());
		File[] files = directory.listFiles(new FilenameFilter() {
			public boolean accept(File dir, String name) {
				return name.endsWith("txt");
			}
		});
		try {
			for (File f : files) {
				String year = f.getName().substring(3,
						f.getName().indexOf('.'));
				List<String> lines = Files
						.readAllLines(Paths.get(f.getPath()));
				List<NameData> listByYear = new ArrayList<NameData>();
				for (String line : lines) {
					String[] data = line.split(",");
					String name = data[0];
					String gender = data[1];
					int number = Integer.parseInt(data[2]);
					NameData nd = new NameData(year, name,
							gender, number);
					listByYear.add(nd);
					names.add(nd);
				}
				dataByYear.put(year, listByYear);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
