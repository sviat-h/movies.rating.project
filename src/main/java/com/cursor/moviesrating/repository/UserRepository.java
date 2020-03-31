package com.cursor.moviesrating.repository;

import com.cursor.moviesrating.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    User findUserByUsername(String username);
}
