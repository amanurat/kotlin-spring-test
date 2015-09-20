package de.kotlin.test

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

data public class Test(val name: String)

RestController
public class TestController {

    RequestMapping
    public fun test(RequestParam("name") name: String): Test {
        return Test(name);
    }
}