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
public interface IExpiredSession extends java.io.Serializable {

	/**
	 * Getter for <code>expired_session.ident</code>.
	 */
	public java.lang.String getIdent();

	/**
	 * Getter for <code>expired_session.additional_secret</code>.
	 */
	public java.lang.String getAdditionalSecret();

	/**
	 * Getter for <code>expired_session.expiry</code>.
	 */
	public java.sql.Timestamp getExpiry();

	/**
	 * Getter for <code>expired_session.member_id</code>.
	 */
	public java.lang.Long getMemberId();

	/**
	 * Getter for <code>expired_session.authority</code>.
	 */
	public java.lang.String getAuthority();

	/**
	 * Getter for <code>expired_session.authority_uid</code>.
	 */
	public java.lang.String getAuthorityUid();

	/**
	 * Getter for <code>expired_session.authority_login</code>.
	 */
	public java.lang.String getAuthorityLogin();

	/**
	 * Getter for <code>expired_session.needs_delegation_check</code>.
	 */
	public java.lang.Boolean getNeedsDelegationCheck();

	/**
	 * Getter for <code>expired_session.lang</code>.
	 */
	public java.lang.String getLang();
}
