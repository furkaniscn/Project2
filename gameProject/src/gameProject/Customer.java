package gameProject;

public class Customer {

	private int id;
	private String name;
	private String lastName;
	private int birthYear;
	private String identityNumber;

	public Customer(int id, String name, String lastName, int birthYear, String identityNumber) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.birthYear = birthYear;
		this.identityNumber = identityNumber;
	}

	public Customer() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

}
