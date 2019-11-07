package com.josh.services.users.impl;
import com.josh.services.users.UserStatusService;
import com.josh.repository.users.impl.userStatusRepositoryImpl;
import com.josh.repository.users.UserStatusRepository;

public class UserStatusServiceImpl implements UserStatusService {

    private static UserStatusServiceImpl service = null;
    private UserStatusRepository repository;

    private UserStatusServiceImpl() {
        this.repository = UserStatusRepositoryImpl.getRepository();
    }

    public static UserStatusServiceImpl getService(){
        if (service == null) service = new UserStatusServiceImpl();
        return service;
    }

    @Override
    public UserStatus create(UserStatus userStatus) {
        return this.repository.create(userStatus);
    }

    @Override
    public UserStatus update(UserStatus userStatus) {
        return this.repository.update(userStatus);
    }

    @Override
    public void delete(String UserId) {
        this.repository.delete(UserId);
    }

    @Override
    public UserStatus read(String UserId) {
        return this.repository.read(UserId);
    }

    @Override
    public Set<UserStatus> getAll() {
        return this.repository.getAll();
    }
}