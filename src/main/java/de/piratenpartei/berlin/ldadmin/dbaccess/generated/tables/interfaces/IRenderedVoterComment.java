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
public interface IRenderedVoterComment extends java.io.Serializable {

	/**
	 * Getter for <code>rendered_voter_comment.issue_id</code>.
	 */
	public java.lang.Integer getIssueId();

	/**
	 * Getter for <code>rendered_voter_comment.member_id</code>.
	 */
	public java.lang.Integer getMemberId();

	/**
	 * Getter for <code>rendered_voter_comment.format</code>.
	 */
	public java.lang.String getFormat();

	/**
	 * Getter for <code>rendered_voter_comment.content</code>.
	 */
	public java.lang.String getContent();
}
