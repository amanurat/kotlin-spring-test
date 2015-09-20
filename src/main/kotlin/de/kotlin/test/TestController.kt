package de.kotlin.test

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
public class TestController @Autowired constructor(val testRepository: TestRepository) {

    @RequestMapping
    public fun test(@RequestParam("name") name: String): TestEntity {
        return testRepository.findByName(name);
    }
}