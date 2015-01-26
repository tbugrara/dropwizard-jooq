/**
 * This class is generated by jOOQ
 */
package io.progix.dropwizard.jooq.schema.tables.records;

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
public class BookRecord extends org.jooq.impl.UpdatableRecordImpl<io.progix.dropwizard.jooq.schema.tables.records.BookRecord> implements org.jooq.Record5<java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = 961342979;

	/**
	 * Setter for <code>public.book.id</code>.
	 */
	public BookRecord setId(java.lang.Integer value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>public.book.id</code>.
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.book.author_id</code>.
	 */
	public BookRecord setAuthorId(java.lang.Integer value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>public.book.author_id</code>.
	 */
	public java.lang.Integer getAuthorId() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>public.book.title</code>.
	 */
	public BookRecord setTitle(java.lang.String value) {
		setValue(2, value);
		return this;
	}

	/**
	 * Getter for <code>public.book.title</code>.
	 */
	public java.lang.String getTitle() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>public.book.published_in</code>.
	 */
	public BookRecord setPublishedIn(java.lang.Integer value) {
		setValue(3, value);
		return this;
	}

	/**
	 * Getter for <code>public.book.published_in</code>.
	 */
	public java.lang.Integer getPublishedIn() {
		return (java.lang.Integer) getValue(3);
	}

	/**
	 * Setter for <code>public.book.language_id</code>.
	 */
	public BookRecord setLanguageId(java.lang.Integer value) {
		setValue(4, value);
		return this;
	}

	/**
	 * Getter for <code>public.book.language_id</code>.
	 */
	public java.lang.Integer getLanguageId() {
		return (java.lang.Integer) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return io.progix.dropwizard.jooq.schema.tables.Book.BOOK.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return io.progix.dropwizard.jooq.schema.tables.Book.BOOK.AUTHOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return io.progix.dropwizard.jooq.schema.tables.Book.BOOK.TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return io.progix.dropwizard.jooq.schema.tables.Book.BOOK.PUBLISHED_IN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return io.progix.dropwizard.jooq.schema.tables.Book.BOOK.LANGUAGE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getAuthorId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getTitle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getPublishedIn();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value5() {
		return getLanguageId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BookRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BookRecord value2(java.lang.Integer value) {
		setAuthorId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BookRecord value3(java.lang.String value) {
		setTitle(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BookRecord value4(java.lang.Integer value) {
		setPublishedIn(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BookRecord value5(java.lang.Integer value) {
		setLanguageId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BookRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.String value3, java.lang.Integer value4, java.lang.Integer value5) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached BookRecord
	 */
	public BookRecord() {
		super(io.progix.dropwizard.jooq.schema.tables.Book.BOOK);
	}

	/**
	 * Create a detached, initialised BookRecord
	 */
	public BookRecord(java.lang.Integer id, java.lang.Integer authorId, java.lang.String title, java.lang.Integer publishedIn, java.lang.Integer languageId) {
		super(io.progix.dropwizard.jooq.schema.tables.Book.BOOK);

		setValue(0, id);
		setValue(1, authorId);
		setValue(2, title);
		setValue(3, publishedIn);
		setValue(4, languageId);
	}
}
