package com.josh.repository.users;
import org.junit.Assert;
import org.junit.Test;
import java.util.Set;
import com.josh.domain.users.UserPassword;
import com.josh.factory.users.UserPasswordFactory;
import com.josh.repository.users.impl.UserPasswordRepositoryImpl;
import org.junit.Before;

public class UserPasswordRepositoryImplTest {

    private UserPasswordRepository repository;
    private UserPassword userPassword;

    private UserPassword getSavedCourse() {
        Set<UserPassword> savedPassword = this.repository.getAll();
        return savedPassword.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = UserPasswordRepositoryImpl.getRepository();
        this.userPassword = UserPasswordFactory.buildUserPassword("Test UserPassword");
    }

    @Test
    public void a_create() {
        UserPassword created = this.repository.create(this.userPassword);
        System.out.println("In create, created = " + created);
        d_getAll();
        Assert.assertSame(created, this.userPassword);
    }

    @Test
    public void b_read() {
       UserPassword savedUserPassword = getSavedUserPassword();
        System.out.println("In read, UserId = "+ savedUserPassword.getUserId());
        UserPassword read = this.repository.read(savedUserPassword.getUserId());
        System.out.println("In read, read = " + read);
        d_getAll();
        Assert.assertEquals(savedUserPassword, read);
    }

    @Test
    public void e_delete() {
        UserPassword savedUserPassword = getSavedUserPassword();
        this.repository.delete(savedUserPassword.getUserId());
        d_getAll();
    }

    @Test
    public void c_update() {
        String new password = "New Test User Password";
        UserPassword userPassword = new UserPassword.Builder().copy(getSavedUserPassword()).Password(newpassword).build();
        System.out.println("In update, about_to_updated = " + course);
        UserPassword updated = this.repository.update(userPassword);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newpassword, updated.getPassword());
        d_getAll();
    }

    @Test
    public void d_getAll() {
        Set<UserPassword> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }
}