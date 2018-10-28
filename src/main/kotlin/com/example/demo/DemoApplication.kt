package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class DemoApplication {

    @GetMapping("/resource")
    fun resource(): Map<String, Any> {
        return hashMapOf(
                Pair("name", "Tony"),
                Pair("age", 30)
        )
    }
}

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}
