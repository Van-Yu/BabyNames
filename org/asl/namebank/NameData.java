package org.asl.namebank;

public class NameData {

	private String year;
	private String givenName;
	private String gender;
	private int numBabies;

	public NameData(String year, String name, String gender,
			int number) {
		this.year = year;
		this.givenName = name;
		this.gender = gender;
		this.numBabies = number;
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
		return numBabies;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("{");
		sb.append(getGivenName()+" (");
		sb.append(getYear()+", "+getGender()+"): ");
		sb.append(getNumber()+"}");
		return sb.toString();
	}
}
