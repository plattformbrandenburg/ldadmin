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
public class AutocreateInterestTrigger extends org.jooq.impl.AbstractRoutine<java.lang.Object> {

	private static final long serialVersionUID = 1486695654;

	/**
	 * The parameter <code>autocreate_interest_trigger.RETURN_VALUE</code>.
	 */
	public static final org.jooq.Parameter<java.lang.Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("trigger"));

	/**
	 * Create a new routine call instance
	 */
	public AutocreateInterestTrigger() {
		super("autocreate_interest_trigger", de.piratenpartei.berlin.ldadmin.dbaccess.generated.DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.DefaultDataType.getDefaultDataType("trigger"));

		setReturnParameter(RETURN_VALUE);
	}
}
