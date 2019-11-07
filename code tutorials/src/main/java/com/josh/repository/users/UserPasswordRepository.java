package com.josh.repository.users;

public interface UserPasswordRepository extends IRepository<UserPassword, String> {
    Set<UserPassword> getAll();
}
