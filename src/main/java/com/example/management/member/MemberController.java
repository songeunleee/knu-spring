package com.example.management.member;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/latest")
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    //생성

    @PostMapping("/test")
    public ResponseEntity<String> create(@RequestBody Member member){

        memberService.join(member);
        return ResponseEntity.ok ( "CREATED");
    }
    //조회
    @GetMapping("test/{id}")
    public ResponseEntity<String> read(@PathVariable Long id) {

        memberService.findByMember(id);
        return ResponseEntity.ok("Hello world KNU");
    }
    //수정
    @PutMapping("test/{id}")

    public ResponseEntity<String> update(@PathVariable Long id,@RequestBody Member member){

        memberService.updateByMember(id,member);

        return ResponseEntity.ok("UPDATED");
    }
    //삭제
    @DeleteMapping("test/{id}")

    public ResponseEntity<String> delete(@PathVariable Long id){

        memberService.deleteByMember(id);
        return ResponseEntity.ok("DELETED");
    }
}
