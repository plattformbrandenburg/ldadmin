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
public class TextSearchQuery extends org.jooq.impl.AbstractRoutine<java.lang.Object> {

	private static final long serialVersionUID = 627579610;

	/**
	 * The parameter <code>text_search_query.RETURN_VALUE</code>.
	 */
	public static final org.jooq.Parameter<java.lang.Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("tsquery"));

	/**
	 * The parameter <code>text_search_query.query_text_p</code>.
	 */
	public static final org.jooq.Parameter<java.lang.String> QUERY_TEXT_P = createParameter("query_text_p", org.jooq.impl.SQLDataType.CLOB);

	/**
	 * Create a new routine call instance
	 */
	public TextSearchQuery() {
		super("text_search_query", de.piratenpartei.berlin.ldadmin.dbaccess.generated.DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.DefaultDataType.getDefaultDataType("tsquery"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(QUERY_TEXT_P);
	}

	/**
	 * Set the <code>query_text_p</code> parameter IN value to the routine
	 */
	public void setQueryTextP(java.lang.String value) {
		setValue(de.piratenpartei.berlin.ldadmin.dbaccess.generated.routines.TextSearchQuery.QUERY_TEXT_P, value);
	}

	/**
	 * Set the <code>query_text_p</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setQueryTextP(org.jooq.Field<java.lang.String> field) {
		setField(QUERY_TEXT_P, field);
	}
}