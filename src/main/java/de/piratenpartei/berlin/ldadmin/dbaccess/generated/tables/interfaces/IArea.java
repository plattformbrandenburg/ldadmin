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
public interface IArea extends java.io.Serializable {

	/**
	 * Getter for <code>area.id</code>.
	 */
	public java.lang.Integer getId();

	/**
	 * Getter for <code>area.unit_id</code>.
	 */
	public java.lang.Integer getUnitId();

	/**
	 * Getter for <code>area.active</code>.
	 */
	public java.lang.Boolean getActive();

	/**
	 * Getter for <code>area.name</code>.
	 */
	public java.lang.String getName();

	/**
	 * Getter for <code>area.description</code>.
	 */
	public java.lang.String getDescription();

	/**
	 * Getter for <code>area.direct_member_count</code>.
	 */
	public java.lang.Integer getDirectMemberCount();

	/**
	 * Getter for <code>area.member_weight</code>.
	 */
	public java.lang.Integer getMemberWeight();

	/**
	 * Getter for <code>area.text_search_data</code>.
	 */
	public java.lang.Object getTextSearchData();
}
