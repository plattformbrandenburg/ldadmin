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
public interface IBattleView extends java.io.Serializable {

	/**
	 * Getter for <code>battle_view.issue_id</code>.
	 */
	public java.lang.Integer getIssueId();

	/**
	 * Getter for <code>battle_view.winning_initiative_id</code>.
	 */
	public java.lang.Integer getWinningInitiativeId();

	/**
	 * Getter for <code>battle_view.losing_initiative_id</code>.
	 */
	public java.lang.Integer getLosingInitiativeId();

	/**
	 * Getter for <code>battle_view.count</code>.
	 */
	public java.lang.Long getCount();
}
