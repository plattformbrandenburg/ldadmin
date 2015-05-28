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
public class IssueOrderInAdmissionStateDao extends org.jooq.impl.DAOImpl<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.IssueOrderInAdmissionStateRecord, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.IssueOrderInAdmissionState, java.lang.Long> {

	/**
	 * Create a new IssueOrderInAdmissionStateDao without any configuration
	 */
	public IssueOrderInAdmissionStateDao() {
		super(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.IssueOrderInAdmissionState.ISSUE_ORDER_IN_ADMISSION_STATE, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.IssueOrderInAdmissionState.class);
	}

	/**
	 * Create a new IssueOrderInAdmissionStateDao with an attached configuration
	 */
	public IssueOrderInAdmissionStateDao(org.jooq.Configuration configuration) {
		super(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.IssueOrderInAdmissionState.ISSUE_ORDER_IN_ADMISSION_STATE, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.IssueOrderInAdmissionState.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Long getId(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.IssueOrderInAdmissionState object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.IssueOrderInAdmissionState> fetchById(java.lang.Long... values) {
		return fetch(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.IssueOrderInAdmissionState.ISSUE_ORDER_IN_ADMISSION_STATE.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.IssueOrderInAdmissionState fetchOneById(java.lang.Long value) {
		return fetchOne(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.IssueOrderInAdmissionState.ISSUE_ORDER_IN_ADMISSION_STATE.ID, value);
	}

	/**
	 * Fetch records that have <code>order_in_area IN (values)</code>
	 */
	public java.util.List<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.IssueOrderInAdmissionState> fetchByOrderInArea(java.lang.Integer... values) {
		return fetch(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.IssueOrderInAdmissionState.ISSUE_ORDER_IN_ADMISSION_STATE.ORDER_IN_AREA, values);
	}

	/**
	 * Fetch records that have <code>order_in_unit IN (values)</code>
	 */
	public java.util.List<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.IssueOrderInAdmissionState> fetchByOrderInUnit(java.lang.Integer... values) {
		return fetch(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.IssueOrderInAdmissionState.ISSUE_ORDER_IN_ADMISSION_STATE.ORDER_IN_UNIT, values);
	}
}
