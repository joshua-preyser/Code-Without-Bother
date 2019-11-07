package com.josh.repository.users.impl;
import com.josh.repository.users.AccountRepository;

public class AccountRepositoryImpl implements AccountRepository {

    private static AccountRepositoryImpl repository = null;
    private Set<Account> account;

    private AccountRepositoryImpl(){
        this.accounts = new HashSet<>();
    }

    private Account findAccount(String SiteId) {
        return this.accounts.stream()
                .filter(account -> account.getSiteId().trim().equals(SiteId))
                .findAny()
                .orElse(null);
    }

    public static AccountRepositoryImpl getRepository(){
        if (repository == null) repository = new AccountRepositoryImpl();
        return repository;
    }


    public Account create(Account account){
        this.accounts.add(account);
        return account;
    }

    public Account read(final String SiteId){
        Account account = findAccount(SiteId);
        return account;
    }

    public void delete(String SiteId) {
        Account account = findAccount(SiteId);
        if (account != null) this.accounts.remove(account);
    }

    public Account update(Account account){
        Account toDelete = findAccount(account.getSiteId());
        if(toDelete != null) {
            this.accounts.remove(toDelete);
            return create(account);
        }
        return null;
    }


    public Set<Account> getAll(){
        return this.accounts;
    }
}
