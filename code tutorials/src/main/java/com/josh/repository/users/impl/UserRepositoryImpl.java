package com.josh.repository.users.impl;
import com.josh.repository.users.UserRepository

public class UserRepositoryImpl implements UserRepository {

    private static UserRepositoryImpl repository = null;
    private Set<User> user;

    private UserRepositoryImpl(){
        this.client = new HashSet<>();
    }

    private User findUser(String SiteId) {
        return this.client.stream()
                .filter(user -> user.getSiteId().trim().equals(SiteId))
                .findAny()
                .orElse(null);
    }

    public static UserRepositoryImpl getRepository(){
        if (repository == null) repository = new UserRepositoryImpl();
        return repository;
    }


    public User create(User user){
        this.client.add(user);
        return user;
    }

    public Account read(final String SiteId){
        User user = findUser(SiteId);
        return user;
    }

    public void delete(String SiteId) {
        User user = findUser(SiteId);
        if (user != null) this.client.remove(user);
    }

    public User update(User user){
        User toDelete = findUser(user.getSiteId());
        if(toDelete != null) {
            this.client.remove(toDelete);
            return create(user);
        }
        return null;
    }


    public Set<User> getAll(){
        return this.client;
    }
}
