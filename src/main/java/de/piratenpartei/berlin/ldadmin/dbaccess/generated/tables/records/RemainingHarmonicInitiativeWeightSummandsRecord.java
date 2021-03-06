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
public class RemainingHarmonicInitiativeWeightSummandsRecord extends org.jooq.impl.TableRecordImpl<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.RemainingHarmonicInitiativeWeightSummandsRecord> implements org.jooq.Record5<java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.Long, java.lang.Long>, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.interfaces.IRemainingHarmonicInitiativeWeightSummands {

	private static final long serialVersionUID = 1540368395;

	/**
	 * Setter for <code>remaining_harmonic_initiative_weight_summands.issue_id</code>.
	 */
	public void setIssueId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>remaining_harmonic_initiative_weight_summands.issue_id</code>.
	 */
	@Override
	public java.lang.Integer getIssueId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>remaining_harmonic_initiative_weight_summands.initiative_id</code>.
	 */
	public void setInitiativeId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>remaining_harmonic_initiative_weight_summands.initiative_id</code>.
	 */
	@Override
	public java.lang.Integer getInitiativeId() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>remaining_harmonic_initiative_weight_summands.admitted</code>.
	 */
	public void setAdmitted(java.lang.Boolean value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>remaining_harmonic_initiative_weight_summands.admitted</code>.
	 */
	@Override
	public java.lang.Boolean getAdmitted() {
		return (java.lang.Boolean) getValue(2);
	}

	/**
	 * Setter for <code>remaining_harmonic_initiative_weight_summands.weight_num</code>.
	 */
	public void setWeightNum(java.lang.Long value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>remaining_harmonic_initiative_weight_summands.weight_num</code>.
	 */
	@Override
	public java.lang.Long getWeightNum() {
		return (java.lang.Long) getValue(3);
	}

	/**
	 * Setter for <code>remaining_harmonic_initiative_weight_summands.weight_den</code>.
	 */
	public void setWeightDen(java.lang.Long value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>remaining_harmonic_initiative_weight_summands.weight_den</code>.
	 */
	@Override
	public java.lang.Long getWeightDen() {
		return (java.lang.Long) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.Long, java.lang.Long> fieldsRow() {
		return (org.jooq.Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.Long, java.lang.Long> valuesRow() {
		return (org.jooq.Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.RemainingHarmonicInitiativeWeightSummands.REMAINING_HARMONIC_INITIATIVE_WEIGHT_SUMMANDS.ISSUE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.RemainingHarmonicInitiativeWeightSummands.REMAINING_HARMONIC_INITIATIVE_WEIGHT_SUMMANDS.INITIATIVE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field3() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.RemainingHarmonicInitiativeWeightSummands.REMAINING_HARMONIC_INITIATIVE_WEIGHT_SUMMANDS.ADMITTED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field4() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.RemainingHarmonicInitiativeWeightSummands.REMAINING_HARMONIC_INITIATIVE_WEIGHT_SUMMANDS.WEIGHT_NUM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field5() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.RemainingHarmonicInitiativeWeightSummands.REMAINING_HARMONIC_INITIATIVE_WEIGHT_SUMMANDS.WEIGHT_DEN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getIssueId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getInitiativeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value3() {
		return getAdmitted();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value4() {
		return getWeightNum();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value5() {
		return getWeightDen();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RemainingHarmonicInitiativeWeightSummandsRecord value1(java.lang.Integer value) {
		setIssueId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RemainingHarmonicInitiativeWeightSummandsRecord value2(java.lang.Integer value) {
		setInitiativeId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RemainingHarmonicInitiativeWeightSummandsRecord value3(java.lang.Boolean value) {
		setAdmitted(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RemainingHarmonicInitiativeWeightSummandsRecord value4(java.lang.Long value) {
		setWeightNum(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RemainingHarmonicInitiativeWeightSummandsRecord value5(java.lang.Long value) {
		setWeightDen(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RemainingHarmonicInitiativeWeightSummandsRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.Boolean value3, java.lang.Long value4, java.lang.Long value5) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached RemainingHarmonicInitiativeWeightSummandsRecord
	 */
	public RemainingHarmonicInitiativeWeightSummandsRecord() {
		super(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.RemainingHarmonicInitiativeWeightSummands.REMAINING_HARMONIC_INITIATIVE_WEIGHT_SUMMANDS);
	}

	/**
	 * Create a detached, initialised RemainingHarmonicInitiativeWeightSummandsRecord
	 */
	public RemainingHarmonicInitiativeWeightSummandsRecord(java.lang.Integer issueId, java.lang.Integer initiativeId, java.lang.Boolean admitted, java.lang.Long weightNum, java.lang.Long weightDen) {
		super(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.RemainingHarmonicInitiativeWeightSummands.REMAINING_HARMONIC_INITIATIVE_WEIGHT_SUMMANDS);

		setValue(0, issueId);
		setValue(1, initiativeId);
		setValue(2, admitted);
		setValue(3, weightNum);
		setValue(4, weightDen);
	}
}
