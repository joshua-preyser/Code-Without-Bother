package com.josh.repository.users;

public interface AccountRepository extends IRepository<Account, String> {
    Set<Account> getAll();
}
