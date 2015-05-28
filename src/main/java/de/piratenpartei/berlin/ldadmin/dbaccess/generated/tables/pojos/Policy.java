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
public class Policy implements de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.interfaces.IPolicy {

	private static final long serialVersionUID = -1724858339;

	private final java.lang.Integer                                 id;
	private final java.lang.Integer                                 index;
	private final java.lang.Boolean                                 active;
	private final java.lang.String                                  name;
	private final java.lang.String                                  description;
	private final java.lang.Boolean                                 polling;
	private final java.lang.Object                                  admissionTime;
	private final java.lang.Object                                  discussionTime;
	private final java.lang.Object                                  verificationTime;
	private final java.lang.Object                                  votingTime;
	private final java.lang.Integer                                 issueQuorumNum;
	private final java.lang.Integer                                 issueQuorumDen;
	private final java.lang.Integer                                 initiativeQuorumNum;
	private final java.lang.Integer                                 initiativeQuorumDen;
	private final de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.DefeatStrength defeatStrength;
	private final de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.TieBreaking    tieBreaking;
	private final java.lang.Integer                                 directMajorityNum;
	private final java.lang.Integer                                 directMajorityDen;
	private final java.lang.Boolean                                 directMajorityStrict;
	private final java.lang.Integer                                 directMajorityPositive;
	private final java.lang.Integer                                 directMajorityNonNegative;
	private final java.lang.Integer                                 indirectMajorityNum;
	private final java.lang.Integer                                 indirectMajorityDen;
	private final java.lang.Boolean                                 indirectMajorityStrict;
	private final java.lang.Integer                                 indirectMajorityPositive;
	private final java.lang.Integer                                 indirectMajorityNonNegative;
	private final java.lang.Boolean                                 noReverseBeatPath;
	private final java.lang.Boolean                                 noMultistageMajority;

	public Policy(
		java.lang.Integer                                 id,
		java.lang.Integer                                 index,
		java.lang.Boolean                                 active,
		java.lang.String                                  name,
		java.lang.String                                  description,
		java.lang.Boolean                                 polling,
		java.lang.Object                                  admissionTime,
		java.lang.Object                                  discussionTime,
		java.lang.Object                                  verificationTime,
		java.lang.Object                                  votingTime,
		java.lang.Integer                                 issueQuorumNum,
		java.lang.Integer                                 issueQuorumDen,
		java.lang.Integer                                 initiativeQuorumNum,
		java.lang.Integer                                 initiativeQuorumDen,
		de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.DefeatStrength defeatStrength,
		de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.TieBreaking    tieBreaking,
		java.lang.Integer                                 directMajorityNum,
		java.lang.Integer                                 directMajorityDen,
		java.lang.Boolean                                 directMajorityStrict,
		java.lang.Integer                                 directMajorityPositive,
		java.lang.Integer                                 directMajorityNonNegative,
		java.lang.Integer                                 indirectMajorityNum,
		java.lang.Integer                                 indirectMajorityDen,
		java.lang.Boolean                                 indirectMajorityStrict,
		java.lang.Integer                                 indirectMajorityPositive,
		java.lang.Integer                                 indirectMajorityNonNegative,
		java.lang.Boolean                                 noReverseBeatPath,
		java.lang.Boolean                                 noMultistageMajority
	) {
		this.id = id;
		this.index = index;
		this.active = active;
		this.name = name;
		this.description = description;
		this.polling = polling;
		this.admissionTime = admissionTime;
		this.discussionTime = discussionTime;
		this.verificationTime = verificationTime;
		this.votingTime = votingTime;
		this.issueQuorumNum = issueQuorumNum;
		this.issueQuorumDen = issueQuorumDen;
		this.initiativeQuorumNum = initiativeQuorumNum;
		this.initiativeQuorumDen = initiativeQuorumDen;
		this.defeatStrength = defeatStrength;
		this.tieBreaking = tieBreaking;
		this.directMajorityNum = directMajorityNum;
		this.directMajorityDen = directMajorityDen;
		this.directMajorityStrict = directMajorityStrict;
		this.directMajorityPositive = directMajorityPositive;
		this.directMajorityNonNegative = directMajorityNonNegative;
		this.indirectMajorityNum = indirectMajorityNum;
		this.indirectMajorityDen = indirectMajorityDen;
		this.indirectMajorityStrict = indirectMajorityStrict;
		this.indirectMajorityPositive = indirectMajorityPositive;
		this.indirectMajorityNonNegative = indirectMajorityNonNegative;
		this.noReverseBeatPath = noReverseBeatPath;
		this.noMultistageMajority = noMultistageMajority;
	}

	@Override
	public java.lang.Integer getId() {
		return this.id;
	}

	@Override
	public java.lang.Integer getIndex() {
		return this.index;
	}

	@Override
	public java.lang.Boolean getActive() {
		return this.active;
	}

	@Override
	public java.lang.String getName() {
		return this.name;
	}

	@Override
	public java.lang.String getDescription() {
		return this.description;
	}

	@Override
	public java.lang.Boolean getPolling() {
		return this.polling;
	}

	@Override
	public java.lang.Object getAdmissionTime() {
		return this.admissionTime;
	}

	@Override
	public java.lang.Object getDiscussionTime() {
		return this.discussionTime;
	}

	@Override
	public java.lang.Object getVerificationTime() {
		return this.verificationTime;
	}

	@Override
	public java.lang.Object getVotingTime() {
		return this.votingTime;
	}

	@Override
	public java.lang.Integer getIssueQuorumNum() {
		return this.issueQuorumNum;
	}

	@Override
	public java.lang.Integer getIssueQuorumDen() {
		return this.issueQuorumDen;
	}

	@Override
	public java.lang.Integer getInitiativeQuorumNum() {
		return this.initiativeQuorumNum;
	}

	@Override
	public java.lang.Integer getInitiativeQuorumDen() {
		return this.initiativeQuorumDen;
	}

	@Override
	public de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.DefeatStrength getDefeatStrength() {
		return this.defeatStrength;
	}

	@Override
	public de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.TieBreaking getTieBreaking() {
		return this.tieBreaking;
	}

	@Override
	public java.lang.Integer getDirectMajorityNum() {
		return this.directMajorityNum;
	}

	@Override
	public java.lang.Integer getDirectMajorityDen() {
		return this.directMajorityDen;
	}

	@Override
	public java.lang.Boolean getDirectMajorityStrict() {
		return this.directMajorityStrict;
	}

	@Override
	public java.lang.Integer getDirectMajorityPositive() {
		return this.directMajorityPositive;
	}

	@Override
	public java.lang.Integer getDirectMajorityNonNegative() {
		return this.directMajorityNonNegative;
	}

	@Override
	public java.lang.Integer getIndirectMajorityNum() {
		return this.indirectMajorityNum;
	}

	@Override
	public java.lang.Integer getIndirectMajorityDen() {
		return this.indirectMajorityDen;
	}

	@Override
	public java.lang.Boolean getIndirectMajorityStrict() {
		return this.indirectMajorityStrict;
	}

	@Override
	public java.lang.Integer getIndirectMajorityPositive() {
		return this.indirectMajorityPositive;
	}

	@Override
	public java.lang.Integer getIndirectMajorityNonNegative() {
		return this.indirectMajorityNonNegative;
	}

	@Override
	public java.lang.Boolean getNoReverseBeatPath() {
		return this.noReverseBeatPath;
	}

	@Override
	public java.lang.Boolean getNoMultistageMajority() {
		return this.noMultistageMajority;
	}
}
