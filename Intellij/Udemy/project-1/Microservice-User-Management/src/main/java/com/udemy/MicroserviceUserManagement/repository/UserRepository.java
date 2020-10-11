package com.udemy.MicroserviceUserManagement.repository;

import com.udemy.MicroserviceUserManagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,String>  {

    Optional<User> findByUsername(String username);

    @Query("select name from User  where id in(:pIdList)")
    List<String> findAllByList(@Param("pIdList") List<String> idList);
}