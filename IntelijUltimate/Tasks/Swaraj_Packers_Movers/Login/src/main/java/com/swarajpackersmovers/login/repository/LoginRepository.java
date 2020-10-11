package com.swarajpackersmovers.login.repository;


import com.swarajpackersmovers.login.entity.LoginEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends PagingAndSortingRepository<LoginEntity,String> {

    LoginEntity findByEmail(String username);

}
