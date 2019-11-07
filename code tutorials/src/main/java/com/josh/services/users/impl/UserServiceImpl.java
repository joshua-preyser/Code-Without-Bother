package com.josh.service.users.impl;
import com.josh.services.users.UserService;
import com.josh.repository.users.impl.UserRepositoryImpl;
import com.josh.repository.users.userRepository;

public class UserServiceImpl implements UserService {

    private static UserServiceImpl service = null;
    private UserRepository repository;

    private UserServiceImpl() {
        this.repository = UserRepositoryImpl.getRepository();
    }

    public static UserServiceImpl getService(){
        if (service == null) service = new UserServiceImpl();
        return service;
    }

    @Override
    public User create(User user) {
        return this.repository.create(user);
    }

    @Override
    public User update(User user) {
        return this.repository.update(user);
    }

    @Override
    public void delete(String siteId) {
        this.repository.delete(siteId);
    }

    @Override
    public User read(String siteId) {
        return this.repository.read(siteId);
    }

    @Override
    public Set<User> getAll() {
        return this.repository.getAll();
    }
}