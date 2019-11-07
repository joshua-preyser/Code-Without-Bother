package com.josh.repository.users.impl;
import com.josh.repository.users.UserPasswordRepository

public class UserPasswordRepositoryImpl implements UserPasswordRepository {

    private static UserPasswordRepositoryImpl repository = null;
    private Set<UserPassword> userPassword;

    private AccountRepositoryImpl(){
        this.password = new HashSet<>();
    }

    private UserPassword findUserPassword(String userId) {
        return this.password.stream()
                .filter(userPassword -> userPassword.getUserId().trim().equals(userId))
                .findAny()
                .orElse(null);
    }

    public static UserPasswordRepositoryImpl getRepository(){
        if (repository == null) repository = new UserPasswordRepositoryImpl();
        return repository;
    }


    public UserPassword create(UserPassword userPassword){
        this.password.add(userPassword);
        return userPassword;
    }

    public UserPassword read(final String UserId){
        UserPassword userPassword = findUserPassword(UserId);
        return UserPassword;
    }

    public void delete(String UserId) {
        UserPassword userPassword = findUserPassword(UserId);
        if (userPassword != null) this.password.remove(userPassword);
    }

    public UserPassword update(UserPassword userPassword){
        UserPassword toDelete = findUserPassword(userPassword.getUserId());
        if(toDelete != null) {
            this.password.remove(toDelete);
            return create(userPassword);
        }
        return null;
    }


    public Set<auserPassword> getAll(){
        return this.password;
    }
}
