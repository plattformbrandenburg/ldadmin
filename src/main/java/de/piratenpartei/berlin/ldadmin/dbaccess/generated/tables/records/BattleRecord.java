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
public class BattleRecord extends org.jooq.impl.TableRecordImpl<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.BattleRecord> implements org.jooq.Record4<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer>, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.interfaces.IBattle {

	private static final long serialVersionUID = -1244425262;

	/**
	 * Setter for <code>battle.issue_id</code>.
	 */
	public void setIssueId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>battle.issue_id</code>.
	 */
	@Override
	public java.lang.Integer getIssueId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>battle.winning_initiative_id</code>.
	 */
	public void setWinningInitiativeId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>battle.winning_initiative_id</code>.
	 */
	@Override
	public java.lang.Integer getWinningInitiativeId() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>battle.losing_initiative_id</code>.
	 */
	public void setLosingInitiativeId(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>battle.losing_initiative_id</code>.
	 */
	@Override
	public java.lang.Integer getLosingInitiativeId() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>battle.count</code>.
	 */
	public void setCount(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>battle.count</code>.
	 */
	@Override
	public java.lang.Integer getCount() {
		return (java.lang.Integer) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Battle.BATTLE.ISSUE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Battle.BATTLE.WINNING_INITIATIVE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Battle.BATTLE.LOSING_INITIATIVE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Battle.BATTLE.COUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getIssueId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getWinningInitiativeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getLosingInitiativeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getCount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BattleRecord value1(java.lang.Integer value) {
		setIssueId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BattleRecord value2(java.lang.Integer value) {
		setWinningInitiativeId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BattleRecord value3(java.lang.Integer value) {
		setLosingInitiativeId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BattleRecord value4(java.lang.Integer value) {
		setCount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BattleRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.Integer value3, java.lang.Integer value4) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached BattleRecord
	 */
	public BattleRecord() {
		super(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Battle.BATTLE);
	}

	/**
	 * Create a detached, initialised BattleRecord
	 */
	public BattleRecord(java.lang.Integer issueId, java.lang.Integer winningInitiativeId, java.lang.Integer losingInitiativeId, java.lang.Integer count) {
		super(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Battle.BATTLE);

		setValue(0, issueId);
		setValue(1, winningInitiativeId);
		setValue(2, losingInitiativeId);
		setValue(3, count);
	}
}
