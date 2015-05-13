/**
 * This class is generated by jOOQ
 */
package org.liquidfeedback.generated.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IOpenIssue extends java.io.Serializable {

	/**
	 * Getter for <code>open_issue.id</code>.
	 */
	public java.lang.Integer getId();

	/**
	 * Getter for <code>open_issue.area_id</code>.
	 */
	public java.lang.Integer getAreaId();

	/**
	 * Getter for <code>open_issue.policy_id</code>.
	 */
	public java.lang.Integer getPolicyId();

	/**
	 * Getter for <code>open_issue.admin_notice</code>.
	 */
	public java.lang.String getAdminNotice();

	/**
	 * Getter for <code>open_issue.state</code>.
	 */
	public org.liquidfeedback.generated.enums.IssueState getState();

	/**
	 * Getter for <code>open_issue.phase_finished</code>.
	 */
	public java.sql.Timestamp getPhaseFinished();

	/**
	 * Getter for <code>open_issue.created</code>.
	 */
	public java.sql.Timestamp getCreated();

	/**
	 * Getter for <code>open_issue.accepted</code>.
	 */
	public java.sql.Timestamp getAccepted();

	/**
	 * Getter for <code>open_issue.half_frozen</code>.
	 */
	public java.sql.Timestamp getHalfFrozen();

	/**
	 * Getter for <code>open_issue.fully_frozen</code>.
	 */
	public java.sql.Timestamp getFullyFrozen();

	/**
	 * Getter for <code>open_issue.closed</code>.
	 */
	public java.sql.Timestamp getClosed();

	/**
	 * Getter for <code>open_issue.cleaned</code>.
	 */
	public java.sql.Timestamp getCleaned();

	/**
	 * Getter for <code>open_issue.admission_time</code>.
	 */
	public java.lang.Object getAdmissionTime();

	/**
	 * Getter for <code>open_issue.discussion_time</code>.
	 */
	public java.lang.Object getDiscussionTime();

	/**
	 * Getter for <code>open_issue.verification_time</code>.
	 */
	public java.lang.Object getVerificationTime();

	/**
	 * Getter for <code>open_issue.voting_time</code>.
	 */
	public java.lang.Object getVotingTime();

	/**
	 * Getter for <code>open_issue.snapshot</code>.
	 */
	public java.sql.Timestamp getSnapshot();

	/**
	 * Getter for <code>open_issue.latest_snapshot_event</code>.
	 */
	public org.liquidfeedback.generated.enums.SnapshotEvent getLatestSnapshotEvent();

	/**
	 * Getter for <code>open_issue.population</code>.
	 */
	public java.lang.Integer getPopulation();

	/**
	 * Getter for <code>open_issue.voter_count</code>.
	 */
	public java.lang.Integer getVoterCount();

	/**
	 * Getter for <code>open_issue.status_quo_schulze_rank</code>.
	 */
	public java.lang.Integer getStatusQuoSchulzeRank();
}