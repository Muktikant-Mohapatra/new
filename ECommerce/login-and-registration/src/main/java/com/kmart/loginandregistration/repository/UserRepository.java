package com.kmart.loginandregistration.repository;

import com.kmart.loginandregistration.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,String> {
    boolean existsByEmail(String email);
}
