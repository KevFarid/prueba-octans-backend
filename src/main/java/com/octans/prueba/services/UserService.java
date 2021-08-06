package com.octans.prueba.services;


import com.octans.prueba.repositories.UserRepository;

import java.util.ArrayList;
import java.util.Optional;

import com.octans.prueba.models.UserModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public ArrayList<UserModel> getUsers(){
        return (ArrayList<UserModel>) userRepository.findAll();
    }

    public Optional<UserModel> getUserById(Long id_user){
        return userRepository.findById(id_user);
    }

    public UserModel saveUser(UserModel user){
        return userRepository.save(user);
    }

    public Boolean deleteUser(Long id_user){
        try {
            userRepository.deleteById(id_user);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
