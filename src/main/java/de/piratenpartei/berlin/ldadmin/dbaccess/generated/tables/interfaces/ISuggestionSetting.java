/**
 * This class is generated by jOOQ
 */
package de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ISuggestionSetting extends java.io.Serializable {

	/**
	 * Getter for <code>suggestion_setting.member_id</code>.
	 */
	public java.lang.Integer getMemberId();

	/**
	 * Getter for <code>suggestion_setting.key</code>.
	 */
	public java.lang.String getKey();

	/**
	 * Getter for <code>suggestion_setting.suggestion_id</code>.
	 */
	public java.lang.Long getSuggestionId();

	/**
	 * Getter for <code>suggestion_setting.value</code>.
	 */
	public java.lang.String getValue();
}
