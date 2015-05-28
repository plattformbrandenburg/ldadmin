/**
 * This class is generated by jOOQ
 */
package de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IgnoredMemberRecord extends org.jooq.impl.UpdatableRecordImpl<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.IgnoredMemberRecord> implements org.jooq.Record2<java.lang.Integer, java.lang.Integer>, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.interfaces.IIgnoredMember {

	private static final long serialVersionUID = -1253271877;

	/**
	 * Setter for <code>ignored_member.member_id</code>.
	 */
	public void setMemberId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>ignored_member.member_id</code>.
	 */
	@Override
	public java.lang.Integer getMemberId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>ignored_member.other_member_id</code>.
	 */
	public void setOtherMemberId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>ignored_member.other_member_id</code>.
	 */
	@Override
	public java.lang.Integer getOtherMemberId() {
		return (java.lang.Integer) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record2<java.lang.Integer, java.lang.Integer> key() {
		return (org.jooq.Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.IgnoredMember.IGNORED_MEMBER.MEMBER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.IgnoredMember.IGNORED_MEMBER.OTHER_MEMBER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getMemberId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getOtherMemberId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IgnoredMemberRecord value1(java.lang.Integer value) {
		setMemberId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IgnoredMemberRecord value2(java.lang.Integer value) {
		setOtherMemberId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IgnoredMemberRecord values(java.lang.Integer value1, java.lang.Integer value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached IgnoredMemberRecord
	 */
	public IgnoredMemberRecord() {
		super(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.IgnoredMember.IGNORED_MEMBER);
	}

	/**
	 * Create a detached, initialised IgnoredMemberRecord
	 */
	public IgnoredMemberRecord(java.lang.Integer memberId, java.lang.Integer otherMemberId) {
		super(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.IgnoredMember.IGNORED_MEMBER);

		setValue(0, memberId);
		setValue(1, otherMemberId);
	}
}
