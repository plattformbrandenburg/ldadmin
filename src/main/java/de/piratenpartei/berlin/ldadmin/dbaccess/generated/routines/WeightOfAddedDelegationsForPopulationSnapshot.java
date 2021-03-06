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
public class WeightOfAddedDelegationsForPopulationSnapshot extends org.jooq.impl.AbstractRoutine<java.lang.Integer> {

	private static final long serialVersionUID = -343645749;

	/**
	 * The parameter <code>weight_of_added_delegations_for_population_snapshot.RETURN_VALUE</code>.
	 */
	public static final org.jooq.Parameter<java.lang.Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The parameter <code>weight_of_added_delegations_for_population_snapshot.issue_id_p</code>.
	 */
	public static final org.jooq.Parameter<java.lang.Integer> ISSUE_ID_P = createParameter("issue_id_p", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The parameter <code>weight_of_added_delegations_for_population_snapshot.member_id_p</code>.
	 */
	public static final org.jooq.Parameter<java.lang.Integer> MEMBER_ID_P = createParameter("member_id_p", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The parameter <code>weight_of_added_delegations_for_population_snapshot.delegate_member_ids_p</code>.
	 */
	public static final org.jooq.Parameter<java.lang.Integer[]> DELEGATE_MEMBER_IDS_P = createParameter("delegate_member_ids_p", org.jooq.impl.SQLDataType.INTEGER.getArrayDataType());

	/**
	 * Create a new routine call instance
	 */
	public WeightOfAddedDelegationsForPopulationSnapshot() {
		super("weight_of_added_delegations_for_population_snapshot", de.piratenpartei.berlin.ldadmin.dbaccess.generated.DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.SQLDataType.INTEGER);

		setReturnParameter(RETURN_VALUE);
		addInParameter(ISSUE_ID_P);
		addInParameter(MEMBER_ID_P);
		addInParameter(DELEGATE_MEMBER_IDS_P);
	}

	/**
	 * Set the <code>issue_id_p</code> parameter IN value to the routine
	 */
	public void setIssueIdP(java.lang.Integer value) {
		setValue(de.piratenpartei.berlin.ldadmin.dbaccess.generated.routines.WeightOfAddedDelegationsForPopulationSnapshot.ISSUE_ID_P, value);
	}

	/**
	 * Set the <code>issue_id_p</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setIssueIdP(org.jooq.Field<java.lang.Integer> field) {
		setField(ISSUE_ID_P, field);
	}

	/**
	 * Set the <code>member_id_p</code> parameter IN value to the routine
	 */
	public void setMemberIdP(java.lang.Integer value) {
		setValue(de.piratenpartei.berlin.ldadmin.dbaccess.generated.routines.WeightOfAddedDelegationsForPopulationSnapshot.MEMBER_ID_P, value);
	}

	/**
	 * Set the <code>member_id_p</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setMemberIdP(org.jooq.Field<java.lang.Integer> field) {
		setField(MEMBER_ID_P, field);
	}

	/**
	 * Set the <code>delegate_member_ids_p</code> parameter IN value to the routine
	 */
	public void setDelegateMemberIdsP(java.lang.Integer[] value) {
		setValue(de.piratenpartei.berlin.ldadmin.dbaccess.generated.routines.WeightOfAddedDelegationsForPopulationSnapshot.DELEGATE_MEMBER_IDS_P, value);
	}

	/**
	 * Set the <code>delegate_member_ids_p</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setDelegateMemberIdsP(org.jooq.Field<java.lang.Integer[]> field) {
		setField(DELEGATE_MEMBER_IDS_P, field);
	}
}
