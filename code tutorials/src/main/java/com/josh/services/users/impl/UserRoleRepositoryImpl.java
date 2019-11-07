package com.josh.services.users.impl;
import com.josh.services.users.UserRoleService;
import com.josh.repository.users.impl.UserRoleRepositoryImpl;
import com.josh.repository.users.UserRoleRepository;

public class UserRoleServiceImpl implements UserRoleService {

    private static UserRoleServiceImpl service = null;
    private UserRoleRepository repository;

    private UserRoleServiceImpl() {
        this.repository = UserRoleRepositoryImpl.getRepository();
    }

    public static UserRoleServiceImpl getService(){
        if (service == null) service = new UserRoleServiceImpl();
        return service;
    }

    @Override
    public UserRole create(UserRole userRole) {
        return this.repository.create(userRole);
    }

    @Override
    public UserRole update(UserRole userRole) {
        return this.repository.update(userRole);
    }

    @Override
    public void delete(String UserId) {
        this.repository.delete(UserId);
    }

    @Override
    public UserRole read(String UserId) {
        return this.repository.read(UserId);
    }

    @Override
    public Set<UserRole> getAll() {
        return this.repository.getAll();
    }
}