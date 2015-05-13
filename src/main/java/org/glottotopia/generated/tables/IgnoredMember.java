/**
 * This class is generated by jOOQ
 */
package org.liquidfeedback.generated.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IgnoredMember extends org.jooq.impl.TableImpl<org.liquidfeedback.generated.tables.records.IgnoredMemberRecord> {

	private static final long serialVersionUID = -1423580064;

	/**
	 * The singleton instance of <code>ignored_member</code>
	 */
	public static final org.liquidfeedback.generated.tables.IgnoredMember IGNORED_MEMBER = new org.liquidfeedback.generated.tables.IgnoredMember();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.liquidfeedback.generated.tables.records.IgnoredMemberRecord> getRecordType() {
		return org.liquidfeedback.generated.tables.records.IgnoredMemberRecord.class;
	}

	/**
	 * The column <code>ignored_member.member_id</code>.
	 */
	public final org.jooq.TableField<org.liquidfeedback.generated.tables.records.IgnoredMemberRecord, java.lang.Integer> MEMBER_ID = createField("member_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>ignored_member.other_member_id</code>.
	 */
	public final org.jooq.TableField<org.liquidfeedback.generated.tables.records.IgnoredMemberRecord, java.lang.Integer> OTHER_MEMBER_ID = createField("other_member_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>ignored_member</code> table reference
	 */
	public IgnoredMember() {
		this("ignored_member", null);
	}

	/**
	 * Create an aliased <code>ignored_member</code> table reference
	 */
	public IgnoredMember(java.lang.String alias) {
		this(alias, org.liquidfeedback.generated.tables.IgnoredMember.IGNORED_MEMBER);
	}

	private IgnoredMember(java.lang.String alias, org.jooq.Table<org.liquidfeedback.generated.tables.records.IgnoredMemberRecord> aliased) {
		this(alias, aliased, null);
	}

	private IgnoredMember(java.lang.String alias, org.jooq.Table<org.liquidfeedback.generated.tables.records.IgnoredMemberRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.liquidfeedback.generated.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.liquidfeedback.generated.tables.records.IgnoredMemberRecord> getPrimaryKey() {
		return org.liquidfeedback.generated.Keys.IGNORED_MEMBER_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.liquidfeedback.generated.tables.records.IgnoredMemberRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.liquidfeedback.generated.tables.records.IgnoredMemberRecord>>asList(org.liquidfeedback.generated.Keys.IGNORED_MEMBER_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.liquidfeedback.generated.tables.records.IgnoredMemberRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.liquidfeedback.generated.tables.records.IgnoredMemberRecord, ?>>asList(org.liquidfeedback.generated.Keys.IGNORED_MEMBER__IGNORED_MEMBER_MEMBER_ID_FKEY, org.liquidfeedback.generated.Keys.IGNORED_MEMBER__IGNORED_MEMBER_OTHER_MEMBER_ID_FKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.liquidfeedback.generated.tables.IgnoredMember as(java.lang.String alias) {
		return new org.liquidfeedback.generated.tables.IgnoredMember(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.liquidfeedback.generated.tables.IgnoredMember rename(java.lang.String name) {
		return new org.liquidfeedback.generated.tables.IgnoredMember(name, null);
	}
}