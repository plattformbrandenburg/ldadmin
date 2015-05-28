/**
 * This class is generated by jOOQ
 */
package de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OpinionDao extends org.jooq.impl.DAOImpl<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.OpinionRecord, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.Opinion, org.jooq.Record2<java.lang.Long, java.lang.Integer>> {

	/**
	 * Create a new OpinionDao without any configuration
	 */
	public OpinionDao() {
		super(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Opinion.OPINION, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.Opinion.class);
	}

	/**
	 * Create a new OpinionDao with an attached configuration
	 */
	public OpinionDao(org.jooq.Configuration configuration) {
		super(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Opinion.OPINION, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.Opinion.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected org.jooq.Record2<java.lang.Long, java.lang.Integer> getId(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.Opinion object) {
		return compositeKeyRecord(object.getSuggestionId(), object.getMemberId());
	}

	/**
	 * Fetch records that have <code>initiative_id IN (values)</code>
	 */
	public java.util.List<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.Opinion> fetchByInitiativeId(java.lang.Integer... values) {
		return fetch(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Opinion.OPINION.INITIATIVE_ID, values);
	}

	/**
	 * Fetch records that have <code>suggestion_id IN (values)</code>
	 */
	public java.util.List<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.Opinion> fetchBySuggestionId(java.lang.Long... values) {
		return fetch(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Opinion.OPINION.SUGGESTION_ID, values);
	}

	/**
	 * Fetch records that have <code>member_id IN (values)</code>
	 */
	public java.util.List<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.Opinion> fetchByMemberId(java.lang.Integer... values) {
		return fetch(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Opinion.OPINION.MEMBER_ID, values);
	}

	/**
	 * Fetch records that have <code>degree IN (values)</code>
	 */
	public java.util.List<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.Opinion> fetchByDegree(java.lang.Short... values) {
		return fetch(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Opinion.OPINION.DEGREE, values);
	}

	/**
	 * Fetch records that have <code>fulfilled IN (values)</code>
	 */
	public java.util.List<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.Opinion> fetchByFulfilled(java.lang.Boolean... values) {
		return fetch(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Opinion.OPINION.FULFILLED, values);
	}
}