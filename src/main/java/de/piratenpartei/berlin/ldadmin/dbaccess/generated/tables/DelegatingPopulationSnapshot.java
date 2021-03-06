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
public class DelegatingPopulationSnapshot extends org.jooq.impl.TableImpl<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.DelegatingPopulationSnapshotRecord> {

	private static final long serialVersionUID = 953935603;

	/**
	 * The singleton instance of <code>delegating_population_snapshot</code>
	 */
	public static final de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.DelegatingPopulationSnapshot DELEGATING_POPULATION_SNAPSHOT = new de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.DelegatingPopulationSnapshot();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.DelegatingPopulationSnapshotRecord> getRecordType() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.DelegatingPopulationSnapshotRecord.class;
	}

	/**
	 * The column <code>delegating_population_snapshot.issue_id</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.DelegatingPopulationSnapshotRecord, java.lang.Integer> ISSUE_ID = createField("issue_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>delegating_population_snapshot.event</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.DelegatingPopulationSnapshotRecord, de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.SnapshotEvent> EVENT = createField("event", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.SnapshotEvent.class), this, "");

	/**
	 * The column <code>delegating_population_snapshot.member_id</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.DelegatingPopulationSnapshotRecord, java.lang.Integer> MEMBER_ID = createField("member_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>delegating_population_snapshot.weight</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.DelegatingPopulationSnapshotRecord, java.lang.Integer> WEIGHT = createField("weight", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>delegating_population_snapshot.scope</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.DelegatingPopulationSnapshotRecord, de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.DelegationScope> SCOPE = createField("scope", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.DelegationScope.class), this, "");

	/**
	 * The column <code>delegating_population_snapshot.delegate_member_ids</code>.
	 */
	public final org.jooq.TableField<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.DelegatingPopulationSnapshotRecord, java.lang.Integer[]> DELEGATE_MEMBER_IDS = createField("delegate_member_ids", org.jooq.impl.SQLDataType.INTEGER.getArrayDataType(), this, "");

	/**
	 * Create a <code>delegating_population_snapshot</code> table reference
	 */
	public DelegatingPopulationSnapshot() {
		this("delegating_population_snapshot", null);
	}

	/**
	 * Create an aliased <code>delegating_population_snapshot</code> table reference
	 */
	public DelegatingPopulationSnapshot(java.lang.String alias) {
		this(alias, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.DelegatingPopulationSnapshot.DELEGATING_POPULATION_SNAPSHOT);
	}

	private DelegatingPopulationSnapshot(java.lang.String alias, org.jooq.Table<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.DelegatingPopulationSnapshotRecord> aliased) {
		this(alias, aliased, null);
	}

	private DelegatingPopulationSnapshot(java.lang.String alias, org.jooq.Table<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.DelegatingPopulationSnapshotRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, de.piratenpartei.berlin.ldadmin.dbaccess.generated.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.DelegatingPopulationSnapshotRecord> getPrimaryKey() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.Keys.DELEGATING_POPULATION_SNAPSHOT_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.DelegatingPopulationSnapshotRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.DelegatingPopulationSnapshotRecord>>asList(de.piratenpartei.berlin.ldadmin.dbaccess.generated.Keys.DELEGATING_POPULATION_SNAPSHOT_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.DelegatingPopulationSnapshotRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.DelegatingPopulationSnapshotRecord, ?>>asList(de.piratenpartei.berlin.ldadmin.dbaccess.generated.Keys.DELEGATING_POPULATION_SNAPSHOT__DELEGATING_POPULATION_SNAPSHOT_ISSUE_ID_FKEY, de.piratenpartei.berlin.ldadmin.dbaccess.generated.Keys.DELEGATING_POPULATION_SNAPSHOT__DELEGATING_POPULATION_SNAPSHOT_MEMBER_ID_FKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.DelegatingPopulationSnapshot as(java.lang.String alias) {
		return new de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.DelegatingPopulationSnapshot(alias, this);
	}

	/**
	 * Rename this table
	 */
	public de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.DelegatingPopulationSnapshot rename(java.lang.String name) {
		return new de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.DelegatingPopulationSnapshot(name, null);
	}
}
