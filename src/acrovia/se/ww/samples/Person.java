package acrovia.se.ww.samples;

public class Person {

	private String name;

	public Person() {
		name = "Default Abhi";
	}

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
