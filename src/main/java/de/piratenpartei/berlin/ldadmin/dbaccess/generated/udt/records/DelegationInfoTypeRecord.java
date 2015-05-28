/**
 * This class is generated by jOOQ
 */
package de.piratenpartei.berlin.ldadmin.dbaccess.generated.udt.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DelegationInfoTypeRecord extends org.jooq.impl.UDTRecordImpl<de.piratenpartei.berlin.ldadmin.dbaccess.generated.udt.records.DelegationInfoTypeRecord> implements org.jooq.Record10<java.lang.Boolean, de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.DelegationScope, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.DelegationInfoLoopType, java.lang.Integer>, de.piratenpartei.berlin.ldadmin.dbaccess.generated.udt.interfaces.IDelegationInfoType {

	private static final long serialVersionUID = 701528767;

	/**
	 * Setter for <code>delegation_info_type.own_participation</code>.
	 */
	public void setOwnParticipation(java.lang.Boolean value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>delegation_info_type.own_participation</code>.
	 */
	@Override
	public java.lang.Boolean getOwnParticipation() {
		return (java.lang.Boolean) getValue(0);
	}

	/**
	 * Setter for <code>delegation_info_type.own_delegation_scope</code>.
	 */
	public void setOwnDelegationScope(de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.DelegationScope value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>delegation_info_type.own_delegation_scope</code>.
	 */
	@Override
	public de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.DelegationScope getOwnDelegationScope() {
		return (de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.DelegationScope) getValue(1);
	}

	/**
	 * Setter for <code>delegation_info_type.first_trustee_id</code>.
	 */
	public void setFirstTrusteeId(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>delegation_info_type.first_trustee_id</code>.
	 */
	@Override
	public java.lang.Integer getFirstTrusteeId() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>delegation_info_type.first_trustee_participation</code>.
	 */
	public void setFirstTrusteeParticipation(java.lang.Boolean value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>delegation_info_type.first_trustee_participation</code>.
	 */
	@Override
	public java.lang.Boolean getFirstTrusteeParticipation() {
		return (java.lang.Boolean) getValue(3);
	}

	/**
	 * Setter for <code>delegation_info_type.first_trustee_ellipsis</code>.
	 */
	public void setFirstTrusteeEllipsis(java.lang.Boolean value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>delegation_info_type.first_trustee_ellipsis</code>.
	 */
	@Override
	public java.lang.Boolean getFirstTrusteeEllipsis() {
		return (java.lang.Boolean) getValue(4);
	}

	/**
	 * Setter for <code>delegation_info_type.other_trustee_id</code>.
	 */
	public void setOtherTrusteeId(java.lang.Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>delegation_info_type.other_trustee_id</code>.
	 */
	@Override
	public java.lang.Integer getOtherTrusteeId() {
		return (java.lang.Integer) getValue(5);
	}

	/**
	 * Setter for <code>delegation_info_type.other_trustee_participation</code>.
	 */
	public void setOtherTrusteeParticipation(java.lang.Boolean value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>delegation_info_type.other_trustee_participation</code>.
	 */
	@Override
	public java.lang.Boolean getOtherTrusteeParticipation() {
		return (java.lang.Boolean) getValue(6);
	}

	/**
	 * Setter for <code>delegation_info_type.other_trustee_ellipsis</code>.
	 */
	public void setOtherTrusteeEllipsis(java.lang.Boolean value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>delegation_info_type.other_trustee_ellipsis</code>.
	 */
	@Override
	public java.lang.Boolean getOtherTrusteeEllipsis() {
		return (java.lang.Boolean) getValue(7);
	}

	/**
	 * Setter for <code>delegation_info_type.delegation_loop</code>.
	 */
	public void setDelegationLoop(de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.DelegationInfoLoopType value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>delegation_info_type.delegation_loop</code>.
	 */
	@Override
	public de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.DelegationInfoLoopType getDelegationLoop() {
		return (de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.DelegationInfoLoopType) getValue(8);
	}

	/**
	 * Setter for <code>delegation_info_type.participating_member_id</code>.
	 */
	public void setParticipatingMemberId(java.lang.Integer value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>delegation_info_type.participating_member_id</code>.
	 */
	@Override
	public java.lang.Integer getParticipatingMemberId() {
		return (java.lang.Integer) getValue(9);
	}

	// -------------------------------------------------------------------------
	// Record10 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row10<java.lang.Boolean, de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.DelegationScope, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.DelegationInfoLoopType, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row10) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row10<java.lang.Boolean, de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.DelegationScope, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.DelegationInfoLoopType, java.lang.Integer> valuesRow() {
		return (org.jooq.Row10) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field1() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.udt.DelegationInfoType.OWN_PARTICIPATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.DelegationScope> field2() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.udt.DelegationInfoType.OWN_DELEGATION_SCOPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.udt.DelegationInfoType.FIRST_TRUSTEE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field4() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.udt.DelegationInfoType.FIRST_TRUSTEE_PARTICIPATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field5() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.udt.DelegationInfoType.FIRST_TRUSTEE_ELLIPSIS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field6() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.udt.DelegationInfoType.OTHER_TRUSTEE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field7() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.udt.DelegationInfoType.OTHER_TRUSTEE_PARTICIPATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field8() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.udt.DelegationInfoType.OTHER_TRUSTEE_ELLIPSIS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.DelegationInfoLoopType> field9() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.udt.DelegationInfoType.DELEGATION_LOOP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field10() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.udt.DelegationInfoType.PARTICIPATING_MEMBER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value1() {
		return getOwnParticipation();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.DelegationScope value2() {
		return getOwnDelegationScope();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getFirstTrusteeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value4() {
		return getFirstTrusteeParticipation();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value5() {
		return getFirstTrusteeEllipsis();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value6() {
		return getOtherTrusteeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value7() {
		return getOtherTrusteeParticipation();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value8() {
		return getOtherTrusteeEllipsis();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.DelegationInfoLoopType value9() {
		return getDelegationLoop();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value10() {
		return getParticipatingMemberId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DelegationInfoTypeRecord value1(java.lang.Boolean value) {
		setOwnParticipation(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DelegationInfoTypeRecord value2(de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.DelegationScope value) {
		setOwnDelegationScope(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DelegationInfoTypeRecord value3(java.lang.Integer value) {
		setFirstTrusteeId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DelegationInfoTypeRecord value4(java.lang.Boolean value) {
		setFirstTrusteeParticipation(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DelegationInfoTypeRecord value5(java.lang.Boolean value) {
		setFirstTrusteeEllipsis(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DelegationInfoTypeRecord value6(java.lang.Integer value) {
		setOtherTrusteeId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DelegationInfoTypeRecord value7(java.lang.Boolean value) {
		setOtherTrusteeParticipation(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DelegationInfoTypeRecord value8(java.lang.Boolean value) {
		setOtherTrusteeEllipsis(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DelegationInfoTypeRecord value9(de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.DelegationInfoLoopType value) {
		setDelegationLoop(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DelegationInfoTypeRecord value10(java.lang.Integer value) {
		setParticipatingMemberId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DelegationInfoTypeRecord values(java.lang.Boolean value1, de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.DelegationScope value2, java.lang.Integer value3, java.lang.Boolean value4, java.lang.Boolean value5, java.lang.Integer value6, java.lang.Boolean value7, java.lang.Boolean value8, de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.DelegationInfoLoopType value9, java.lang.Integer value10) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached DelegationInfoTypeRecord
	 */
	public DelegationInfoTypeRecord() {
		super(de.piratenpartei.berlin.ldadmin.dbaccess.generated.udt.DelegationInfoType.DELEGATION_INFO_TYPE);
	}

	/**
	 * Create a detached, initialised DelegationInfoTypeRecord
	 */
	public DelegationInfoTypeRecord(java.lang.Boolean ownParticipation, de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.DelegationScope ownDelegationScope, java.lang.Integer firstTrusteeId, java.lang.Boolean firstTrusteeParticipation, java.lang.Boolean firstTrusteeEllipsis, java.lang.Integer otherTrusteeId, java.lang.Boolean otherTrusteeParticipation, java.lang.Boolean otherTrusteeEllipsis, de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.DelegationInfoLoopType delegationLoop, java.lang.Integer participatingMemberId) {
		super(de.piratenpartei.berlin.ldadmin.dbaccess.generated.udt.DelegationInfoType.DELEGATION_INFO_TYPE);

		setValue(0, ownParticipation);
		setValue(1, ownDelegationScope);
		setValue(2, firstTrusteeId);
		setValue(3, firstTrusteeParticipation);
		setValue(4, firstTrusteeEllipsis);
		setValue(5, otherTrusteeId);
		setValue(6, otherTrusteeParticipation);
		setValue(7, otherTrusteeEllipsis);
		setValue(8, delegationLoop);
		setValue(9, participatingMemberId);
	}
}