package com.login.fashionhub.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login.fashionhub.registration.bo.UserDetailsBO;

public interface UserRepositoryRepo extends JpaRepository<UserDetailsBO, String> {

}
