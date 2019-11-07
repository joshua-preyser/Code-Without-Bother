package com.josh.services.users.impl;
import com.josh.services.users.AccountService;
import com.josh.repository.users.impl.AccountRepositoryImpl;
import com.josh.repository.users.AccountRepository;

public class AccountServiceImpl implements AccountService {

    private static AccountServiceImpl service = null;
    private AccountRepository repository;

    private AccountServiceImpl() {
        this.repository = AccountRepositoryImpl.getRepository();
    }

    public static AccountServiceImpl getService(){
        if (service == null) service = new AccountServiceImpl();
        return service;
    }

    @Override
    public Account create(Account account) {
        return this.repository.create(account);
    }

    @Override
    public Account update(Account account) {
        return this.repository.update(account);
    }

    @Override
    public void delete(String siteId) {
        this.repository.delete(siteId);
    }

    @Override
    public Account read(String siteId) {
        return this.repository.read(siteId);
    }

    @Override
    public Set<Account> getAll() {
        return this.repository.getAll();
    }
}