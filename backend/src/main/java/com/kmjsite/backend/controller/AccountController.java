package com.kmjsite.backend.controller;


import com.kmjsite.backend.entity.Member;
import com.kmjsite.backend.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class AccountController {

    @Autowired
    MemberRepository memberRepository;

    //    /api/account/login 이 주소로 Post로 데이터를 요청 받는데 인자값을 params라는 이름으로 받고 거기에 email과 password를
    //    findByEmailAndPassword()에 인자로 넘겨 주고 결과값을 Member 타입의 member로 받아 id를 return
    @PostMapping("/api/account/login")
    public int login(@RequestBody Map<String, String> params) {
        Member member = memberRepository.findByEmailAndPassword(params.get("email"), params.get("password"));
        if (member != null) {
            return member.getId();
        }
        return 0;
    }

}
