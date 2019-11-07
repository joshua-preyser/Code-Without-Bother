package com.josh.services.users;

public interface UserStatusService extends IService<UserStatus, String> {
    Set<UserService> getAll();
}
