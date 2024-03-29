package com.wildmouse.springbootexample.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class HelloWorldController {
    @GetMapping
    fun helloWorld(): String = "Hello World"
}