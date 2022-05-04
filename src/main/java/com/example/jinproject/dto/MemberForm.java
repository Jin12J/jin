package com.example.jinproject.dto;

import com.example.jinproject.entity.Member;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class MemberForm {

    private Long idx;
    private String basicaddr;
    private String detailaddr;
    private String email;
    private String nickname;
    private String pwd;
    private String tel;

    public Member toEntity(){

        return new Member(idx, basicaddr, detailaddr, email, nickname, pwd, tel);
    }
}
