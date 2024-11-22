package com.Api.TesteRes.repository;

import com.Api.TesteRes.model.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<UserEntity, String> {
    // Métodos de CRUD já estão disponíveis
}