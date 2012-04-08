/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.person.tables;

/**
 * This class is generated by jOOQ.
 */
public class Contact extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.person.tables.records.Contact> {

	private static final long serialVersionUID = 1023217011;

	/**
	 * The singleton instance of Person.Contact
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.person.tables.Contact Contact = new org.jooq.examples.sqlserver.adventureworks.person.tables.Contact();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.sqlserver.adventureworks.person.tables.records.Contact> __RECORD_TYPE = org.jooq.examples.sqlserver.adventureworks.person.tables.records.Contact.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.person.tables.records.Contact> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.Contact, java.lang.Integer> ContactID = createField("ContactID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.Contact, java.lang.Boolean> NameStyle = createField("NameStyle", org.jooq.impl.SQLDataType.BIT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.Contact, java.lang.String> Title = createField("Title", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.Contact, java.lang.String> FirstName = createField("FirstName", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.Contact, java.lang.String> MiddleName = createField("MiddleName", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.Contact, java.lang.String> LastName = createField("LastName", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.Contact, java.lang.String> Suffix = createField("Suffix", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.Contact, java.lang.String> EmailAddress = createField("EmailAddress", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.Contact, java.lang.Integer> EmailPromotion = createField("EmailPromotion", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.Contact, java.lang.String> Phone = createField("Phone", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.Contact, java.lang.String> PasswordHash = createField("PasswordHash", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.Contact, java.lang.String> PasswordSalt = createField("PasswordSalt", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (xml, ) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.Contact, java.lang.Object> AdditionalContactInfo = createField("AdditionalContactInfo", org.jooq.util.sqlserver.SQLServerDataType.getDefaultDataType("xml"), this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.Contact, java.lang.String> rowguid = createField("rowguid", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.Contact, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	public Contact() {
		super("Contact", org.jooq.examples.sqlserver.adventureworks.person.Person.Person);
	}

	public Contact(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.person.Person.Person, org.jooq.examples.sqlserver.adventureworks.person.tables.Contact.Contact);
	}

	@Override
	public org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.person.tables.records.Contact, java.lang.Integer> getIdentity() {
		return org.jooq.examples.sqlserver.adventureworks.person.Keys.IDENTITY_Contact;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.person.tables.records.Contact> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.person.Keys.PK_Contact_ContactID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.person.tables.records.Contact>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.person.tables.records.Contact>>asList(org.jooq.examples.sqlserver.adventureworks.person.Keys.PK_Contact_ContactID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.person.tables.Contact as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.person.tables.Contact(alias);
	}
}
