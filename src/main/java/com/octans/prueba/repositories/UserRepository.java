package com.octans.prueba.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import com.octans.prueba.models.UserModel;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Long> {

}
