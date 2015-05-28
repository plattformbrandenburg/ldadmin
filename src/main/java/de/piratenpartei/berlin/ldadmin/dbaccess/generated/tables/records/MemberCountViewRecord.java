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
public class MemberCountViewRecord extends org.jooq.impl.TableRecordImpl<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.MemberCountViewRecord> implements org.jooq.Record1<java.lang.Long>, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.interfaces.IMemberCountView {

	private static final long serialVersionUID = 219081942;

	/**
	 * Setter for <code>member_count_view.total_count</code>.
	 */
	public void setTotalCount(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>member_count_view.total_count</code>.
	 */
	@Override
	public java.lang.Long getTotalCount() {
		return (java.lang.Long) getValue(0);
	}

	// -------------------------------------------------------------------------
	// Record1 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<java.lang.Long> fieldsRow() {
		return (org.jooq.Row1) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<java.lang.Long> valuesRow() {
		return (org.jooq.Row1) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.MemberCountView.MEMBER_COUNT_VIEW.TOTAL_COUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return getTotalCount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MemberCountViewRecord value1(java.lang.Long value) {
		setTotalCount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MemberCountViewRecord values(java.lang.Long value1) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached MemberCountViewRecord
	 */
	public MemberCountViewRecord() {
		super(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.MemberCountView.MEMBER_COUNT_VIEW);
	}

	/**
	 * Create a detached, initialised MemberCountViewRecord
	 */
	public MemberCountViewRecord(java.lang.Long totalCount) {
		super(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.MemberCountView.MEMBER_COUNT_VIEW);

		setValue(0, totalCount);
	}
}
