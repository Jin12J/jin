package com.example.jinproject.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;
    @Column
    private String basicaddr;
    @Column
    private String ditailaddr;
    @Column
    private String email;
    @Column
    private String nickname;
    @Column
    private String pwd;
    @Column
    private String tel;
}
