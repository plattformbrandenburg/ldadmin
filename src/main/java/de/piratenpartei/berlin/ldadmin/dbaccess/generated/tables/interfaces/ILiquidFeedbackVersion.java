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
public interface ILiquidFeedbackVersion extends java.io.Serializable {

	/**
	 * Getter for <code>liquid_feedback_version.string</code>.
	 */
	public java.lang.String getString();

	/**
	 * Getter for <code>liquid_feedback_version.major</code>.
	 */
	public java.lang.Integer getMajor();

	/**
	 * Getter for <code>liquid_feedback_version.minor</code>.
	 */
	public java.lang.Integer getMinor();

	/**
	 * Getter for <code>liquid_feedback_version.revision</code>.
	 */
	public java.lang.Integer getRevision();
}
