package com.josh.repository.users.impl;
import com.josh.repository.users.UserRoleRepository

public class UserRoleRepositoryImpl implements UserRoleRepository {

    private static UserRoleRepositoryImpl repository = null;
    private Set<UserRole> userRole;

    private UserRoleRepositoryImpl(){
        this.role = new HashSet<>();
    }

    private UserRole findUserRole(String UserId) {
        return this.role.stream()
                .filter(userRole -> userRole.getUserId().trim().equals(UserId))
                .findAny()
                .orElse(null);
    }

    public static UserRoleRepositoryImpl getRepository(){
        if (repository == null) repository = new UserRoleRepositoryImpl();
        return repository;
    }


    public UserRole create(UserRole userRole){
        this.role.add(userRole);
        return userRole;
    }

    public UserRole read(final String UserId){
        UserRole userRole = findUserRole(UserId);
        return userRole;
    }

    public void delete(String UserId) {
        UserRole userRole = findUserRole(UserId);
        if (userRole != null) this.role.remove(userRole);
    }

    public UserRole update(User userRole){
        UserRole toDelete = findUserRole(userRole.getUserId());
        if(toDelete != null) {
            this.role.remove(toDelete);
            return create(userRole);
        }
        return null;
    }


    public Set<UserRole> getAll(){
        return this.role;
    }
}
