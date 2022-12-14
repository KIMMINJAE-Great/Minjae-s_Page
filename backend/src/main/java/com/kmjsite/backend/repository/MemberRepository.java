package com.kmjsite.backend.repository;

import com.kmjsite.backend.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Integer> {
    Member findByEmailAndPassword(String email, String password);
}
