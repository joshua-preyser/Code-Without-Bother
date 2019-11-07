package com.josh.services.users;

public interface UserPasswordService extends IService<UserPassword, String> {
    Set<UserPassword> getAll();
}
