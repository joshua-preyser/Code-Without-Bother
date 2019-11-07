package com.josh.services.users.impl;
import com.josh.services.users.UserPasswordService;
import com.josh.repository.users.impl.UserPasswordRepositoryImpl;
import com.josh.repository.UserPasswordRepository;

public class UserPasswordServiceImpl implements UserPasswordService {

    private static AccountServiceImpl service = null;
    private UserPasswordRepository repository;

    private UserPasswordServiceImpl() {
        this.repository = UserPasswordRepositoryImpl.getRepository();
    }

    public static UserPasswordServiceImpl getService(){
        if (service == null) service = new UserPasswordServiceImpl();
        return service;
    }

    @Override
    public UserPassword create(UserPassword userPassword) {
        return this.repository.create(userPassword);
    }

    @Override
    public UserPassword update(UserPassword userPassword) {
        return this.repository.update(userPassword);
    }

    @Override
    public void delete(String UserId) {
        this.repository.delete(UserId);
    }

    @Override
    public UserPassword read(String UserId) {
        return this.repository.read(UserId);
    }

    @Override
    public Set<UserPassword> getAll() {
        return this.repository.getAll();
    }
}