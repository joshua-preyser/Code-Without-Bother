package com.josh.repository.users;

public interface UserRoleRepository extends IRepository<UserRole, String> {
    Set<UserRole> getAll();
}
