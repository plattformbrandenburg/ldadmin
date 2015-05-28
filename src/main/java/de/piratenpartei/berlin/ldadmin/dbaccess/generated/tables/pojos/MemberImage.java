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
public class MemberImage implements de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.interfaces.IMemberImage {

	private static final long serialVersionUID = -539132294;

	private final java.lang.Integer                                  memberId;
	private final de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.MemberImageType imageType;
	private final java.lang.Boolean                                  scaled;
	private final java.lang.String                                   contentType;
	private final byte[]                                             data;

	public MemberImage(
		java.lang.Integer                                  memberId,
		de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.MemberImageType imageType,
		java.lang.Boolean                                  scaled,
		java.lang.String                                   contentType,
		byte[]                                             data
	) {
		this.memberId = memberId;
		this.imageType = imageType;
		this.scaled = scaled;
		this.contentType = contentType;
		this.data = data;
	}

	@Override
	public java.lang.Integer getMemberId() {
		return this.memberId;
	}

	@Override
	public de.piratenpartei.berlin.ldadmin.dbaccess.generated.enums.MemberImageType getImageType() {
		return this.imageType;
	}

	@Override
	public java.lang.Boolean getScaled() {
		return this.scaled;
	}

	@Override
	public java.lang.String getContentType() {
		return this.contentType;
	}

	@Override
	public byte[] getData() {
		return this.data;
	}
}
