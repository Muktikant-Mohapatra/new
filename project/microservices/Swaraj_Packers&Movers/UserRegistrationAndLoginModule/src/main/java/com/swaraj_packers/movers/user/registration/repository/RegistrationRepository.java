package com.swaraj_packers.movers.user.registration.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.swaraj_packers.movers.user.registration.entity.RegistrationEntity;
@Repository
public interface RegistrationRepository extends PagingAndSortingRepository<RegistrationEntity, String>{

}
