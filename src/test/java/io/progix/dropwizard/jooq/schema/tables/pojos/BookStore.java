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
public class BookStore implements java.io.Serializable {

	private static final long serialVersionUID = -2100385237;

	private final java.lang.String name;

	public BookStore(
		java.lang.String name
	) {
		this.name = name;
	}

	public java.lang.String getName() {
		return this.name;
	}
}
