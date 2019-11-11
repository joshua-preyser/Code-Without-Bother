package com.josh.repository.users;
import org.junit.Assert;
import org.junit.Test;
import java.util.Set;
import com.josh.domain.users.UserRole;
import com.josh.factory.users.UserRoleFactory;
import com.josh.repository.users.impl.UserRoleRepositoryImpl;
import org.junit.Before;

public class UserRoleRepositoryImplTest {

    private UserRoleRepository repository;
    private UserRole userRole;

    private UserRole getSavedCourse() {
        Set<UserRole> savedRole = this.repository.getAll();
        return savedRole.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository =UserRoleRepositoryImpl.getRepository();
        this.userRole = UserRoleFactory.buildUserRole("Test UserRole");
    }

    @Test
    public void a_create() {
        UserRole created = this.repository.create(this.userRole);
        System.out.println("In create, created = " + created);
        d_getAll();
        Assert.assertSame(created, this.userRole);
    }

    @Test
    public void b_read() {
       UserRole savedUserRole = getSavedUserRole();
        System.out.println("In read, UserId = "+ savedUserRole.getUserId());
        Account read = this.repository.read(savedUserRole.getUserId());
        System.out.println("In read, read = " + read);
        d_getAll();
        Assert.assertEquals(savedUserRole, read);
    }

    @Test
    public void e_delete() {
        UserRole savedUserRole = getSavedUserRole();
        this.repository.delete(savedUserRole.getUserId());
        d_getAll();
    }

    @Test
    public void c_update() {
        String newRole = "New Test Role";
        UserRole userRole = new UserRole.Builder().copy(getSavedUserRole()).Role(newRole).build();
        System.out.println("In update, about_to_updated = " + course);
        UserRole updated = this.repository.update(userRole);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newRole, updated.getRole());
        d_getAll();
    }

    @Test
    public void d_getAll() {
        Set<UserRole> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }
}