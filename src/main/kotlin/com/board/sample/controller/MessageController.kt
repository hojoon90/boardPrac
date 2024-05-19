package com.board.sample.controller

import com.board.sample.domain.Message
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageController {

    @GetMapping("/")
    fun getTest(@RequestParam("name") name: String) = "Hello! ${name}!"

    @GetMapping("/list")
    fun getList() = listOf(
        Message("1", "aaa"),
        Message("2", "bbbb"),
        Message("3", "ccccc"),
    )

}