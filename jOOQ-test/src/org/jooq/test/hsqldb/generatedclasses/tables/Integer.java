/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class Integer extends org.jooq.impl.TableImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.IntegerRecord> {

	private static final long serialVersionUID = -1074332444;

	/**
	 * The singleton instance of PUBLIC.INTEGER
	 */
	public static final org.jooq.test.hsqldb.generatedclasses.tables.Integer INTEGER = new org.jooq.test.hsqldb.generatedclasses.tables.Integer();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.hsqldb.generatedclasses.tables.records.IntegerRecord> __RECORD_TYPE = org.jooq.test.hsqldb.generatedclasses.tables.records.IntegerRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.hsqldb.generatedclasses.tables.records.IntegerRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.IntegerRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	public Integer() {
		super("INTEGER", org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC);
	}

	public Integer(java.lang.String alias) {
		super(alias, org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC, org.jooq.test.hsqldb.generatedclasses.tables.Integer.INTEGER);
	}

	@Override
	public org.jooq.test.hsqldb.generatedclasses.tables.Integer as(java.lang.String alias) {
		return new org.jooq.test.hsqldb.generatedclasses.tables.Integer(alias);
	}
}
