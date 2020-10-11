package com.swarajpackersmovers.user.registration.repository;

import com.swarajpackersmovers.user.registration.entity.MasterUserEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository<T extends MasterUserEntity> extends PagingAndSortingRepository<T,String> {
}
