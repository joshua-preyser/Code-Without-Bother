package com.josh.services.users;
import org.junit.Assert;
import org.junit.Test;
import java.util.Set;
import com.josh.domain.users.UserStatus;
import com.josh.factory.users.UserStatusFactory;
import com.josh.repository.users.impl.UserStatusRepositoryImpl;
import com.josh.service.users.impl.UserStatusServiceImpl;
import org.junit.Before;

public class UserStatusServiceImplTest {

    private UserStatusServiceImpl repository;
    private UserStatus userStatus;

    private UserStatus getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = UserStatusRepositoryImpl.getRepository();
        this.userStatus = UserStatusFactory.buildUserStatus("214167437");
    }

    @Test
    public void a_create() {
        UserStatus created = this.repository.create(this.userStatus);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.userStatus);
    }

    @Test
    public void c_update() {
        String newStatus = "student";
        UserStatus updated = new userStatus.Builder().copy(getSaved()).Status(newStatus).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newStatus, updated.getStatus());
    }

    @Test
    public void e_delete() {
        UserStatus saved = getSaved();
        this.repository.delete(saved.getUserId());
        d_getAll();
    }

    @Test
    public void b_read() {
        UserStatus saved = getSaved();
        UserStatus read = this.repository.read(saved.getUserId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<UserStatus> status = this.repository.getAll();
        System.out.println("In getAll, all = " + status);
    }
}
