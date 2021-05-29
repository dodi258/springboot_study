package com.dodi258.study.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("posts/save")
    public String postsSave() {
        return "posts-save";
    }
}

/*
머스테치 덕분에 컨트롤러에서 문자열을 반환할 때 앞의 경로와 뒤의 파일 확장자는 자동으로 지정됩니다.
앞의 경로는 src/main/resources/templates 로 뒤의 파일 확장자는 .mustache가 붙습니다.

 */