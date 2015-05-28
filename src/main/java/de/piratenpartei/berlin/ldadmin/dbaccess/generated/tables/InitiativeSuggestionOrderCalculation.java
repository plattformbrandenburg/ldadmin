/**
 * This class is generated by jOOQ
 */
package de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InitiativeSuggestionOrderCalculation extends org.jooq.impl.TableImpl<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.InitiativeSuggestionOrderCalculationRecord> {

	private static final long serialVersionUID = 1069529451;

	/**
	 * The singleton instance of <code>initiative_suggestion_order_calculation</code>
	 */
	public static final de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.InitiativeSuggestionOrderCalculation INITIATIVE_SUGGESTION_ORDER_CALCULATION = new de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.InitiativeSuggestionOrderCalculation();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.InitiativeSuggestionOrderCalculationRecord> getRecordType() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.InitiativeSuggestionOrderCalculationRecord.class;
	}

	/**
	 * The column <code>initiative_suggestion_order_calculation.initiative_id</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.InitiativeSuggestionOrderCalculationRecord, java.lang.Integer> INITIATIVE_ID = createField("initiative_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>initiative_suggestion_order_calculation.final</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.InitiativeSuggestionOrderCalculationRecord, java.lang.Boolean> FINAL = createField("final", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

	/**
	 * Create a <code>initiative_suggestion_order_calculation</code> table reference
	 */
	public InitiativeSuggestionOrderCalculation() {
		this("initiative_suggestion_order_calculation", null);
	}

	/**
	 * Create an aliased <code>initiative_suggestion_order_calculation</code> table reference
	 */
	public InitiativeSuggestionOrderCalculation(java.lang.String alias) {
		this(alias, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.InitiativeSuggestionOrderCalculation.INITIATIVE_SUGGESTION_ORDER_CALCULATION);
	}

	private InitiativeSuggestionOrderCalculation(java.lang.String alias, org.jooq.Table<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.InitiativeSuggestionOrderCalculationRecord> aliased) {
		this(alias, aliased, null);
	}

	private InitiativeSuggestionOrderCalculation(java.lang.String alias, org.jooq.Table<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.InitiativeSuggestionOrderCalculationRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, de.piratenpartei.berlin.ldadmin.dbaccess.generated.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.InitiativeSuggestionOrderCalculation as(java.lang.String alias) {
		return new de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.InitiativeSuggestionOrderCalculation(alias, this);
	}

	/**
	 * Rename this table
	 */
	public de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.InitiativeSuggestionOrderCalculation rename(java.lang.String name) {
		return new de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.InitiativeSuggestionOrderCalculation(name, null);
	}
}
