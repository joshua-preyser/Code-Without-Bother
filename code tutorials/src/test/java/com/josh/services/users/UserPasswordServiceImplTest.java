package com.josh.services.users;
import org.junit.Assert;
import org.junit.Test;
import java.util.Set;
import com.josh.domain.users.UserPassword;
import com.josh.factory.users.UserPasswordFactory;
import com.josh.repository.users.impl.UserPasswordRepositoryImpl;
import com.josh.service.users.impl.UserPasswordServiceImpl;
import org.junit.Before;

public class UserPasswordServiceImplTest {

    private UserPasswordServiceImpl repository;
    private UserPassword userPassword;

    private UserPassword getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = UserPasswordRepositoryImpl.getRepository();
        this.userPassword = UserPasswordFactory.buildUserPassword("214167437");
    }

    @Test
    public void a_create() {
        UserPassword created = this.repository.create(this.userPassword);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.userPassword);
    }

    @Test
    public void c_update() {
        String newPassword = "newTestPassword";
        UserPassword updated = new userPassword.Builder().copy(getSaved()).Password(newPassword).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newPassword, updated.getPassword());
    }

    @Test
    public void e_delete() {
        UserPassword saved = getSaved();
        this.repository.delete(saved.getUserId());
        d_getAll();
    }

    @Test
    public void b_read() {
        UserPassword saved = getSaved();
        UserPassword read = this.repository.read(saved.getUserId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<UserPassword> passwords = this.repository.getAll();
        System.out.println("In getAll, all = " + passwords);
    }
}
