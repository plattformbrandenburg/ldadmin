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
public class MemberRecord extends org.jooq.impl.UpdatableRecordImpl<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.MemberRecord> implements de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.interfaces.IMember {

	private static final long serialVersionUID = -492415961;

	/**
	 * Setter for <code>member.id</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>member.id</code>.
	 */
	@Override
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>member.created</code>.
	 */
	public void setCreated(java.sql.Timestamp value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>member.created</code>.
	 */
	@Override
	public java.sql.Timestamp getCreated() {
		return (java.sql.Timestamp) getValue(1);
	}

	/**
	 * Setter for <code>member.invite_code</code>.
	 */
	public void setInviteCode(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>member.invite_code</code>.
	 */
	@Override
	public java.lang.String getInviteCode() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>member.invite_code_expiry</code>.
	 */
	public void setInviteCodeExpiry(java.sql.Timestamp value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>member.invite_code_expiry</code>.
	 */
	@Override
	public java.sql.Timestamp getInviteCodeExpiry() {
		return (java.sql.Timestamp) getValue(3);
	}

	/**
	 * Setter for <code>member.admin_comment</code>.
	 */
	public void setAdminComment(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>member.admin_comment</code>.
	 */
	@Override
	public java.lang.String getAdminComment() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>member.activated</code>.
	 */
	public void setActivated(java.sql.Timestamp value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>member.activated</code>.
	 */
	@Override
	public java.sql.Timestamp getActivated() {
		return (java.sql.Timestamp) getValue(5);
	}

	/**
	 * Setter for <code>member.last_activity</code>.
	 */
	public void setLastActivity(java.sql.Date value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>member.last_activity</code>.
	 */
	@Override
	public java.sql.Date getLastActivity() {
		return (java.sql.Date) getValue(6);
	}

	/**
	 * Setter for <code>member.last_login</code>.
	 */
	public void setLastLogin(java.sql.Timestamp value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>member.last_login</code>.
	 */
	@Override
	public java.sql.Timestamp getLastLogin() {
		return (java.sql.Timestamp) getValue(7);
	}

	/**
	 * Setter for <code>member.last_delegation_check</code>.
	 */
	public void setLastDelegationCheck(java.sql.Timestamp value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>member.last_delegation_check</code>.
	 */
	@Override
	public java.sql.Timestamp getLastDelegationCheck() {
		return (java.sql.Timestamp) getValue(8);
	}

	/**
	 * Setter for <code>member.login</code>.
	 */
	public void setLogin(java.lang.String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>member.login</code>.
	 */
	@Override
	public java.lang.String getLogin() {
		return (java.lang.String) getValue(9);
	}

	/**
	 * Setter for <code>member.password</code>.
	 */
	public void setPassword(java.lang.String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>member.password</code>.
	 */
	@Override
	public java.lang.String getPassword() {
		return (java.lang.String) getValue(10);
	}

	/**
	 * Setter for <code>member.authority</code>.
	 */
	public void setAuthority(java.lang.String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>member.authority</code>.
	 */
	@Override
	public java.lang.String getAuthority() {
		return (java.lang.String) getValue(11);
	}

	/**
	 * Setter for <code>member.authority_uid</code>.
	 */
	public void setAuthorityUid(java.lang.String value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>member.authority_uid</code>.
	 */
	@Override
	public java.lang.String getAuthorityUid() {
		return (java.lang.String) getValue(12);
	}

	/**
	 * Setter for <code>member.authority_login</code>.
	 */
	public void setAuthorityLogin(java.lang.String value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>member.authority_login</code>.
	 */
	@Override
	public java.lang.String getAuthorityLogin() {
		return (java.lang.String) getValue(13);
	}

	/**
	 * Setter for <code>member.locked</code>.
	 */
	public void setLocked(java.lang.Boolean value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>member.locked</code>.
	 */
	@Override
	public java.lang.Boolean getLocked() {
		return (java.lang.Boolean) getValue(14);
	}

	/**
	 * Setter for <code>member.active</code>.
	 */
	public void setActive(java.lang.Boolean value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>member.active</code>.
	 */
	@Override
	public java.lang.Boolean getActive() {
		return (java.lang.Boolean) getValue(15);
	}

	/**
	 * Setter for <code>member.admin</code>.
	 */
	public void setAdmin(java.lang.Boolean value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>member.admin</code>.
	 */
	@Override
	public java.lang.Boolean getAdmin() {
		return (java.lang.Boolean) getValue(16);
	}

	/**
	 * Setter for <code>member.lang</code>.
	 */
	public void setLang(java.lang.String value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>member.lang</code>.
	 */
	@Override
	public java.lang.String getLang() {
		return (java.lang.String) getValue(17);
	}

	/**
	 * Setter for <code>member.notify_email</code>.
	 */
	public void setNotifyEmail(java.lang.String value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>member.notify_email</code>.
	 */
	@Override
	public java.lang.String getNotifyEmail() {
		return (java.lang.String) getValue(18);
	}

	/**
	 * Setter for <code>member.notify_email_unconfirmed</code>.
	 */
	public void setNotifyEmailUnconfirmed(java.lang.String value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>member.notify_email_unconfirmed</code>.
	 */
	@Override
	public java.lang.String getNotifyEmailUnconfirmed() {
		return (java.lang.String) getValue(19);
	}

	/**
	 * Setter for <code>member.notify_email_secret</code>.
	 */
	public void setNotifyEmailSecret(java.lang.String value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>member.notify_email_secret</code>.
	 */
	@Override
	public java.lang.String getNotifyEmailSecret() {
		return (java.lang.String) getValue(20);
	}

	/**
	 * Setter for <code>member.notify_email_secret_expiry</code>.
	 */
	public void setNotifyEmailSecretExpiry(java.sql.Timestamp value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>member.notify_email_secret_expiry</code>.
	 */
	@Override
	public java.sql.Timestamp getNotifyEmailSecretExpiry() {
		return (java.sql.Timestamp) getValue(21);
	}

	/**
	 * Setter for <code>member.notify_email_lock_expiry</code>.
	 */
	public void setNotifyEmailLockExpiry(java.sql.Timestamp value) {
		setValue(22, value);
	}

	/**
	 * Getter for <code>member.notify_email_lock_expiry</code>.
	 */
	@Override
	public java.sql.Timestamp getNotifyEmailLockExpiry() {
		return (java.sql.Timestamp) getValue(22);
	}

	/**
	 * Setter for <code>member.notify_level</code>.
	 */
	public void setNotifyLevel(de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.NotifyLevel value) {
		setValue(23, value);
	}

	/**
	 * Getter for <code>member.notify_level</code>.
	 */
	@Override
	public de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.NotifyLevel getNotifyLevel() {
		return (de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.NotifyLevel) getValue(23);
	}

	/**
	 * Setter for <code>member.login_recovery_expiry</code>.
	 */
	public void setLoginRecoveryExpiry(java.sql.Timestamp value) {
		setValue(24, value);
	}

	/**
	 * Getter for <code>member.login_recovery_expiry</code>.
	 */
	@Override
	public java.sql.Timestamp getLoginRecoveryExpiry() {
		return (java.sql.Timestamp) getValue(24);
	}

	/**
	 * Setter for <code>member.password_reset_secret</code>.
	 */
	public void setPasswordResetSecret(java.lang.String value) {
		setValue(25, value);
	}

	/**
	 * Getter for <code>member.password_reset_secret</code>.
	 */
	@Override
	public java.lang.String getPasswordResetSecret() {
		return (java.lang.String) getValue(25);
	}

	/**
	 * Setter for <code>member.password_reset_secret_expiry</code>.
	 */
	public void setPasswordResetSecretExpiry(java.sql.Timestamp value) {
		setValue(26, value);
	}

	/**
	 * Getter for <code>member.password_reset_secret_expiry</code>.
	 */
	@Override
	public java.sql.Timestamp getPasswordResetSecretExpiry() {
		return (java.sql.Timestamp) getValue(26);
	}

	/**
	 * Setter for <code>member.name</code>.
	 */
	public void setName(java.lang.String value) {
		setValue(27, value);
	}

	/**
	 * Getter for <code>member.name</code>.
	 */
	@Override
	public java.lang.String getName() {
		return (java.lang.String) getValue(27);
	}

	/**
	 * Setter for <code>member.identification</code>.
	 */
	public void setIdentification(java.lang.String value) {
		setValue(28, value);
	}

	/**
	 * Getter for <code>member.identification</code>.
	 */
	@Override
	public java.lang.String getIdentification() {
		return (java.lang.String) getValue(28);
	}

	/**
	 * Setter for <code>member.authentication</code>.
	 */
	public void setAuthentication(java.lang.String value) {
		setValue(29, value);
	}

	/**
	 * Getter for <code>member.authentication</code>.
	 */
	@Override
	public java.lang.String getAuthentication() {
		return (java.lang.String) getValue(29);
	}

	/**
	 * Setter for <code>member.organizational_unit</code>.
	 */
	public void setOrganizationalUnit(java.lang.String value) {
		setValue(30, value);
	}

	/**
	 * Getter for <code>member.organizational_unit</code>.
	 */
	@Override
	public java.lang.String getOrganizationalUnit() {
		return (java.lang.String) getValue(30);
	}

	/**
	 * Setter for <code>member.internal_posts</code>.
	 */
	public void setInternalPosts(java.lang.String value) {
		setValue(31, value);
	}

	/**
	 * Getter for <code>member.internal_posts</code>.
	 */
	@Override
	public java.lang.String getInternalPosts() {
		return (java.lang.String) getValue(31);
	}

	/**
	 * Setter for <code>member.realname</code>.
	 */
	public void setRealname(java.lang.String value) {
		setValue(32, value);
	}

	/**
	 * Getter for <code>member.realname</code>.
	 */
	@Override
	public java.lang.String getRealname() {
		return (java.lang.String) getValue(32);
	}

	/**
	 * Setter for <code>member.birthday</code>.
	 */
	public void setBirthday(java.sql.Date value) {
		setValue(33, value);
	}

	/**
	 * Getter for <code>member.birthday</code>.
	 */
	@Override
	public java.sql.Date getBirthday() {
		return (java.sql.Date) getValue(33);
	}

	/**
	 * Setter for <code>member.address</code>.
	 */
	public void setAddress(java.lang.String value) {
		setValue(34, value);
	}

	/**
	 * Getter for <code>member.address</code>.
	 */
	@Override
	public java.lang.String getAddress() {
		return (java.lang.String) getValue(34);
	}

	/**
	 * Setter for <code>member.email</code>.
	 */
	public void setEmail(java.lang.String value) {
		setValue(35, value);
	}

	/**
	 * Getter for <code>member.email</code>.
	 */
	@Override
	public java.lang.String getEmail() {
		return (java.lang.String) getValue(35);
	}

	/**
	 * Setter for <code>member.xmpp_address</code>.
	 */
	public void setXmppAddress(java.lang.String value) {
		setValue(36, value);
	}

	/**
	 * Getter for <code>member.xmpp_address</code>.
	 */
	@Override
	public java.lang.String getXmppAddress() {
		return (java.lang.String) getValue(36);
	}

	/**
	 * Setter for <code>member.website</code>.
	 */
	public void setWebsite(java.lang.String value) {
		setValue(37, value);
	}

	/**
	 * Getter for <code>member.website</code>.
	 */
	@Override
	public java.lang.String getWebsite() {
		return (java.lang.String) getValue(37);
	}

	/**
	 * Setter for <code>member.phone</code>.
	 */
	public void setPhone(java.lang.String value) {
		setValue(38, value);
	}

	/**
	 * Getter for <code>member.phone</code>.
	 */
	@Override
	public java.lang.String getPhone() {
		return (java.lang.String) getValue(38);
	}

	/**
	 * Setter for <code>member.mobile_phone</code>.
	 */
	public void setMobilePhone(java.lang.String value) {
		setValue(39, value);
	}

	/**
	 * Getter for <code>member.mobile_phone</code>.
	 */
	@Override
	public java.lang.String getMobilePhone() {
		return (java.lang.String) getValue(39);
	}

	/**
	 * Setter for <code>member.profession</code>.
	 */
	public void setProfession(java.lang.String value) {
		setValue(40, value);
	}

	/**
	 * Getter for <code>member.profession</code>.
	 */
	@Override
	public java.lang.String getProfession() {
		return (java.lang.String) getValue(40);
	}

	/**
	 * Setter for <code>member.external_memberships</code>.
	 */
	public void setExternalMemberships(java.lang.String value) {
		setValue(41, value);
	}

	/**
	 * Getter for <code>member.external_memberships</code>.
	 */
	@Override
	public java.lang.String getExternalMemberships() {
		return (java.lang.String) getValue(41);
	}

	/**
	 * Setter for <code>member.external_posts</code>.
	 */
	public void setExternalPosts(java.lang.String value) {
		setValue(42, value);
	}

	/**
	 * Getter for <code>member.external_posts</code>.
	 */
	@Override
	public java.lang.String getExternalPosts() {
		return (java.lang.String) getValue(42);
	}

	/**
	 * Setter for <code>member.formatting_engine</code>.
	 */
	public void setFormattingEngine(java.lang.String value) {
		setValue(43, value);
	}

	/**
	 * Getter for <code>member.formatting_engine</code>.
	 */
	@Override
	public java.lang.String getFormattingEngine() {
		return (java.lang.String) getValue(43);
	}

	/**
	 * Setter for <code>member.statement</code>.
	 */
	public void setStatement(java.lang.String value) {
		setValue(44, value);
	}

	/**
	 * Getter for <code>member.statement</code>.
	 */
	@Override
	public java.lang.String getStatement() {
		return (java.lang.String) getValue(44);
	}

	/**
	 * Setter for <code>member.text_search_data</code>.
	 */
	public void setTextSearchData(java.lang.Object value) {
		setValue(45, value);
	}

	/**
	 * Getter for <code>member.text_search_data</code>.
	 */
	@Override
	public java.lang.Object getTextSearchData() {
		return (java.lang.Object) getValue(45);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached MemberRecord
	 */
	public MemberRecord() {
		super(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Member.MEMBER);
	}

	/**
	 * Create a detached, initialised MemberRecord
	 */
	public MemberRecord(java.lang.Integer id, java.sql.Timestamp created, java.lang.String inviteCode, java.sql.Timestamp inviteCodeExpiry, java.lang.String adminComment, java.sql.Timestamp activated, java.sql.Date lastActivity, java.sql.Timestamp lastLogin, java.sql.Timestamp lastDelegationCheck, java.lang.String login, java.lang.String password, java.lang.String authority, java.lang.String authorityUid, java.lang.String authorityLogin, java.lang.Boolean locked, java.lang.Boolean active, java.lang.Boolean admin, java.lang.String lang, java.lang.String notifyEmail, java.lang.String notifyEmailUnconfirmed, java.lang.String notifyEmailSecret, java.sql.Timestamp notifyEmailSecretExpiry, java.sql.Timestamp notifyEmailLockExpiry, de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.NotifyLevel notifyLevel, java.sql.Timestamp loginRecoveryExpiry, java.lang.String passwordResetSecret, java.sql.Timestamp passwordResetSecretExpiry, java.lang.String name, java.lang.String identification, java.lang.String authentication, java.lang.String organizationalUnit, java.lang.String internalPosts, java.lang.String realname, java.sql.Date birthday, java.lang.String address, java.lang.String email, java.lang.String xmppAddress, java.lang.String website, java.lang.String phone, java.lang.String mobilePhone, java.lang.String profession, java.lang.String externalMemberships, java.lang.String externalPosts, java.lang.String formattingEngine, java.lang.String statement, java.lang.Object textSearchData) {
		super(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.Member.MEMBER);

		setValue(0, id);
		setValue(1, created);
		setValue(2, inviteCode);
		setValue(3, inviteCodeExpiry);
		setValue(4, adminComment);
		setValue(5, activated);
		setValue(6, lastActivity);
		setValue(7, lastLogin);
		setValue(8, lastDelegationCheck);
		setValue(9, login);
		setValue(10, password);
		setValue(11, authority);
		setValue(12, authorityUid);
		setValue(13, authorityLogin);
		setValue(14, locked);
		setValue(15, active);
		setValue(16, admin);
		setValue(17, lang);
		setValue(18, notifyEmail);
		setValue(19, notifyEmailUnconfirmed);
		setValue(20, notifyEmailSecret);
		setValue(21, notifyEmailSecretExpiry);
		setValue(22, notifyEmailLockExpiry);
		setValue(23, notifyLevel);
		setValue(24, loginRecoveryExpiry);
		setValue(25, passwordResetSecret);
		setValue(26, passwordResetSecretExpiry);
		setValue(27, name);
		setValue(28, identification);
		setValue(29, authentication);
		setValue(30, organizationalUnit);
		setValue(31, internalPosts);
		setValue(32, realname);
		setValue(33, birthday);
		setValue(34, address);
		setValue(35, email);
		setValue(36, xmppAddress);
		setValue(37, website);
		setValue(38, phone);
		setValue(39, mobilePhone);
		setValue(40, profession);
		setValue(41, externalMemberships);
		setValue(42, externalPosts);
		setValue(43, formattingEngine);
		setValue(44, statement);
		setValue(45, textSearchData);
	}
}
