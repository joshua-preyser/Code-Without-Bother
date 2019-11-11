package com.josh.repository.users;
import org.junit.Assert;
import org.junit.Test;
import java.util.Set;
import com.josh.domain.users.UserStatus;
import com.josh.factory.users.UserStatusFactory;
import com.josh.repository.users.impl.UserStatusRepositoryImpl;
import org.junit.Before;

public class UserStatusRepositoryImplTest {

    private UserStatusRepository repository;
    private UserStatus userStatus;

    private UserStatus getSavedCourse() {
        Set<UserStatus> savedStatus = this.repository.getAll();
        return savedStatus.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = UserStatusRepositoryImpl.getRepository();
        this.userStatus = UserStatusFactory.buildUserStatus("Test UserStatus");
    }

    @Test
    public void a_create() {
        UserStatus created = this.repository.create(this.userStatus);
        System.out.println("In create, created = " + created);
        d_getAll();
        Assert.assertSame(created, this.userStatus);
    }

    @Test
    public void b_read() {
       UserStatus savedUserStatus = getSavedUserStatus();
        System.out.println("In read, UserId = "+ savedUserStatus.getUserId());
        UserStatus read = this.repository.read(savedUserStatus.getUserId());
        System.out.println("In read, read = " + read);
        d_getAll();
        Assert.assertEquals(savedUserStatus, read);
    }

    @Test
    public void e_delete() {
        UserStatus savedUserStatus = getSavedUserStatus();
        this.repository.delete(savedUserStatus.getUserId());
        d_getAll();
    }

    @Test
    public void c_update() {
        String newStatus = "New Test Status";
        UserStatus userStatus = new UserStatus.Builder().copy(getSavedUserStatus()).Status(newStatus).build();
        System.out.println("In update, about_to_updated = " + course);
        UserStatus updated = this.repository.update(userStatus);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newname, updated.getStatus());
        d_getAll();
    }

    @Test
    public void d_getAll() {
        Set<UserStatus> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }
}