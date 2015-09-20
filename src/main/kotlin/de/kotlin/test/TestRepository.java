package de.kotlin.test;

import org.springframework.data.repository.Repository;

public interface TestRepository extends Repository<TestEntity, Long> {

    TestEntity findByName(String name);
}
