package com.smhrd.member.controller;

import com.smhrd.member.dto.Member;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {

    @GetMapping("/goMain")
    public String mainPage() {
        return "main";
    }

    @PostMapping("/join")
    public String join(Member member) {

        System.out.println(member);

        return "main";
    }

}
