package com.example.my.config.security;

import org.springframework.context.annotation.Primary;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.my.module.member.entity.MemberEntity;
import com.example.my.module.member.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

// UserDetailsService가 기존에 있음
// 시큐리티 디펜던시 추가했을 때 로그인 됐었음 user라는 아이디로.
// Service라고 붙이면 UserDetailsService 중에서 하나만 뜬다
// Bean또는 Component는 interface 기준으로 하나만 떠야 된다.
@Service
@Primary // Primary를 붙이면 중복되는 Component 중에서 1순위로 IOC컨테이너에 등록된다.
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    // DI 방법
    // 1. @Autowired
    // 2. setter
    // 3. 생성자 -> 우리는 3번방식을 사용해서 DI
    private final MemberRepository memberRepository;

    // 로그인 단계
    @Override
    public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
        // username으로 DB에 해당 UserEntity가 있는지 확인
        // UserEntity가 null이면 아이디를 잘 못 친 것이니 에러를 터트린다.
        // UserEntity가 null이 아니면
        // UserEntity와 UserRoleEntity로 UserDetails를 만들어서 리턴한다.

        MemberEntity memberEntity = memberRepository.getMember(id);

        if (memberEntity == null) {
            throw new UsernameNotFoundException("아이디를 정확히 입력해주세요.");
        }


        // 권한이 모두 삭제 되었을 경우
        // if(userRoleEntityList.size() < 1){
        //     throw new AuthenticationCredentialsNotFoundException("권한이 없습니다.");
        // }

        return new CustomUserDetails(memberEntity);
    }
    
}
