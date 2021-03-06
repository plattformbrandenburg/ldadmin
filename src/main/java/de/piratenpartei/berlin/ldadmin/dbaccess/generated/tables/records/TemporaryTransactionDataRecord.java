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
public class TemporaryTransactionDataRecord extends org.jooq.impl.UpdatableRecordImpl<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.TemporaryTransactionDataRecord> implements org.jooq.Record3<java.lang.Long, java.lang.String, java.lang.String>, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.interfaces.ITemporaryTransactionData {

	private static final long serialVersionUID = 1947002597;

	/**
	 * Setter for <code>temporary_transaction_data.txid</code>.
	 */
	public void setTxid(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>temporary_transaction_data.txid</code>.
	 */
	@Override
	public java.lang.Long getTxid() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>temporary_transaction_data.key</code>.
	 */
	public void setKey(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>temporary_transaction_data.key</code>.
	 */
	@Override
	public java.lang.String getKey() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>temporary_transaction_data.value</code>.
	 */
	public void setValue(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>temporary_transaction_data.value</code>.
	 */
	@Override
	public java.lang.String getValue() {
		return (java.lang.String) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record2<java.lang.Long, java.lang.String> key() {
		return (org.jooq.Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Long, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Long, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.TemporaryTransactionData.TEMPORARY_TRANSACTION_DATA.TXID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.TemporaryTransactionData.TEMPORARY_TRANSACTION_DATA.KEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.TemporaryTransactionData.TEMPORARY_TRANSACTION_DATA.VALUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return getTxid();
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
		return getValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TemporaryTransactionDataRecord value1(java.lang.Long value) {
		setTxid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TemporaryTransactionDataRecord value2(java.lang.String value) {
		setKey(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TemporaryTransactionDataRecord value3(java.lang.String value) {
		setValue(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TemporaryTransactionDataRecord values(java.lang.Long value1, java.lang.String value2, java.lang.String value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TemporaryTransactionDataRecord
	 */
	public TemporaryTransactionDataRecord() {
		super(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.TemporaryTransactionData.TEMPORARY_TRANSACTION_DATA);
	}

	/**
	 * Create a detached, initialised TemporaryTransactionDataRecord
	 */
	public TemporaryTransactionDataRecord(java.lang.Long txid, java.lang.String key, java.lang.String value) {
		super(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.TemporaryTransactionData.TEMPORARY_TRANSACTION_DATA);

		setValue(0, txid);
		setValue(1, key);
		setValue(2, value);
	}
}
