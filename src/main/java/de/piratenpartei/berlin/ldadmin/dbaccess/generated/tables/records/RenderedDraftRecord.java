/**
 * This class is generated by jOOQ
 */
package de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RenderedDraftRecord extends org.jooq.impl.UpdatableRecordImpl<de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.records.RenderedDraftRecord> implements org.jooq.Record3<java.lang.Long, java.lang.String, java.lang.String>, de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.interfaces.IRenderedDraft {

	private static final long serialVersionUID = -1861659213;

	/**
	 * Setter for <code>rendered_draft.draft_id</code>.
	 */
	public void setDraftId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>rendered_draft.draft_id</code>.
	 */
	@Override
	public java.lang.Long getDraftId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>rendered_draft.format</code>.
	 */
	public void setFormat(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>rendered_draft.format</code>.
	 */
	@Override
	public java.lang.String getFormat() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>rendered_draft.content</code>.
	 */
	public void setContent(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>rendered_draft.content</code>.
	 */
	@Override
	public java.lang.String getContent() {
		return (java.lang.String) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record2<java.lang.Long, java.lang.String> key() {
		return (org.jooq.Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Long, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Long, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.RenderedDraft.RENDERED_DRAFT.DRAFT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.RenderedDraft.RENDERED_DRAFT.FORMAT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.RenderedDraft.RENDERED_DRAFT.CONTENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return getDraftId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getFormat();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getContent();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RenderedDraftRecord value1(java.lang.Long value) {
		setDraftId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RenderedDraftRecord value2(java.lang.String value) {
		setFormat(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RenderedDraftRecord value3(java.lang.String value) {
		setContent(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RenderedDraftRecord values(java.lang.Long value1, java.lang.String value2, java.lang.String value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached RenderedDraftRecord
	 */
	public RenderedDraftRecord() {
		super(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.RenderedDraft.RENDERED_DRAFT);
	}

	/**
	 * Create a detached, initialised RenderedDraftRecord
	 */
	public RenderedDraftRecord(java.lang.Long draftId, java.lang.String format, java.lang.String content) {
		super(de.piratenpartei.berlin.ldadmin.dbaccess.generated.tables.RenderedDraft.RENDERED_DRAFT);

		setValue(0, draftId);
		setValue(1, format);
		setValue(2, content);
	}
}
