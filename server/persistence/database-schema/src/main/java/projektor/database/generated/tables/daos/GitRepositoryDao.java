/*
 * This file is generated by jOOQ.
 */
package projektor.database.generated.tables.daos;


import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import projektor.database.generated.tables.GitRepository;
import projektor.database.generated.tables.records.GitRepositoryRecord;


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
public class GitRepositoryDao extends DAOImpl<GitRepositoryRecord, projektor.database.generated.tables.pojos.GitRepository, String> {

    /**
     * Create a new GitRepositoryDao without any configuration
     */
    public GitRepositoryDao() {
        super(GitRepository.GIT_REPOSITORY, projektor.database.generated.tables.pojos.GitRepository.class);
    }

    /**
     * Create a new GitRepositoryDao with an attached configuration
     */
    public GitRepositoryDao(Configuration configuration) {
        super(GitRepository.GIT_REPOSITORY, projektor.database.generated.tables.pojos.GitRepository.class, configuration);
    }

    @Override
    public String getId(projektor.database.generated.tables.pojos.GitRepository object) {
        return object.getRepoName();
    }

    /**
     * Fetch records that have <code>repo_name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.GitRepository> fetchRangeOfRepoName(String lowerInclusive, String upperInclusive) {
        return fetchRange(GitRepository.GIT_REPOSITORY.REPO_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>repo_name IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.GitRepository> fetchByRepoName(String... values) {
        return fetch(GitRepository.GIT_REPOSITORY.REPO_NAME, values);
    }

    /**
     * Fetch a unique record that has <code>repo_name = value</code>
     */
    public projektor.database.generated.tables.pojos.GitRepository fetchOneByRepoName(String value) {
        return fetchOne(GitRepository.GIT_REPOSITORY.REPO_NAME, value);
    }

    /**
     * Fetch records that have <code>org_name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<projektor.database.generated.tables.pojos.GitRepository> fetchRangeOfOrgName(String lowerInclusive, String upperInclusive) {
        return fetchRange(GitRepository.GIT_REPOSITORY.ORG_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>org_name IN (values)</code>
     */
    public List<projektor.database.generated.tables.pojos.GitRepository> fetchByOrgName(String... values) {
        return fetch(GitRepository.GIT_REPOSITORY.ORG_NAME, values);
    }
}