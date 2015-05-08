/**
 * This class is generated by jOOQ
 */
package org.liquidfeedback.generated.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UnitSetting extends org.jooq.impl.TableImpl<org.liquidfeedback.generated.tables.records.UnitSettingRecord> {

	private static final long serialVersionUID = -593565812;

	/**
	 * The singleton instance of <code>unit_setting</code>
	 */
	public static final org.liquidfeedback.generated.tables.UnitSetting UNIT_SETTING = new org.liquidfeedback.generated.tables.UnitSetting();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.liquidfeedback.generated.tables.records.UnitSettingRecord> getRecordType() {
		return org.liquidfeedback.generated.tables.records.UnitSettingRecord.class;
	}

	/**
	 * The column <code>unit_setting.member_id</code>.
	 */
	public final org.jooq.TableField<org.liquidfeedback.generated.tables.records.UnitSettingRecord, java.lang.Integer> MEMBER_ID = createField("member_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>unit_setting.key</code>.
	 */
	public final org.jooq.TableField<org.liquidfeedback.generated.tables.records.UnitSettingRecord, java.lang.String> KEY = createField("key", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * The column <code>unit_setting.unit_id</code>.
	 */
	public final org.jooq.TableField<org.liquidfeedback.generated.tables.records.UnitSettingRecord, java.lang.Integer> UNIT_ID = createField("unit_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>unit_setting.value</code>.
	 */
	public final org.jooq.TableField<org.liquidfeedback.generated.tables.records.UnitSettingRecord, java.lang.String> VALUE = createField("value", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * Create a <code>unit_setting</code> table reference
	 */
	public UnitSetting() {
		this("unit_setting", null);
	}

	/**
	 * Create an aliased <code>unit_setting</code> table reference
	 */
	public UnitSetting(java.lang.String alias) {
		this(alias, org.liquidfeedback.generated.tables.UnitSetting.UNIT_SETTING);
	}

	private UnitSetting(java.lang.String alias, org.jooq.Table<org.liquidfeedback.generated.tables.records.UnitSettingRecord> aliased) {
		this(alias, aliased, null);
	}

	private UnitSetting(java.lang.String alias, org.jooq.Table<org.liquidfeedback.generated.tables.records.UnitSettingRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.liquidfeedback.generated.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.liquidfeedback.generated.tables.records.UnitSettingRecord> getPrimaryKey() {
		return org.liquidfeedback.generated.Keys.UNIT_SETTING_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.liquidfeedback.generated.tables.records.UnitSettingRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.liquidfeedback.generated.tables.records.UnitSettingRecord>>asList(org.liquidfeedback.generated.Keys.UNIT_SETTING_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.liquidfeedback.generated.tables.records.UnitSettingRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.liquidfeedback.generated.tables.records.UnitSettingRecord, ?>>asList(org.liquidfeedback.generated.Keys.UNIT_SETTING__UNIT_SETTING_MEMBER_ID_FKEY, org.liquidfeedback.generated.Keys.UNIT_SETTING__UNIT_SETTING_UNIT_ID_FKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.liquidfeedback.generated.tables.UnitSetting as(java.lang.String alias) {
		return new org.liquidfeedback.generated.tables.UnitSetting(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.liquidfeedback.generated.tables.UnitSetting rename(java.lang.String name) {
		return new org.liquidfeedback.generated.tables.UnitSetting(name, null);
	}
}