package com.kmjsite.backend.controller;


import com.kmjsite.backend.entity.Member;
import com.kmjsite.backend.repository.MemberRepository;
import com.kmjsite.backend.service.JwtService;
import com.kmjsite.backend.service.JwtServiceImpl;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
public class AccountController {

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    JwtService jwtService;

    //    /api/account/login 이 주소로 Post로 데이터를 요청 받는데 인자값을 params라는 이름으로 받고 거기에 email과 password를
    //    findByEmailAndPassword()에 인자로 넘겨 주고 결과값을 Member 타입의 member로 받아 id를 return
    @PostMapping("/api/account/login")
    public ResponseEntity login(@RequestBody Map<String, String> params,
                                HttpServletResponse res) {
        Member member = memberRepository.findByEmailAndPassword(params.get("email"), params.get("password"));
//클라이언트에 준 다음에 클라이언트에서 세션스토리지나 쿠키에 저장 할 수도 있지만 보안상 서버사이드에서 하는것이 안전
//        쿠키값을 저장한다.

// 1. 로그인 요청이 왔을 때 member 값이 null이 아니면
        if (member != null) {
            int id = member.getId();
// 2. ID값을 Token화 해서
            String token = jwtService.getToken("id", id);

// 3. Token을 cookie에 넣음
            Cookie cookie = new Cookie("token", token);
            // 자바스크립트로 접근을 불허 옵션
            cookie.setHttpOnly(true);
            cookie.setPath("/");

            res.addCookie(cookie);
// 4. cookie에 넣은 응답 값(id)을 준다.
            return new ResponseEntity<>(id, HttpStatus.OK);

        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

//    사용자의 쿠키값을 받는다.
    @GetMapping("/api/account/check")
    public ResponseEntity check(@CookieValue(value = "token", required = false) String token) {
        Claims claims = jwtService.getClaims(token);

        if (claims != null) {
            int id = Integer.parseInt(claims.get("id").toString());
            return new ResponseEntity<>(id, HttpStatus.OK);
        }
        return new ResponseEntity<>(null, HttpStatus.OK);

    }
}
