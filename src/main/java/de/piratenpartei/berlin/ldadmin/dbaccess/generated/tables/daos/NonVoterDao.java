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
public class NonVoterDao extends org.jooq.impl.DAOImpl<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.NonVoterRecord, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.NonVoter, org.jooq.Record2<java.lang.Integer, java.lang.Integer>> {

	/**
	 * Create a new NonVoterDao without any configuration
	 */
	public NonVoterDao() {
		super(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.NonVoter.NON_VOTER, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.NonVoter.class);
	}

	/**
	 * Create a new NonVoterDao with an attached configuration
	 */
	public NonVoterDao(org.jooq.Configuration configuration) {
		super(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.NonVoter.NON_VOTER, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.NonVoter.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected org.jooq.Record2<java.lang.Integer, java.lang.Integer> getId(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.NonVoter object) {
		return compositeKeyRecord(object.getIssueId(), object.getMemberId());
	}

	/**
	 * Fetch records that have <code>issue_id IN (values)</code>
	 */
	public java.util.List<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.NonVoter> fetchByIssueId(java.lang.Integer... values) {
		return fetch(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.NonVoter.NON_VOTER.ISSUE_ID, values);
	}

	/**
	 * Fetch records that have <code>member_id IN (values)</code>
	 */
	public java.util.List<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.NonVoter> fetchByMemberId(java.lang.Integer... values) {
		return fetch(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.NonVoter.NON_VOTER.MEMBER_ID, values);
	}
}
