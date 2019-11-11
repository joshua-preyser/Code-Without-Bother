package com.josh.factory.users;
import com.josh.domain.users.UserRole;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRoleFactoryTest {

    private String testName;

    @Before
    public void setUp() throws Exception {
        this.testName = "UserRoleTest";
    }

    @Test
    public void buildUserRole() {
        UserRole userRole = UserRoleFactory.buildUserRole(this.testName);
        Assert.assertNotNull(userRole.getUserId());
        Assert.assertNotNull(userRole);
    }
}