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
public class RemainingHarmonicInitiativeWeightSummands implements de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.interfaces.IRemainingHarmonicInitiativeWeightSummands {

	private static final long serialVersionUID = 380850696;

	private final java.lang.Integer issueId;
	private final java.lang.Integer initiativeId;
	private final java.lang.Boolean admitted;
	private final java.lang.Long    weightNum;
	private final java.lang.Long    weightDen;

	public RemainingHarmonicInitiativeWeightSummands(
		java.lang.Integer issueId,
		java.lang.Integer initiativeId,
		java.lang.Boolean admitted,
		java.lang.Long    weightNum,
		java.lang.Long    weightDen
	) {
		this.issueId = issueId;
		this.initiativeId = initiativeId;
		this.admitted = admitted;
		this.weightNum = weightNum;
		this.weightDen = weightDen;
	}

	@Override
	public java.lang.Integer getIssueId() {
		return this.issueId;
	}

	@Override
	public java.lang.Integer getInitiativeId() {
		return this.initiativeId;
	}

	@Override
	public java.lang.Boolean getAdmitted() {
		return this.admitted;
	}

	@Override
	public java.lang.Long getWeightNum() {
		return this.weightNum;
	}

	@Override
	public java.lang.Long getWeightDen() {
		return this.weightDen;
	}
}
