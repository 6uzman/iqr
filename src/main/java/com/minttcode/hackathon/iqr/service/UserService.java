package com.minttcode.hackathon.iqr.service;

import com.google.gson.Gson;
import com.minttcode.hackathon.iqr.model.Device;
import com.minttcode.hackathon.iqr.model.User;
import com.minttcode.hackathon.iqr.model.repos.UsersRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserService {
    @Autowired
    private UsersRepository usersRepository;

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    // create user
    public User createUser(User user) {

        Gson gson = new Gson();
        logger.info("JSON:"  +  gson.toJson(user));
        return usersRepository.save(user);
    }


    // get user
    public User getUserById(String id) {
        Optional<User> userOptional = null;
        if (id == null){
            return null;
        }

        Gson gson = new Gson();
        logger.info("JSON:"  +  gson.toJson(id));

        userOptional = usersRepository.findById(id);
        return userOptional.get();
    }


    // get user
    public User getUserByTelefono(String telefono) {
        User userOptional = null;
        if (telefono == null || telefono.isEmpty()){
            return null;
        }

        Gson gson = new Gson();
        logger.info("JSON:"  +  gson.toJson(telefono));

        userOptional = usersRepository.findByTelefono(telefono);
        userOptional.setPwd("");
        return userOptional;
    }


    // find user by id
    // find user by phone
    // find user by account number

}


/*
@Component
public class UserService implements UserDetailsService {
    @Autowired
    private UsersRepository usersRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (username == null){
            throw new RuntimeException("Not user defined");
        }

        User userToFind = usersRepository.findByUsername(username);

        List<SimpleGrantedAuthority> authorities = Arrays.asList(new SimpleGrantedAuthority(userToFind.getRole()));

        return new User(userToFind.getUsername(), userToFind.getPwd(), authorities);
    }

    // create user
    public boolean createUsers (User users) {
        if (users == null){
            return false;
        }

        usersRepository.save(users);
        return true;
    }


    // find user by i
    // find user by phone
    // find user by account number

} */