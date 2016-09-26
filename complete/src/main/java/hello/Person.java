package hello;

import org.joda.time.LocalDate;
import org.springframework.data.annotation.Id;

public class Person {

	@Id private String id;

	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
