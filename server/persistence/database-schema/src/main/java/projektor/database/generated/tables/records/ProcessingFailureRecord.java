/*
 * This file is generated by jOOQ.
 */
package projektor.database.generated.tables.records;


import java.sql.Timestamp;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;

import projektor.database.generated.tables.ProcessingFailure;


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
public class ProcessingFailureRecord extends UpdatableRecordImpl<ProcessingFailureRecord> implements Record6<Long, String, String, String, String, Timestamp> {

    private static final long serialVersionUID = 530059786;

    /**
     * Setter for <code>public.processing_failure.id</code>.
     */
    public ProcessingFailureRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.processing_failure.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.processing_failure.public_id</code>.
     */
    public ProcessingFailureRecord setPublicId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.processing_failure.public_id</code>.
     */
    public String getPublicId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.processing_failure.body</code>.
     */
    public ProcessingFailureRecord setBody(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.processing_failure.body</code>.
     */
    public String getBody() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.processing_failure.failure</code>.
     */
    public ProcessingFailureRecord setFailure(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.processing_failure.failure</code>.
     */
    public String getFailure() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.processing_failure.body_type</code>.
     */
    public ProcessingFailureRecord setBodyType(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.processing_failure.body_type</code>.
     */
    public String getBodyType() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.processing_failure.created_timestamp</code>.
     */
    public ProcessingFailureRecord setCreatedTimestamp(Timestamp value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.processing_failure.created_timestamp</code>.
     */
    public Timestamp getCreatedTimestamp() {
        return (Timestamp) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, String, String, String, String, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Long, String, String, String, String, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return ProcessingFailure.PROCESSING_FAILURE.ID;
    }

    @Override
    public Field<String> field2() {
        return ProcessingFailure.PROCESSING_FAILURE.PUBLIC_ID;
    }

    @Override
    public Field<String> field3() {
        return ProcessingFailure.PROCESSING_FAILURE.BODY;
    }

    @Override
    public Field<String> field4() {
        return ProcessingFailure.PROCESSING_FAILURE.FAILURE;
    }

    @Override
    public Field<String> field5() {
        return ProcessingFailure.PROCESSING_FAILURE.BODY_TYPE;
    }

    @Override
    public Field<Timestamp> field6() {
        return ProcessingFailure.PROCESSING_FAILURE.CREATED_TIMESTAMP;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getPublicId();
    }

    @Override
    public String component3() {
        return getBody();
    }

    @Override
    public String component4() {
        return getFailure();
    }

    @Override
    public String component5() {
        return getBodyType();
    }

    @Override
    public Timestamp component6() {
        return getCreatedTimestamp();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getPublicId();
    }

    @Override
    public String value3() {
        return getBody();
    }

    @Override
    public String value4() {
        return getFailure();
    }

    @Override
    public String value5() {
        return getBodyType();
    }

    @Override
    public Timestamp value6() {
        return getCreatedTimestamp();
    }

    @Override
    public ProcessingFailureRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public ProcessingFailureRecord value2(String value) {
        setPublicId(value);
        return this;
    }

    @Override
    public ProcessingFailureRecord value3(String value) {
        setBody(value);
        return this;
    }

    @Override
    public ProcessingFailureRecord value4(String value) {
        setFailure(value);
        return this;
    }

    @Override
    public ProcessingFailureRecord value5(String value) {
        setBodyType(value);
        return this;
    }

    @Override
    public ProcessingFailureRecord value6(Timestamp value) {
        setCreatedTimestamp(value);
        return this;
    }

    @Override
    public ProcessingFailureRecord values(Long value1, String value2, String value3, String value4, String value5, Timestamp value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProcessingFailureRecord
     */
    public ProcessingFailureRecord() {
        super(ProcessingFailure.PROCESSING_FAILURE);
    }

    /**
     * Create a detached, initialised ProcessingFailureRecord
     */
    public ProcessingFailureRecord(Long id, String publicId, String body, String failure, String bodyType, Timestamp createdTimestamp) {
        super(ProcessingFailure.PROCESSING_FAILURE);

        set(0, id);
        set(1, publicId);
        set(2, body);
        set(3, failure);
        set(4, bodyType);
        set(5, createdTimestamp);
    }
}
