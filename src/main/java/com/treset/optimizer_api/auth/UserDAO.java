package com.treset.optimizer_api.auth;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDAO extends CrudRepository<UserEntity, Integer> {
    public UserEntity findUserEntityByUname(String uname);
}