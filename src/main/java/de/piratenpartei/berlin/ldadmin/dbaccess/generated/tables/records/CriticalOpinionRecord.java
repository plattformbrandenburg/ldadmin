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
public class CriticalOpinionRecord extends org.jooq.impl.TableRecordImpl<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.CriticalOpinionRecord> implements org.jooq.Record5<java.lang.Integer, java.lang.Long, java.lang.Integer, java.lang.Short, java.lang.Boolean>, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.interfaces.ICriticalOpinion {

	private static final long serialVersionUID = 1515361977;

	/**
	 * Setter for <code>critical_opinion.initiative_id</code>.
	 */
	public void setInitiativeId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>critical_opinion.initiative_id</code>.
	 */
	@Override
	public java.lang.Integer getInitiativeId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>critical_opinion.suggestion_id</code>.
	 */
	public void setSuggestionId(java.lang.Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>critical_opinion.suggestion_id</code>.
	 */
	@Override
	public java.lang.Long getSuggestionId() {
		return (java.lang.Long) getValue(1);
	}

	/**
	 * Setter for <code>critical_opinion.member_id</code>.
	 */
	public void setMemberId(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>critical_opinion.member_id</code>.
	 */
	@Override
	public java.lang.Integer getMemberId() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>critical_opinion.degree</code>.
	 */
	public void setDegree(java.lang.Short value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>critical_opinion.degree</code>.
	 */
	@Override
	public java.lang.Short getDegree() {
		return (java.lang.Short) getValue(3);
	}

	/**
	 * Setter for <code>critical_opinion.fulfilled</code>.
	 */
	public void setFulfilled(java.lang.Boolean value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>critical_opinion.fulfilled</code>.
	 */
	@Override
	public java.lang.Boolean getFulfilled() {
		return (java.lang.Boolean) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.lang.Long, java.lang.Integer, java.lang.Short, java.lang.Boolean> fieldsRow() {
		return (org.jooq.Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.lang.Long, java.lang.Integer, java.lang.Short, java.lang.Boolean> valuesRow() {
		return (org.jooq.Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.CriticalOpinion.CRITICAL_OPINION.INITIATIVE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field2() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.CriticalOpinion.CRITICAL_OPINION.SUGGESTION_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.CriticalOpinion.CRITICAL_OPINION.MEMBER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field4() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.CriticalOpinion.CRITICAL_OPINION.DEGREE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field5() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.CriticalOpinion.CRITICAL_OPINION.FULFILLED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getInitiativeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value2() {
		return getSuggestionId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getMemberId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value4() {
		return getDegree();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value5() {
		return getFulfilled();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CriticalOpinionRecord value1(java.lang.Integer value) {
		setInitiativeId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CriticalOpinionRecord value2(java.lang.Long value) {
		setSuggestionId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CriticalOpinionRecord value3(java.lang.Integer value) {
		setMemberId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CriticalOpinionRecord value4(java.lang.Short value) {
		setDegree(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CriticalOpinionRecord value5(java.lang.Boolean value) {
		setFulfilled(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CriticalOpinionRecord values(java.lang.Integer value1, java.lang.Long value2, java.lang.Integer value3, java.lang.Short value4, java.lang.Boolean value5) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CriticalOpinionRecord
	 */
	public CriticalOpinionRecord() {
		super(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.CriticalOpinion.CRITICAL_OPINION);
	}

	/**
	 * Create a detached, initialised CriticalOpinionRecord
	 */
	public CriticalOpinionRecord(java.lang.Integer initiativeId, java.lang.Long suggestionId, java.lang.Integer memberId, java.lang.Short degree, java.lang.Boolean fulfilled) {
		super(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.CriticalOpinion.CRITICAL_OPINION);

		setValue(0, initiativeId);
		setValue(1, suggestionId);
		setValue(2, memberId);
		setValue(3, degree);
		setValue(4, fulfilled);
	}
}
