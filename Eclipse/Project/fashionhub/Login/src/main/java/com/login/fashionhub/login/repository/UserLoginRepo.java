package com.login.fashionhub.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login.fashionhub.login.bo.LoginCredentialsBo;

public interface UserLoginRepo extends JpaRepository<LoginCredentialsBo, String> {
	LoginCredentialsBo findByEmail(String email);
}
