package com.test.emplassetmngmnt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.emplassetmngmnt.beans.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}
