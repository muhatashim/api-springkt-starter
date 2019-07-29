package com.github.muhatashim.apispringktstarter

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Test {

    @GetMapping
    fun test(): Map<String, String> {
        return mapOf("Hello" to "World")
    }
}
