package com.kmart.loginandregistration.repository;

import com.kmart.loginandregistration.entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<AddressEntity,String> {
}
