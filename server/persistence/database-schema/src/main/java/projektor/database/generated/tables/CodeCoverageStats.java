/*
 * This file is generated by jOOQ.
 */
package projektor.database.generated.tables;


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
import projektor.database.generated.tables.records.CodeCoverageStatsRecord;


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
public class CodeCoverageStats extends TableImpl<CodeCoverageStatsRecord> {

    private static final long serialVersionUID = -1111160101;

    /**
     * The reference instance of <code>public.code_coverage_stats</code>
     */
    public static final CodeCoverageStats CODE_COVERAGE_STATS = new CodeCoverageStats();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CodeCoverageStatsRecord> getRecordType() {
        return CodeCoverageStatsRecord.class;
    }

    /**
     * The column <code>public.code_coverage_stats.id</code>.
     */
    public final TableField<CodeCoverageStatsRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('code_coverage_stats_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.code_coverage_stats.code_coverage_run_id</code>.
     */
    public final TableField<CodeCoverageStatsRecord, Long> CODE_COVERAGE_RUN_ID = createField(DSL.name("code_coverage_run_id"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.code_coverage_stats.scope</code>.
     */
    public final TableField<CodeCoverageStatsRecord, String> SCOPE = createField(DSL.name("scope"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.code_coverage_stats.statement_covered</code>.
     */
    public final TableField<CodeCoverageStatsRecord, Integer> STATEMENT_COVERED = createField(DSL.name("statement_covered"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.code_coverage_stats.statement_missed</code>.
     */
    public final TableField<CodeCoverageStatsRecord, Integer> STATEMENT_MISSED = createField(DSL.name("statement_missed"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.code_coverage_stats.line_covered</code>.
     */
    public final TableField<CodeCoverageStatsRecord, Integer> LINE_COVERED = createField(DSL.name("line_covered"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.code_coverage_stats.line_missed</code>.
     */
    public final TableField<CodeCoverageStatsRecord, Integer> LINE_MISSED = createField(DSL.name("line_missed"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.code_coverage_stats.branch_covered</code>.
     */
    public final TableField<CodeCoverageStatsRecord, Integer> BRANCH_COVERED = createField(DSL.name("branch_covered"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.code_coverage_stats.branch_missed</code>.
     */
    public final TableField<CodeCoverageStatsRecord, Integer> BRANCH_MISSED = createField(DSL.name("branch_missed"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>public.code_coverage_stats</code> table reference
     */
    public CodeCoverageStats() {
        this(DSL.name("code_coverage_stats"), null);
    }

    /**
     * Create an aliased <code>public.code_coverage_stats</code> table reference
     */
    public CodeCoverageStats(String alias) {
        this(DSL.name(alias), CODE_COVERAGE_STATS);
    }

    /**
     * Create an aliased <code>public.code_coverage_stats</code> table reference
     */
    public CodeCoverageStats(Name alias) {
        this(alias, CODE_COVERAGE_STATS);
    }

    private CodeCoverageStats(Name alias, Table<CodeCoverageStatsRecord> aliased) {
        this(alias, aliased, null);
    }

    private CodeCoverageStats(Name alias, Table<CodeCoverageStatsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> CodeCoverageStats(Table<O> child, ForeignKey<O, CodeCoverageStatsRecord> key) {
        super(child, key, CODE_COVERAGE_STATS);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.CODE_COVERAGE_STATS_CODE_COVERAGE_RUN_ID_IDX);
    }

    @Override
    public Identity<CodeCoverageStatsRecord, Long> getIdentity() {
        return Keys.IDENTITY_CODE_COVERAGE_STATS;
    }

    @Override
    public UniqueKey<CodeCoverageStatsRecord> getPrimaryKey() {
        return Keys.CODE_COVERAGE_STATS_PKEY;
    }

    @Override
    public List<UniqueKey<CodeCoverageStatsRecord>> getKeys() {
        return Arrays.<UniqueKey<CodeCoverageStatsRecord>>asList(Keys.CODE_COVERAGE_STATS_PKEY);
    }

    @Override
    public List<ForeignKey<CodeCoverageStatsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CodeCoverageStatsRecord, ?>>asList(Keys.CODE_COVERAGE_STATS__CODE_COVERAGE_STATS_CODE_COVERAGE_RUN_ID_FKEY);
    }

    public CodeCoverageRun codeCoverageRun() {
        return new CodeCoverageRun(this, Keys.CODE_COVERAGE_STATS__CODE_COVERAGE_STATS_CODE_COVERAGE_RUN_ID_FKEY);
    }

    @Override
    public CodeCoverageStats as(String alias) {
        return new CodeCoverageStats(DSL.name(alias), this);
    }

    @Override
    public CodeCoverageStats as(Name alias) {
        return new CodeCoverageStats(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CodeCoverageStats rename(String name) {
        return new CodeCoverageStats(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CodeCoverageStats rename(Name name) {
        return new CodeCoverageStats(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, Long, String, Integer, Integer, Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}