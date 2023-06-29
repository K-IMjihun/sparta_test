package com.sparta.test.Service;


import com.sparta.test.Dto.MemberResponseDto;
import com.sparta.test.Entity.Member;
import com.sparta.test.Repository.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    private final MemberRepository memberRepository;
    public MemberService(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }



    public MemberResponseDto findMember(Long id) {
        Member member = memberCheck(id);
        MemberResponseDto memberResponseDto = new MemberResponseDto(member);
        return memberResponseDto;
    }

    public List<MemberResponseDto> findAllMember(){
        return memberRepository.findAllByOrderByIdAsc().stream().map(MemberResponseDto::new).toList();
    }

    private Member memberCheck(Long id) {
        return memberRepository.findById(id).orElseThrow(() ->
                new NullPointerException("회원 상세 조회 실패")
        );
    }

}
