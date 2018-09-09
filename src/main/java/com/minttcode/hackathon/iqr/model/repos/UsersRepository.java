package com.minttcode.hackathon.iqr.model.repos;

import com.minttcode.hackathon.iqr.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UsersRepository extends MongoRepository<User, String>  {
    //    public User findByFirstName(String firstName);
    public User findByTelefono(String telefono);

}
