/**
 * This class is generated by jOOQ
 */
package de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IndividualSuggestionRanking implements de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.interfaces.IIndividualSuggestionRanking {

	private static final long serialVersionUID = 1734006346;

	private final java.lang.Integer initiativeId;
	private final java.lang.Integer memberId;
	private final java.lang.Integer weight;
	private final java.lang.Integer preference;
	private final java.lang.Long    suggestionId;

	public IndividualSuggestionRanking(
		java.lang.Integer initiativeId,
		java.lang.Integer memberId,
		java.lang.Integer weight,
		java.lang.Integer preference,
		java.lang.Long    suggestionId
	) {
		this.initiativeId = initiativeId;
		this.memberId = memberId;
		this.weight = weight;
		this.preference = preference;
		this.suggestionId = suggestionId;
	}

	@Override
	public java.lang.Integer getInitiativeId() {
		return this.initiativeId;
	}

	@Override
	public java.lang.Integer getMemberId() {
		return this.memberId;
	}

	@Override
	public java.lang.Integer getWeight() {
		return this.weight;
	}

	@Override
	public java.lang.Integer getPreference() {
		return this.preference;
	}

	@Override
	public java.lang.Long getSuggestionId() {
		return this.suggestionId;
	}
}
