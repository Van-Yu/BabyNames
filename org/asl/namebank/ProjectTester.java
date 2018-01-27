package org.asl.namebank;

public class ProjectTester {

	public static void main(String[] args) {
		NameExplorer explorer = new NameExplorer();
		explorer.mostPopularNameForYearByGender("1964", "M");
		explorer.mostPopularNameForYearByGender("1987", "F");
		

	}

}
