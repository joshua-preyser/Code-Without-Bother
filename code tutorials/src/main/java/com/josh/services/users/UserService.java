package com.josh.services.users;

public interface UserService extends IService<User, String> {
    Set<User> getAll();
}
