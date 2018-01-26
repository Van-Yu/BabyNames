package org.asl.namebank;

public class NameData {

	private String name;
	private String gender;
	private String number;

	public NameData(String name, String gender, String number) {
		this.name = name;
		this.gender = gender;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getNumber() {
		return number;
	}
}
