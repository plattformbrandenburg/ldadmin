/**
 * This class is generated by jOOQ
 */
package de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SettingMapRecord extends org.jooq.impl.UpdatableRecordImpl<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.SettingMapRecord> implements org.jooq.Record4<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String>, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.interfaces.ISettingMap {

	private static final long serialVersionUID = 218474543;

	/**
	 * Setter for <code>setting_map.member_id</code>.
	 */
	public void setMemberId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>setting_map.member_id</code>.
	 */
	@Override
	public java.lang.Integer getMemberId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>setting_map.key</code>.
	 */
	public void setKey(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>setting_map.key</code>.
	 */
	@Override
	public java.lang.String getKey() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>setting_map.subkey</code>.
	 */
	public void setSubkey(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>setting_map.subkey</code>.
	 */
	@Override
	public java.lang.String getSubkey() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>setting_map.value</code>.
	 */
	public void setValue(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>setting_map.value</code>.
	 */
	@Override
	public java.lang.String getValue() {
		return (java.lang.String) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record3<java.lang.Integer, java.lang.String, java.lang.String> key() {
		return (org.jooq.Record3) super.key();
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.SettingMap.SETTING_MAP.MEMBER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.SettingMap.SETTING_MAP.KEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.SettingMap.SETTING_MAP.SUBKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.SettingMap.SETTING_MAP.VALUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getMemberId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getKey();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getSubkey();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SettingMapRecord value1(java.lang.Integer value) {
		setMemberId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SettingMapRecord value2(java.lang.String value) {
		setKey(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SettingMapRecord value3(java.lang.String value) {
		setSubkey(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SettingMapRecord value4(java.lang.String value) {
		setValue(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SettingMapRecord values(java.lang.Integer value1, java.lang.String value2, java.lang.String value3, java.lang.String value4) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached SettingMapRecord
	 */
	public SettingMapRecord() {
		super(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.SettingMap.SETTING_MAP);
	}

	/**
	 * Create a detached, initialised SettingMapRecord
	 */
	public SettingMapRecord(java.lang.Integer memberId, java.lang.String key, java.lang.String subkey, java.lang.String value) {
		super(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.SettingMap.SETTING_MAP);

		setValue(0, memberId);
		setValue(1, key);
		setValue(2, subkey);
		setValue(3, value);
	}
}
