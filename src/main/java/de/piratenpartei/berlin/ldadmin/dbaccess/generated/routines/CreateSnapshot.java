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
public class CreateSnapshot extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 1086730441;

	/**
	 * The parameter <code>create_snapshot.issue_id_p</code>.
	 */
	public static final org.jooq.Parameter<java.lang.Integer> ISSUE_ID_P = createParameter("issue_id_p", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public CreateSnapshot() {
		super("create_snapshot", de.piratenpartei.berlin.ldadmin.dbaccess.generated.DefaultSchema.DEFAULT_SCHEMA);

		addInParameter(ISSUE_ID_P);
	}

	/**
	 * Set the <code>issue_id_p</code> parameter IN value to the routine
	 */
	public void setIssueIdP(java.lang.Integer value) {
		setValue(de.piratenpartei.berlin.ldadmin.dbaccess.generated.routines.CreateSnapshot.ISSUE_ID_P, value);
	}
}
