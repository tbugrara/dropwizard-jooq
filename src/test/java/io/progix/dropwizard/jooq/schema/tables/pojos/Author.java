/**
 * This class is generated by jOOQ
 */
package io.progix.dropwizard.jooq.schema.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.1"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Author implements java.io.Serializable {

	private static final long serialVersionUID = 1372606284;

	private final java.lang.Integer id;
	private final java.lang.String  firstName;
	private final java.lang.String  lastName;
	private final java.sql.Date     dateOfBirth;
	private final java.lang.Integer yearOfBirth;
	private final java.lang.Integer distinguished;

	public Author(
		java.lang.Integer id,
		java.lang.String  firstName,
		java.lang.String  lastName,
		java.sql.Date     dateOfBirth,
		java.lang.Integer yearOfBirth,
		java.lang.Integer distinguished
	) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.yearOfBirth = yearOfBirth;
		this.distinguished = distinguished;
	}

	public java.lang.Integer getId() {
		return this.id;
	}

	public java.lang.String getFirstName() {
		return this.firstName;
	}

	public java.lang.String getLastName() {
		return this.lastName;
	}

	public java.sql.Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	public java.lang.Integer getYearOfBirth() {
		return this.yearOfBirth;
	}

	public java.lang.Integer getDistinguished() {
		return this.distinguished;
	}
}
