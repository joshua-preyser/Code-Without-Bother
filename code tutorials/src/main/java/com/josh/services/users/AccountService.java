package com.josh.services.users;

public interface AccountService extends IService<Account, String> {
    Set<Account> getAll();
}
