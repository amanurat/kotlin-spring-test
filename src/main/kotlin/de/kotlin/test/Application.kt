package de.kotlin.test

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

ComponentScan
EnableAutoConfiguration
public class Application

public fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}