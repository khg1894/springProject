package com.example.my.module.member.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.my.module.member.entity.MemberEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

public class MemberDTO {
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ReqJoin {
        private String name;
        private Integer gender;
        private String mail;
        private String grade;
        private String phone;
        private Integer mileage;
        // private String authority;

        @NotBlank(message = "아이디를 입력해주세요.")
        @Size(min = 3, message = "아이디는 3자 이상 입력해 주세요.")
        private String id;

        @NotBlank(message = "비밀번호를 입력해주세요.")
        @Size(min = 3, message = "비밀번호는 3자 이상 입력해주세요.")
        private String pw;

        public MemberEntity toEntity(PasswordEncoder passwordEncoder) {
            return MemberEntity.builder()
                    .id(id)
                    .pw(passwordEncoder.encode(pw))
                    .name(name)
                    .gender(gender)
                    .phone(phone)
                    .mileage(mileage)
                    .authority("user")
                    .regDate(LocalDateTime.now())
                    .build();
        }
    }
}
