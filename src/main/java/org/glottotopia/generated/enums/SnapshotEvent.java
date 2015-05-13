/**
 * This class is generated by jOOQ
 */
package org.liquidfeedback.generated.enums;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum SnapshotEvent implements org.jooq.EnumType {

	periodic("periodic"),

	end_of_admission("end_of_admission"),

	half_freeze("half_freeze"),

	full_freeze("full_freeze");

	private final java.lang.String literal;

	private SnapshotEvent(java.lang.String literal) {
		this.literal = literal;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Schema getSchema() {
		return org.liquidfeedback.generated.DefaultSchema.DEFAULT_SCHEMA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String getName() {
		return "snapshot_event";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String getLiteral() {
		return literal;
	}
}