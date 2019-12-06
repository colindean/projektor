package projektor

import com.zaxxer.hikari.HikariDataSource
import org.jooq.DSLContext
import org.koin.dsl.module
import projektor.incomingresults.TestResultsService
import projektor.incomingresults.processing.ResultsProcessingDatabaseRepository
import projektor.incomingresults.processing.ResultsProcessingRepository
import projektor.parser.TestResultsParser
import projektor.testcase.TestCaseDatabaseRepository
import projektor.testcase.TestCaseRepository
import projektor.testcase.TestCaseService
import projektor.testrun.TestRunDatabaseRepository
import projektor.testrun.TestRunRepository
import projektor.testrun.TestRunService
import projektor.testsuite.TestSuiteDatabaseRepository
import projektor.testsuite.TestSuiteRepository
import projektor.testsuite.TestSuiteService

fun createAppModule(dataSource: HikariDataSource, dslContext: DSLContext) = module {
    single { dataSource }
    single { TestResultsParser() }
    single { dslContext }
    single<TestCaseRepository> { TestCaseDatabaseRepository(get()) }
    single<TestSuiteRepository> { TestSuiteDatabaseRepository(get()) }
    single<TestRunRepository> { TestRunDatabaseRepository(get()) }
    single<ResultsProcessingRepository> { ResultsProcessingDatabaseRepository(get()) }
    single { TestCaseService(get()) }
    single { TestSuiteService(get()) }
    single { TestResultsService(get(), get(), get()) }
    single { TestRunService(get()) }
}
