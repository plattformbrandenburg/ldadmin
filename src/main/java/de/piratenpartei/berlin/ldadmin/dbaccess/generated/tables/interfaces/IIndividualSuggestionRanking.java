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
public interface IIndividualSuggestionRanking extends java.io.Serializable {

	/**
	 * Getter for <code>individual_suggestion_ranking.initiative_id</code>.
	 */
	public java.lang.Integer getInitiativeId();

	/**
	 * Getter for <code>individual_suggestion_ranking.member_id</code>.
	 */
	public java.lang.Integer getMemberId();

	/**
	 * Getter for <code>individual_suggestion_ranking.weight</code>.
	 */
	public java.lang.Integer getWeight();

	/**
	 * Getter for <code>individual_suggestion_ranking.preference</code>.
	 */
	public java.lang.Integer getPreference();

	/**
	 * Getter for <code>individual_suggestion_ranking.suggestion_id</code>.
	 */
	public java.lang.Long getSuggestionId();
}
