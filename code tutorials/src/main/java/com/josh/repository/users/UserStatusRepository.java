package com.josh.repository.users;

public interface UserStatusRepository extends IRepository<UserStatus, String> {
    Set<UserStatus> getAll();
}
