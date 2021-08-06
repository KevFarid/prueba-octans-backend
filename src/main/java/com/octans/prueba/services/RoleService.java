package com.octans.prueba.services;

import java.util.ArrayList;

import com.octans.prueba.models.RoleModel;
import com.octans.prueba.repositories.RoleRespository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Autowired
    RoleRespository roleRespository;

    public ArrayList<RoleModel> getUsers(){
        return (ArrayList<RoleModel>) roleRespository.findAll();
    }
}
