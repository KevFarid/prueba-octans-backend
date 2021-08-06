package com.octans.prueba.repositories;
import org.springframework.data.repository.CrudRepository;
import com.octans.prueba.models.RoleModel;

public interface RoleRespository extends CrudRepository<RoleModel, Long> {

}
