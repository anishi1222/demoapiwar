package io.logicojp.spring.demoapiwar

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController {
    @GetMapping("/greeting")
    fun greeting(@RequestParam("name") name: String ) = "Hello, $name!"
}