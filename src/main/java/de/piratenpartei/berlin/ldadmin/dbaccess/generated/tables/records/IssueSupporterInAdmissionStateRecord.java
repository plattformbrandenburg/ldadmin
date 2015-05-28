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
public class IssueSupporterInAdmissionStateRecord extends org.jooq.impl.TableRecordImpl<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.IssueSupporterInAdmissionStateRecord> implements org.jooq.Record5<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer>, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.interfaces.IIssueSupporterInAdmissionState {

	private static final long serialVersionUID = -392116030;

	/**
	 * Setter for <code>issue_supporter_in_admission_state.unit_id</code>.
	 */
	public void setUnitId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>issue_supporter_in_admission_state.unit_id</code>.
	 */
	@Override
	public java.lang.Integer getUnitId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>issue_supporter_in_admission_state.area_id</code>.
	 */
	public void setAreaId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>issue_supporter_in_admission_state.area_id</code>.
	 */
	@Override
	public java.lang.Integer getAreaId() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>issue_supporter_in_admission_state.issue_id</code>.
	 */
	public void setIssueId(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>issue_supporter_in_admission_state.issue_id</code>.
	 */
	@Override
	public java.lang.Integer getIssueId() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>issue_supporter_in_admission_state.member_id</code>.
	 */
	public void setMemberId(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>issue_supporter_in_admission_state.member_id</code>.
	 */
	@Override
	public java.lang.Integer getMemberId() {
		return (java.lang.Integer) getValue(3);
	}

	/**
	 * Setter for <code>issue_supporter_in_admission_state.weight</code>.
	 */
	public void setWeight(java.lang.Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>issue_supporter_in_admission_state.weight</code>.
	 */
	@Override
	public java.lang.Integer getWeight() {
		return (java.lang.Integer) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.IssueSupporterInAdmissionState.ISSUE_SUPPORTER_IN_ADMISSION_STATE.UNIT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.IssueSupporterInAdmissionState.ISSUE_SUPPORTER_IN_ADMISSION_STATE.AREA_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.IssueSupporterInAdmissionState.ISSUE_SUPPORTER_IN_ADMISSION_STATE.ISSUE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.IssueSupporterInAdmissionState.ISSUE_SUPPORTER_IN_ADMISSION_STATE.MEMBER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.IssueSupporterInAdmissionState.ISSUE_SUPPORTER_IN_ADMISSION_STATE.WEIGHT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getUnitId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getAreaId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getIssueId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getMemberId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value5() {
		return getWeight();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IssueSupporterInAdmissionStateRecord value1(java.lang.Integer value) {
		setUnitId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IssueSupporterInAdmissionStateRecord value2(java.lang.Integer value) {
		setAreaId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IssueSupporterInAdmissionStateRecord value3(java.lang.Integer value) {
		setIssueId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IssueSupporterInAdmissionStateRecord value4(java.lang.Integer value) {
		setMemberId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IssueSupporterInAdmissionStateRecord value5(java.lang.Integer value) {
		setWeight(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IssueSupporterInAdmissionStateRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.Integer value3, java.lang.Integer value4, java.lang.Integer value5) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached IssueSupporterInAdmissionStateRecord
	 */
	public IssueSupporterInAdmissionStateRecord() {
		super(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.IssueSupporterInAdmissionState.ISSUE_SUPPORTER_IN_ADMISSION_STATE);
	}

	/**
	 * Create a detached, initialised IssueSupporterInAdmissionStateRecord
	 */
	public IssueSupporterInAdmissionStateRecord(java.lang.Integer unitId, java.lang.Integer areaId, java.lang.Integer issueId, java.lang.Integer memberId, java.lang.Integer weight) {
		super(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.IssueSupporterInAdmissionState.ISSUE_SUPPORTER_IN_ADMISSION_STATE);

		setValue(0, unitId);
		setValue(1, areaId);
		setValue(2, issueId);
		setValue(3, memberId);
		setValue(4, weight);
	}
}
