package com.josh.repository.users;
import org.junit.Assert;
import org.junit.Test;
import java.util.Set;
import com.josh.domain.users.User;
import com.josh.factory.users.UserFactory;
import com.josh.repository.users.impl.UserRepositoryImpl;
import org.junit.Before;

public class UserRepositoryImplTest {

    private UserRepository repository;
    private User user;

    private User getSavedCourse() {
        Set<User> savedUsers = this.repository.getAll();
        return savedUsers.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository =UserRepositoryImpl.getRepository();
        this.user = UserFactory.buildUser("Test User");
    }

    @Test
    public void a_create() {
        User created = this.repository.create(this.user);
        System.out.println("In create, created = " + created);
        d_getAll();
        Assert.assertSame(created, this.user);
    }

    @Test
    public void b_read() {
       User savedUser = getSavedUser();
        System.out.println("In read, SiteId = "+ savedUser.getSiteId());
        User read = this.repository.read(savedUser.getSiteId());
        System.out.println("In read, read = " + read);
        d_getAll();
        Assert.assertEquals(savedUser, read);
    }

    @Test
    public void e_delete() {
        User savedUser = getSavedUser();
        this.repository.delete(savedUser.getSiteId());
        d_getAll();
    }

    @Test
    public void c_update() {
        String newname = "New Test Site Name";
        User user = new User.Builder().copy(getSavedUser()).SiteName(newname).build();
        System.out.println("In update, about_to_updated = " + course);
        User updated = this.repository.update(user);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newname, updated.getSiteName());
        d_getAll();
    }

    @Test
    public void d_getAll() {
        Set<User> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }
}