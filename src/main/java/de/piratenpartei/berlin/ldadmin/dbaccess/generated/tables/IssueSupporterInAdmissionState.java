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
public class IssueSupporterInAdmissionState extends org.jooq.impl.TableImpl<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.IssueSupporterInAdmissionStateRecord> {

	private static final long serialVersionUID = 785634184;

	/**
	 * The singleton instance of <code>issue_supporter_in_admission_state</code>
	 */
	public static final de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.IssueSupporterInAdmissionState ISSUE_SUPPORTER_IN_ADMISSION_STATE = new de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.IssueSupporterInAdmissionState();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.IssueSupporterInAdmissionStateRecord> getRecordType() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.IssueSupporterInAdmissionStateRecord.class;
	}

	/**
	 * The column <code>issue_supporter_in_admission_state.unit_id</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.IssueSupporterInAdmissionStateRecord, java.lang.Integer> UNIT_ID = createField("unit_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>issue_supporter_in_admission_state.area_id</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.IssueSupporterInAdmissionStateRecord, java.lang.Integer> AREA_ID = createField("area_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>issue_supporter_in_admission_state.issue_id</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.IssueSupporterInAdmissionStateRecord, java.lang.Integer> ISSUE_ID = createField("issue_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>issue_supporter_in_admission_state.member_id</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.IssueSupporterInAdmissionStateRecord, java.lang.Integer> MEMBER_ID = createField("member_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>issue_supporter_in_admission_state.weight</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.IssueSupporterInAdmissionStateRecord, java.lang.Integer> WEIGHT = createField("weight", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>issue_supporter_in_admission_state</code> table reference
	 */
	public IssueSupporterInAdmissionState() {
		this("issue_supporter_in_admission_state", null);
	}

	/**
	 * Create an aliased <code>issue_supporter_in_admission_state</code> table reference
	 */
	public IssueSupporterInAdmissionState(java.lang.String alias) {
		this(alias, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.IssueSupporterInAdmissionState.ISSUE_SUPPORTER_IN_ADMISSION_STATE);
	}

	private IssueSupporterInAdmissionState(java.lang.String alias, org.jooq.Table<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.IssueSupporterInAdmissionStateRecord> aliased) {
		this(alias, aliased, null);
	}

	private IssueSupporterInAdmissionState(java.lang.String alias, org.jooq.Table<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.IssueSupporterInAdmissionStateRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, de.piratenpartei.berlin.ldadmin.dbaccess.generated.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.IssueSupporterInAdmissionState as(java.lang.String alias) {
		return new de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.IssueSupporterInAdmissionState(alias, this);
	}

	/**
	 * Rename this table
	 */
	public de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.IssueSupporterInAdmissionState rename(java.lang.String name) {
		return new de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.IssueSupporterInAdmissionState(name, null);
	}
}
