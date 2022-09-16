package com.gittest.testgit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hi 俊翔
 * 現在是上午 10:16 2022/9/16 2022
 * 好好加油吧。
 * 不能再浪費時間了
 * 規劃自己，超越自己
 */
@RestController
@RequestMapping("/")
public class TestgitController {

    @RequestMapping("/")
    public String test(){
        System.out.println("testgit_2");
        return "testgit_2";
    }
}
