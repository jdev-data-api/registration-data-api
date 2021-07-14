package com.jdev.register.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jdev.common.domain.register.dto.RegistrationDTO;

@Repository
public interface RegistrationRepository extends MongoRepository<RegistrationDTO, String> {

	public List<Object> findByUserName(String userName);

}
