/***
 * Provides a source of data based on US Social Security registered
 * birth names between 1880 and 2016, inclusive. 
 * 
 * Source: https://www.ssa.gov/oact/babynames/limits.html
 * 
 * Records are provided as NameData objects associating a given name
 * with the gender of the individual and the number of babies assigned
 * that name during the particular year.
 * 
 * K Collins, Spring 2018

 */ 
package org.asl.namebank;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class NameBank {

	private static HashMap<Integer, List<NameData>> namesByYear;

	static {
		initializeNameData();
	}

	public static void main(String[] args) {
		NameData[] names = getArrayForYear(1964);
		for (NameData nd:names) {
			System.out.println(nd.getName());
		}
	}

	public static List<NameData> getListForYear(int year) {
		return namesByYear.get(year);
	}
	
	public static NameData[] getArrayForYear(int year) {
		List<NameData> data = getListForYear(year);
		int numEntries = data.size();
		return data.toArray(new NameData[numEntries]);
	}

	private static void initializeNameData() {
		namesByYear = new HashMap<Integer, List<NameData>>();
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
				List<NameData> yearlyTallies = new ArrayList<NameData>();
				for (String line: lines) {
					String[] data = line.split(",");
					yearlyTallies.add(new NameData(data[0], data[1], data[2]));
				}
				namesByYear.put(Integer.parseInt(year), yearlyTallies);
			}
			System.out.println(namesByYear.keySet());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
