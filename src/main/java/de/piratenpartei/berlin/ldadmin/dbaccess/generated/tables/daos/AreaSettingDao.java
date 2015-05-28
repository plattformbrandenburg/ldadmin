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
public class AreaSettingDao extends org.jooq.impl.DAOImpl<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.AreaSettingRecord, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.AreaSetting, org.jooq.Record3<java.lang.Integer, java.lang.String, java.lang.Integer>> {

	/**
	 * Create a new AreaSettingDao without any configuration
	 */
	public AreaSettingDao() {
		super(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.AreaSetting.AREA_SETTING, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.AreaSetting.class);
	}

	/**
	 * Create a new AreaSettingDao with an attached configuration
	 */
	public AreaSettingDao(org.jooq.Configuration configuration) {
		super(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.AreaSetting.AREA_SETTING, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.AreaSetting.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected org.jooq.Record3<java.lang.Integer, java.lang.String, java.lang.Integer> getId(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.AreaSetting object) {
		return compositeKeyRecord(object.getMemberId(), object.getKey(), object.getAreaId());
	}

	/**
	 * Fetch records that have <code>member_id IN (values)</code>
	 */
	public java.util.List<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.AreaSetting> fetchByMemberId(java.lang.Integer... values) {
		return fetch(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.AreaSetting.AREA_SETTING.MEMBER_ID, values);
	}

	/**
	 * Fetch records that have <code>key IN (values)</code>
	 */
	public java.util.List<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.AreaSetting> fetchByKey(java.lang.String... values) {
		return fetch(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.AreaSetting.AREA_SETTING.KEY, values);
	}

	/**
	 * Fetch records that have <code>area_id IN (values)</code>
	 */
	public java.util.List<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.AreaSetting> fetchByAreaId(java.lang.Integer... values) {
		return fetch(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.AreaSetting.AREA_SETTING.AREA_ID, values);
	}

	/**
	 * Fetch records that have <code>value IN (values)</code>
	 */
	public java.util.List<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos.AreaSetting> fetchByValue(java.lang.String... values) {
		return fetch(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.AreaSetting.AREA_SETTING.VALUE, values);
	}
}
