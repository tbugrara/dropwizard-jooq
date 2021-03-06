/**
 * This class is generated by jOOQ
 */
package io.progix.dropwizard.jooq.schema;

/**
 * A class modelling foreign key relationships between tables of the <code>PUBLIC</code> 
 * schema
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.1"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.UniqueKey<io.progix.dropwizard.jooq.schema.tables.records.AuthorRecord> SYS_PK_10093 = UniqueKeys0.SYS_PK_10093;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class UniqueKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.UniqueKey<io.progix.dropwizard.jooq.schema.tables.records.AuthorRecord> SYS_PK_10093 = createUniqueKey(io.progix.dropwizard.jooq.schema.tables.Author.AUTHOR, io.progix.dropwizard.jooq.schema.tables.Author.AUTHOR.ID);
	}
}
