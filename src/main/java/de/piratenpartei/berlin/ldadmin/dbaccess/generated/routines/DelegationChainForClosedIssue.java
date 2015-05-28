/**
 * This class is generated by jOOQ
 */
package de.piratenpartei.berlin.ldadmin.dbaccess.generated.routines;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DelegationChainForClosedIssue extends org.jooq.impl.AbstractRoutine<de.piratenpartei.berlin.ldadmin.dbaccess.generated.udt.records.DelegationChainRowRecord> {

	private static final long serialVersionUID = -1265014680;

	/**
	 * The parameter <code>delegation_chain_for_closed_issue.RETURN_VALUE</code>.
	 */
	public static final org.jooq.Parameter<de.piratenpartei.berlin.ldadmin.dbaccess.generated.udt.records.DelegationChainRowRecord> RETURN_VALUE = createParameter("RETURN_VALUE", de.piratenpartei.berlin.ldadmin.dbaccess.generated.udt.DelegationChainRow.DELEGATION_CHAIN_ROW.getDataType());

	/**
	 * The parameter <code>delegation_chain_for_closed_issue.member_id_p</code>.
	 */
	public static final org.jooq.Parameter<java.lang.Integer> MEMBER_ID_P = createParameter("member_id_p", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The parameter <code>delegation_chain_for_closed_issue.issue_id_p</code>.
	 */
	public static final org.jooq.Parameter<java.lang.Integer> ISSUE_ID_P = createParameter("issue_id_p", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public DelegationChainForClosedIssue() {
		super("delegation_chain_for_closed_issue", de.piratenpartei.berlin.ldadmin.dbaccess.generated.DefaultSchema.DEFAULT_SCHEMA, de.piratenpartei.berlin.ldadmin.dbaccess.generated.udt.DelegationChainRow.DELEGATION_CHAIN_ROW.getDataType());

		setReturnParameter(RETURN_VALUE);
		addInParameter(MEMBER_ID_P);
		addInParameter(ISSUE_ID_P);
	}

	/**
	 * Set the <code>member_id_p</code> parameter IN value to the routine
	 */
	public void setMemberIdP(java.lang.Integer value) {
		setValue(de.piratenpartei.berlin.ldadmin.dbaccess.generated.routines.DelegationChainForClosedIssue.MEMBER_ID_P, value);
	}

	/**
	 * Set the <code>member_id_p</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setMemberIdP(org.jooq.Field<java.lang.Integer> field) {
		setField(MEMBER_ID_P, field);
	}

	/**
	 * Set the <code>issue_id_p</code> parameter IN value to the routine
	 */
	public void setIssueIdP(java.lang.Integer value) {
		setValue(de.piratenpartei.berlin.ldadmin.dbaccess.generated.routines.DelegationChainForClosedIssue.ISSUE_ID_P, value);
	}

	/**
	 * Set the <code>issue_id_p</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setIssueIdP(org.jooq.Field<java.lang.Integer> field) {
		setField(ISSUE_ID_P, field);
	}
}
