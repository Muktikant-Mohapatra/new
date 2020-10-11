package com.annotation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.annotation.table.Address;

public interface AddressRepository extends JpaRepository<Address, String> {

}
