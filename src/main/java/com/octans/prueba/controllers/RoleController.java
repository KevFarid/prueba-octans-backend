package com.octans.prueba.controllers;

import java.util.ArrayList;

import com.octans.prueba.models.RoleModel;
import com.octans.prueba.services.RoleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/role")
public class RoleController {

    @Autowired
    RoleService roleService;

    @GetMapping()
    public ArrayList<RoleModel> getRoles(){
        return roleService.getUsers();
    }
}
