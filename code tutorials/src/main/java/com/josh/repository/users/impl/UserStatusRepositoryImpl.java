package com.josh.repository.users.impl;
import com.josh.repository.users.UserStatusRepository;

public class UserStatusRepositoryImpl implements UserStatusRepository {

    private static UserStatusRepositoryImpl repository = null;
    private Set<UserStatus> userStatus;

    private UserStatusRepositoryImpl(){
        this.status = new HashSet<>();
    }

    private UserStatus findUserStatus(String UserId) {
        return this.status.stream()
                .filter(userStatus -> userStatus.getUserId().trim().equals(UserId))
                .findAny()
                .orElse(null);
    }

    public static UserStatusRepositoryImpl getRepository(){
        if (repository == null) repository = new UserStatusRepositoryImpl();
        return repository;
    }


    public UserStatus create(UserStatus userStatus){
        this.status.add(userStatus);
        return userStatus;
    }

    public UserStatus read(final String UserId){
        UserStatus userStatus = findUserStatus(UserId);
        return userStatus;
    }

    public void delete(String UserId) {
        UserStatus userStatus = findUserStatus(UserId);
        if (userStatus != null) this.status.remove(userStatus);
    }

    public UserStatus update(UserStatus userStatus){
        UserStatus toDelete = findUserStatus(userStatus.getUserId());
        if(toDelete != null) {
            this.status.remove(toDelete);
            return create(userStatus);
        }
        return null;
    }


    public Set<UserStatus> getAll(){
        return this.status;
    }
}
