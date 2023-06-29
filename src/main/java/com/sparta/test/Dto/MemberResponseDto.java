package com.sparta.test.Dto;

import com.sparta.test.Entity.Member;
import lombok.Data;

@Data
public class MemberResponseDto {
    private Long id;
    private String name;
    private String email;
    private String pw;
    public MemberResponseDto(Member member) {
        this.id = member.getId();
        this.name = member.getName();
        this.email = member.getEmail();
        this.pw = member.getPw();
    }
}
