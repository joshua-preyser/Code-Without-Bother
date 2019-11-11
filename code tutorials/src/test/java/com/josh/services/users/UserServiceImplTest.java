package com.josh.services.users;
import org.junit.Assert;
import org.junit.Test;
import java.util.Set;
import com.josh.domain.users.UserRole;
import com.josh.factory.users.UserRoleFactory;
import com.josh.repository.users.impl.UserRoleRepositoryImpl;
import com.josh.service.users.impl.UserRoleServiceImpl;
import org.junit.Before;

public class UserRoleServiceImplTest {

    private UserRoleServiceImpl repository;
    private UserRole userRole;

    private UserRole getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = UserRoleRepositoryImpl.getRepository();
        this.userRole = UserRoleFactory.buildUserRole("214167437");
    }

    @Test
    public void a_create() {
        UserRole created = this.repository.create(this.userRole);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.userRole);
    }

    @Test
    public void c_update() {
        String newRole = "admin";
        UserRole updated = new userRole.Builder().copy(getSaved()).Role(newRole).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newRole, updated.getRole());
    }

    @Test
    public void e_delete() {
        UserRole saved = getSaved();
        this.repository.delete(saved.getUserId());
        d_getAll();
    }

    @Test
    public void b_read() {
        UserRole saved = getSaved();
        UserRole read = this.repository.read(saved.getUserId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<UserRole> role = this.repository.getAll();
        System.out.println("In getAll, all = " + role);
    }
}
