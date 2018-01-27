package org.asl.namebank;

public class NameData {

	private String year;
	private String givenName;
	private String gender;
	private int number;

	public NameData(String year, String name, String gender,
			int number) {
		this.year = year;
		this.givenName = name;
		this.gender = gender;
		this.number = number;
	}

	public String getYear() {
		return year;
	}

	public String getGivenName() {
		return givenName;
	}

	public String getGender() {
		return gender;
	}

	public int getNumber() {
		return number;
	}
	@Override
	public String toString() {
		return year+","+givenName+","+gender+","+number;
	}
}
