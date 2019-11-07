package com.josh.repository.users;

public interface UserRepository extends IRepository<User, String> {
    Set<User> getAll();
}
