package com.ngsky.microservice.simple.provider.controller;

import com.ngsky.microservice.simple.provider.bean.User;
import com.ngsky.microservice.simple.provider.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * <dl>
 * <dt>UserController</dt>
 * <dd>Description:</dd>
 * <dd>CreateDate: 11/11/2018 10:00 AM</dd>
 * </dl>
 *
 * @author daxiong
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable(name = "id") Long id){
        User user = userRepository.findOne(id);
        return user;
    }
}
