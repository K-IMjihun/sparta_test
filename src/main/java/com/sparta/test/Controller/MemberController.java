package com.sparta.test.Controller;

import com.sparta.test.Dto.MemberResponseDto;
import com.sparta.test.Service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {
    private final MemberService memberService;

    @GetMapping("{id}")
    public MemberResponseDto getMemberInfo(@PathVariable Long id){
        return memberService.findMember(id);
    }

    @GetMapping
    public List<MemberResponseDto> findAllMember(){
        return memberService.findAllMember();
    }







    }
