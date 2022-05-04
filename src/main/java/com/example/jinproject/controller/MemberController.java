package com.example.jinproject.controller;

import com.example.jinproject.dto.MemberForm;
import com.example.jinproject.entity.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.jinproject.repository.MemberRepository;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import java.util.List;
@Slf4j
@Controller
public class MemberController {

    @Autowired
    private MemberRepository memberRepository;

    @GetMapping("/members/new")
    public String newMemberForm(){ return "articles/new";}

    @PostMapping("articles/create")
    public String createMember(MemberForm form){
        log.info(form.toString());

    }
}
