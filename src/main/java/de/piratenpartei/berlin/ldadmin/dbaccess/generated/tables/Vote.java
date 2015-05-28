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
public class Vote extends org.jooq.impl.TableImpl<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.VoteRecord> {

	private static final long serialVersionUID = 561191899;

	/**
	 * The singleton instance of <code>vote</code>
	 */
	public static final de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Vote VOTE = new de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Vote();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.VoteRecord> getRecordType() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.VoteRecord.class;
	}

	/**
	 * The column <code>vote.issue_id</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.VoteRecord, java.lang.Integer> ISSUE_ID = createField("issue_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>vote.initiative_id</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.VoteRecord, java.lang.Integer> INITIATIVE_ID = createField("initiative_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>vote.member_id</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.VoteRecord, java.lang.Integer> MEMBER_ID = createField("member_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>vote.grade</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.VoteRecord, java.lang.Integer> GRADE = createField("grade", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>vote.first_preference</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.VoteRecord, java.lang.Boolean> FIRST_PREFERENCE = createField("first_preference", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

	/**
	 * Create a <code>vote</code> table reference
	 */
	public Vote() {
		this("vote", null);
	}

	/**
	 * Create an aliased <code>vote</code> table reference
	 */
	public Vote(java.lang.String alias) {
		this(alias, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Vote.VOTE);
	}

	private Vote(java.lang.String alias, org.jooq.Table<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.VoteRecord> aliased) {
		this(alias, aliased, null);
	}

	private Vote(java.lang.String alias, org.jooq.Table<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.VoteRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, de.piratenpartei.berlin.ldadmin.dbaccess.generated.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.VoteRecord> getPrimaryKey() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.Keys.VOTE_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.VoteRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.VoteRecord>>asList(de.piratenpartei.berlin.ldadmin.dbaccess.generated.Keys.VOTE_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.VoteRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.VoteRecord, ?>>asList(de.piratenpartei.berlin.ldadmin.dbaccess.generated.Keys.VOTE__VOTE_ISSUE_ID_FKEY, de.piratenpartei.berlin.ldadmin.dbaccess.generated.Keys.VOTE__VOTE_ISSUE_ID_FKEY1);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Vote as(java.lang.String alias) {
		return new de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Vote(alias, this);
	}

	/**
	 * Rename this table
	 */
	public de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Vote rename(java.lang.String name) {
		return new de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Vote(name, null);
	}
}
