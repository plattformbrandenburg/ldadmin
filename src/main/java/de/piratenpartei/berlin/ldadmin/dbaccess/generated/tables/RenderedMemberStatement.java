/**
 * This class is generated by jOOQ
 */
package de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RenderedMemberStatement extends org.jooq.impl.TableImpl<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.RenderedMemberStatementRecord> {

	private static final long serialVersionUID = -655349103;

	/**
	 * The singleton instance of <code>rendered_member_statement</code>
	 */
	public static final de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.RenderedMemberStatement RENDERED_MEMBER_STATEMENT = new de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.RenderedMemberStatement();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.RenderedMemberStatementRecord> getRecordType() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.RenderedMemberStatementRecord.class;
	}

	/**
	 * The column <code>rendered_member_statement.member_id</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.RenderedMemberStatementRecord, java.lang.Long> MEMBER_ID = createField("member_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>rendered_member_statement.format</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.RenderedMemberStatementRecord, java.lang.String> FORMAT = createField("format", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * The column <code>rendered_member_statement.content</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.RenderedMemberStatementRecord, java.lang.String> CONTENT = createField("content", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * Create a <code>rendered_member_statement</code> table reference
	 */
	public RenderedMemberStatement() {
		this("rendered_member_statement", null);
	}

	/**
	 * Create an aliased <code>rendered_member_statement</code> table reference
	 */
	public RenderedMemberStatement(java.lang.String alias) {
		this(alias, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.RenderedMemberStatement.RENDERED_MEMBER_STATEMENT);
	}

	private RenderedMemberStatement(java.lang.String alias, org.jooq.Table<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.RenderedMemberStatementRecord> aliased) {
		this(alias, aliased, null);
	}

	private RenderedMemberStatement(java.lang.String alias, org.jooq.Table<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.RenderedMemberStatementRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, de.piratenpartei.berlin.ldadmin.dbaccess.generated.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.RenderedMemberStatementRecord> getPrimaryKey() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.Keys.RENDERED_MEMBER_STATEMENT_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.RenderedMemberStatementRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.RenderedMemberStatementRecord>>asList(de.piratenpartei.berlin.ldadmin.dbaccess.generated.Keys.RENDERED_MEMBER_STATEMENT_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.RenderedMemberStatementRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.RenderedMemberStatementRecord, ?>>asList(de.piratenpartei.berlin.ldadmin.dbaccess.generated.Keys.RENDERED_MEMBER_STATEMENT__RENDERED_MEMBER_STATEMENT_MEMBER_ID_FKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.RenderedMemberStatement as(java.lang.String alias) {
		return new de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.RenderedMemberStatement(alias, this);
	}

	/**
	 * Rename this table
	 */
	public de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.RenderedMemberStatement rename(java.lang.String name) {
		return new de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.RenderedMemberStatement(name, null);
	}
}
