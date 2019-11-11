package com.josh.repository.users;
import org.junit.Assert;
import org.junit.Test;
import java.util.Set;
import com.josh.domain.users.Account;
import com.josh.factory.users.AccountFactory;
import com.josh.repository.users.impl.AccountRepositoryImpl;
import org.junit.Before;

public class AccountRepositoryImplTest {

    private AccountRepository repository;
    private Account account;

    private Account getSavedCourse() {
        Set<Account> savedAccount = this.repository.getAll();
        return savedAccounts.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository =AccountRepositoryImpl.getRepository();
        this.account = AccountFactory.buildAccount("Test Account");
    }

    @Test
    public void a_create() {
        Account created = this.repository.create(this.account);
        System.out.println("In create, created = " + created);
        d_getAll();
        Assert.assertSame(created, this.account);
    }

    @Test
    public void b_read() {
       Account savedAccount = getSavedAccount();
        System.out.println("In read, SiteId = "+ savedAccount.getSiteId());
        Account read = this.repository.read(savedAccount.getSiteId());
        System.out.println("In read, read = " + read);
        d_getAll();
        Assert.assertEquals(savedAccount, read);
    }

    @Test
    public void e_delete() {
        Account savedAccount = getSavedAccount();
        this.repository.delete(savedAccount.getSiteId());
        d_getAll();
    }

    @Test
    public void c_update() {
        String newname = "New Test Site Name";
        Account account = new Account.Builder().copy(getSavedAccount()).SiteName(newname).build();
        System.out.println("In update, about_to_updated = " + course);
        Account updated = this.repository.update(account);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newname, updated.getSiteName());
        d_getAll();
    }

    @Test
    public void d_getAll() {
        Set<Account> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }
}