/*
 * This file is generated by jOOQ.
 */
package projektor.database.generated.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;

import projektor.database.generated.tables.TestRun;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TestRunRecord extends UpdatableRecordImpl<TestRunRecord> implements Record11<Long, String, Integer, Integer, Integer, Integer, Boolean, BigDecimal, BigDecimal, BigDecimal, Timestamp> {

    private static final long serialVersionUID = -1285783027;

    /**
     * Setter for <code>public.test_run.id</code>.
     */
    public TestRunRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.test_run.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.test_run.public_id</code>.
     */
    public TestRunRecord setPublicId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.test_run.public_id</code>.
     */
    public String getPublicId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.test_run.total_test_count</code>.
     */
    public TestRunRecord setTotalTestCount(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.test_run.total_test_count</code>.
     */
    public Integer getTotalTestCount() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.test_run.total_passing_count</code>.
     */
    public TestRunRecord setTotalPassingCount(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.test_run.total_passing_count</code>.
     */
    public Integer getTotalPassingCount() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.test_run.total_skipped_count</code>.
     */
    public TestRunRecord setTotalSkippedCount(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.test_run.total_skipped_count</code>.
     */
    public Integer getTotalSkippedCount() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.test_run.total_failure_count</code>.
     */
    public TestRunRecord setTotalFailureCount(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.test_run.total_failure_count</code>.
     */
    public Integer getTotalFailureCount() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.test_run.passed</code>.
     */
    public TestRunRecord setPassed(Boolean value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.test_run.passed</code>.
     */
    public Boolean getPassed() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>public.test_run.cumulative_duration</code>.
     */
    public TestRunRecord setCumulativeDuration(BigDecimal value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>public.test_run.cumulative_duration</code>.
     */
    public BigDecimal getCumulativeDuration() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>public.test_run.average_duration</code>.
     */
    public TestRunRecord setAverageDuration(BigDecimal value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>public.test_run.average_duration</code>.
     */
    public BigDecimal getAverageDuration() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>public.test_run.slowest_test_case_duration</code>.
     */
    public TestRunRecord setSlowestTestCaseDuration(BigDecimal value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>public.test_run.slowest_test_case_duration</code>.
     */
    public BigDecimal getSlowestTestCaseDuration() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>public.test_run.created_timestamp</code>.
     */
    public TestRunRecord setCreatedTimestamp(Timestamp value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>public.test_run.created_timestamp</code>.
     */
    public Timestamp getCreatedTimestamp() {
        return (Timestamp) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Long, String, Integer, Integer, Integer, Integer, Boolean, BigDecimal, BigDecimal, BigDecimal, Timestamp> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Long, String, Integer, Integer, Integer, Integer, Boolean, BigDecimal, BigDecimal, BigDecimal, Timestamp> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TestRun.TEST_RUN.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TestRun.TEST_RUN.PUBLIC_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TestRun.TEST_RUN.TOTAL_TEST_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return TestRun.TEST_RUN.TOTAL_PASSING_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return TestRun.TEST_RUN.TOTAL_SKIPPED_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return TestRun.TEST_RUN.TOTAL_FAILURE_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return TestRun.TEST_RUN.PASSED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field8() {
        return TestRun.TEST_RUN.CUMULATIVE_DURATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field9() {
        return TestRun.TEST_RUN.AVERAGE_DURATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field10() {
        return TestRun.TEST_RUN.SLOWEST_TEST_CASE_DURATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return TestRun.TEST_RUN.CREATED_TIMESTAMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getPublicId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getTotalTestCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getTotalPassingCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getTotalSkippedCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getTotalFailureCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component7() {
        return getPassed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component8() {
        return getCumulativeDuration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component9() {
        return getAverageDuration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component10() {
        return getSlowestTestCaseDuration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getCreatedTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getPublicId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getTotalTestCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getTotalPassingCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getTotalSkippedCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getTotalFailureCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value7() {
        return getPassed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value8() {
        return getCumulativeDuration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value9() {
        return getAverageDuration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value10() {
        return getSlowestTestCaseDuration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getCreatedTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestRunRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestRunRecord value2(String value) {
        setPublicId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestRunRecord value3(Integer value) {
        setTotalTestCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestRunRecord value4(Integer value) {
        setTotalPassingCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestRunRecord value5(Integer value) {
        setTotalSkippedCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestRunRecord value6(Integer value) {
        setTotalFailureCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestRunRecord value7(Boolean value) {
        setPassed(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestRunRecord value8(BigDecimal value) {
        setCumulativeDuration(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestRunRecord value9(BigDecimal value) {
        setAverageDuration(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestRunRecord value10(BigDecimal value) {
        setSlowestTestCaseDuration(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestRunRecord value11(Timestamp value) {
        setCreatedTimestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestRunRecord values(Long value1, String value2, Integer value3, Integer value4, Integer value5, Integer value6, Boolean value7, BigDecimal value8, BigDecimal value9, BigDecimal value10, Timestamp value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TestRunRecord
     */
    public TestRunRecord() {
        super(TestRun.TEST_RUN);
    }

    /**
     * Create a detached, initialised TestRunRecord
     */
    public TestRunRecord(Long id, String publicId, Integer totalTestCount, Integer totalPassingCount, Integer totalSkippedCount, Integer totalFailureCount, Boolean passed, BigDecimal cumulativeDuration, BigDecimal averageDuration, BigDecimal slowestTestCaseDuration, Timestamp createdTimestamp) {
        super(TestRun.TEST_RUN);

        set(0, id);
        set(1, publicId);
        set(2, totalTestCount);
        set(3, totalPassingCount);
        set(4, totalSkippedCount);
        set(5, totalFailureCount);
        set(6, passed);
        set(7, cumulativeDuration);
        set(8, averageDuration);
        set(9, slowestTestCaseDuration);
        set(10, createdTimestamp);
    }
}
