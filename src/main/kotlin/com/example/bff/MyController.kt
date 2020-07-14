package com.example.bff

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class MyController(private val myService: MyService) {

    @GetMapping("/loginScreen")
    fun getScreenLogin() = myService.builderScreen()

    @GetMapping("primaryScreen")
    fun getScreenPrimary() = myService.builderScreenPrimary()
}