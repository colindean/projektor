/*
 * This file is generated by jOOQ.
 */
package projektor.database.generated.tables;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import projektor.database.generated.Indexes;
import projektor.database.generated.Keys;
import projektor.database.generated.Public;
import projektor.database.generated.tables.records.TestCaseRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.13.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TestCase extends TableImpl<TestCaseRecord> {

    private static final long serialVersionUID = -1917455869;

    /**
     * The reference instance of <code>public.test_case</code>
     */
    public static final TestCase TEST_CASE = new TestCase();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TestCaseRecord> getRecordType() {
        return TestCaseRecord.class;
    }

    /**
     * The column <code>public.test_case.id</code>.
     */
    public final TableField<TestCaseRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('test_case_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.test_case.test_suite_id</code>.
     */
    public final TableField<TestCaseRecord, Long> TEST_SUITE_ID = createField(DSL.name("test_suite_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('test_case_test_suite_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.test_case.idx</code>.
     */
    public final TableField<TestCaseRecord, Integer> IDX = createField(DSL.name("idx"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.test_case.name</code>.
     */
    public final TableField<TestCaseRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.test_case.package_name</code>.
     */
    public final TableField<TestCaseRecord, String> PACKAGE_NAME = createField(DSL.name("package_name"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.test_case.class_name</code>.
     */
    public final TableField<TestCaseRecord, String> CLASS_NAME = createField(DSL.name("class_name"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.test_case.duration</code>.
     */
    public final TableField<TestCaseRecord, BigDecimal> DURATION = createField(DSL.name("duration"), org.jooq.impl.SQLDataType.NUMERIC(12, 3), this, "");

    /**
     * The column <code>public.test_case.passed</code>.
     */
    public final TableField<TestCaseRecord, Boolean> PASSED = createField(DSL.name("passed"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>public.test_case.skipped</code>.
     */
    public final TableField<TestCaseRecord, Boolean> SKIPPED = createField(DSL.name("skipped"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * Create a <code>public.test_case</code> table reference
     */
    public TestCase() {
        this(DSL.name("test_case"), null);
    }

    /**
     * Create an aliased <code>public.test_case</code> table reference
     */
    public TestCase(String alias) {
        this(DSL.name(alias), TEST_CASE);
    }

    /**
     * Create an aliased <code>public.test_case</code> table reference
     */
    public TestCase(Name alias) {
        this(alias, TEST_CASE);
    }

    private TestCase(Name alias, Table<TestCaseRecord> aliased) {
        this(alias, aliased, null);
    }

    private TestCase(Name alias, Table<TestCaseRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> TestCase(Table<O> child, ForeignKey<O, TestCaseRecord> key) {
        super(child, key, TEST_CASE);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.IDX_TEST_CASE_DURATION, Indexes.IDX_TEST_CASE_IDX, Indexes.IDX_TEST_CASE_PASSED, Indexes.IDX_TEST_CASE_TEST_SUITE_ID);
    }

    @Override
    public Identity<TestCaseRecord, Long> getIdentity() {
        return Keys.IDENTITY_TEST_CASE;
    }

    @Override
    public UniqueKey<TestCaseRecord> getPrimaryKey() {
        return Keys.TEST_CASE_PKEY;
    }

    @Override
    public List<UniqueKey<TestCaseRecord>> getKeys() {
        return Arrays.<UniqueKey<TestCaseRecord>>asList(Keys.TEST_CASE_PKEY);
    }

    @Override
    public List<ForeignKey<TestCaseRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<TestCaseRecord, ?>>asList(Keys.TEST_CASE__TEST_CASE_TEST_SUITE_ID_FKEY);
    }

    public TestSuite testSuite() {
        return new TestSuite(this, Keys.TEST_CASE__TEST_CASE_TEST_SUITE_ID_FKEY);
    }

    @Override
    public TestCase as(String alias) {
        return new TestCase(DSL.name(alias), this);
    }

    @Override
    public TestCase as(Name alias) {
        return new TestCase(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TestCase rename(String name) {
        return new TestCase(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TestCase rename(Name name) {
        return new TestCase(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, Long, Integer, String, String, String, BigDecimal, Boolean, Boolean> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
