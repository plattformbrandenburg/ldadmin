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
public interface IOpeningDraft extends java.io.Serializable {

	/**
	 * Getter for <code>opening_draft.initiative_id</code>.
	 */
	public java.lang.Integer getInitiativeId();

	/**
	 * Getter for <code>opening_draft.id</code>.
	 */
	public java.lang.Long getId();

	/**
	 * Getter for <code>opening_draft.created</code>.
	 */
	public java.sql.Timestamp getCreated();

	/**
	 * Getter for <code>opening_draft.author_id</code>.
	 */
	public java.lang.Integer getAuthorId();

	/**
	 * Getter for <code>opening_draft.formatting_engine</code>.
	 */
	public java.lang.String getFormattingEngine();

	/**
	 * Getter for <code>opening_draft.content</code>.
	 */
	public java.lang.String getContent();

	/**
	 * Getter for <code>opening_draft.text_search_data</code>.
	 */
	public java.lang.Object getTextSearchData();
}
