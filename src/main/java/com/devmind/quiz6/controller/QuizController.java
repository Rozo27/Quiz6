package com.devmind.quiz6.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuizController {

    @GetMapping("add/first/{first}/second/{second}")
    @ResponseBody
    public Integer getSum(@PathVariable String first, @PathVariable String second){
        return Integer.valueOf(first) + Integer.valueOf(second);
    }
}
