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
public class Contact implements de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.interfaces.IContact {

	private static final long serialVersionUID = 1174975584;

	private final java.lang.Integer memberId;
	private final java.lang.Integer otherMemberId;
	private final java.lang.Boolean public_;

	public Contact(
		java.lang.Integer memberId,
		java.lang.Integer otherMemberId,
		java.lang.Boolean public_
	) {
		this.memberId = memberId;
		this.otherMemberId = otherMemberId;
		this.public_ = public_;
	}

	@Override
	public java.lang.Integer getMemberId() {
		return this.memberId;
	}

	@Override
	public java.lang.Integer getOtherMemberId() {
		return this.otherMemberId;
	}

	@Override
	public java.lang.Boolean getPublic() {
		return this.public_;
	}
}
