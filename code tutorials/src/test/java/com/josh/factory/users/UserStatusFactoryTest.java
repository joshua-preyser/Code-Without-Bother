package com.josh.factory.users;
import com.josh.domain.users.UserStatus;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserStatusFactoryTest {

    private String testName;

    @Before
    public void setUp() throws Exception {
        this.testName = "UserStatusTest";
    }

    @Test
    public void buildUserStatus() {
        UserStatus userStatus = UserStatusFactory.buildUserStatus(this.testName);
        Assert.assertNotNull(userStatus.getUserId());
        Assert.assertNotNull(userStatus);
    }
}