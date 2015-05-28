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
public class AreaSetting extends org.jooq.impl.TableImpl<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.AreaSettingRecord> {

	private static final long serialVersionUID = 258435806;

	/**
	 * The singleton instance of <code>area_setting</code>
	 */
	public static final de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.AreaSetting AREA_SETTING = new de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.AreaSetting();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.AreaSettingRecord> getRecordType() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.AreaSettingRecord.class;
	}

	/**
	 * The column <code>area_setting.member_id</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.AreaSettingRecord, java.lang.Integer> MEMBER_ID = createField("member_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>area_setting.key</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.AreaSettingRecord, java.lang.String> KEY = createField("key", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * The column <code>area_setting.area_id</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.AreaSettingRecord, java.lang.Integer> AREA_ID = createField("area_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>area_setting.value</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.AreaSettingRecord, java.lang.String> VALUE = createField("value", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * Create a <code>area_setting</code> table reference
	 */
	public AreaSetting() {
		this("area_setting", null);
	}

	/**
	 * Create an aliased <code>area_setting</code> table reference
	 */
	public AreaSetting(java.lang.String alias) {
		this(alias, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.AreaSetting.AREA_SETTING);
	}

	private AreaSetting(java.lang.String alias, org.jooq.Table<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.AreaSettingRecord> aliased) {
		this(alias, aliased, null);
	}

	private AreaSetting(java.lang.String alias, org.jooq.Table<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.AreaSettingRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, de.piratenpartei.berlin.ldadmin.dbaccess.generated.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.AreaSettingRecord> getPrimaryKey() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.Keys.AREA_SETTING_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.AreaSettingRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.AreaSettingRecord>>asList(de.piratenpartei.berlin.ldadmin.dbaccess.generated.Keys.AREA_SETTING_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.AreaSettingRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.AreaSettingRecord, ?>>asList(de.piratenpartei.berlin.ldadmin.dbaccess.generated.Keys.AREA_SETTING__AREA_SETTING_MEMBER_ID_FKEY, de.piratenpartei.berlin.ldadmin.dbaccess.generated.Keys.AREA_SETTING__AREA_SETTING_AREA_ID_FKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.AreaSetting as(java.lang.String alias) {
		return new de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.AreaSetting(alias, this);
	}

	/**
	 * Rename this table
	 */
	public de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.AreaSetting rename(java.lang.String name) {
		return new de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.AreaSetting(name, null);
	}
}