package com.josh.services.users;

public interface UserRoleService extends IService<UserRole, String> {
    Set<UserRole> getAll();
}
