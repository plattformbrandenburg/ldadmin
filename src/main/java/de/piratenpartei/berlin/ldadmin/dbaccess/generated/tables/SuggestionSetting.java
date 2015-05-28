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
public class SuggestionSetting extends org.jooq.impl.TableImpl<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.SuggestionSettingRecord> {

	private static final long serialVersionUID = -314462193;

	/**
	 * The singleton instance of <code>suggestion_setting</code>
	 */
	public static final de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.SuggestionSetting SUGGESTION_SETTING = new de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.SuggestionSetting();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.SuggestionSettingRecord> getRecordType() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.SuggestionSettingRecord.class;
	}

	/**
	 * The column <code>suggestion_setting.member_id</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.SuggestionSettingRecord, java.lang.Integer> MEMBER_ID = createField("member_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>suggestion_setting.key</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.SuggestionSettingRecord, java.lang.String> KEY = createField("key", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * The column <code>suggestion_setting.suggestion_id</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.SuggestionSettingRecord, java.lang.Long> SUGGESTION_ID = createField("suggestion_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>suggestion_setting.value</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.SuggestionSettingRecord, java.lang.String> VALUE = createField("value", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * Create a <code>suggestion_setting</code> table reference
	 */
	public SuggestionSetting() {
		this("suggestion_setting", null);
	}

	/**
	 * Create an aliased <code>suggestion_setting</code> table reference
	 */
	public SuggestionSetting(java.lang.String alias) {
		this(alias, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.SuggestionSetting.SUGGESTION_SETTING);
	}

	private SuggestionSetting(java.lang.String alias, org.jooq.Table<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.SuggestionSettingRecord> aliased) {
		this(alias, aliased, null);
	}

	private SuggestionSetting(java.lang.String alias, org.jooq.Table<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.SuggestionSettingRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, de.piratenpartei.berlin.ldadmin.dbaccess.generated.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.SuggestionSettingRecord> getPrimaryKey() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.Keys.SUGGESTION_SETTING_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.SuggestionSettingRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.SuggestionSettingRecord>>asList(de.piratenpartei.berlin.ldadmin.dbaccess.generated.Keys.SUGGESTION_SETTING_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.SuggestionSettingRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.SuggestionSettingRecord, ?>>asList(de.piratenpartei.berlin.ldadmin.dbaccess.generated.Keys.SUGGESTION_SETTING__SUGGESTION_SETTING_MEMBER_ID_FKEY, de.piratenpartei.berlin.ldadmin.dbaccess.generated.Keys.SUGGESTION_SETTING__SUGGESTION_SETTING_SUGGESTION_ID_FKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.SuggestionSetting as(java.lang.String alias) {
		return new de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.SuggestionSetting(alias, this);
	}

	/**
	 * Rename this table
	 */
	public de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.SuggestionSetting rename(java.lang.String name) {
		return new de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.SuggestionSetting(name, null);
	}
}