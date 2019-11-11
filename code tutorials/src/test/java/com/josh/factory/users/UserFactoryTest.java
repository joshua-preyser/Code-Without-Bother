package com.josh.factory.users;
import com.josh.domain.users.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserFactoryTest {

    private String testName;

    @Before
    public void setUp() throws Exception {
        this.testName = "UserTest";
    }

    @Test
    public void buildUser() {
        User user = UserFactory.buildUser(this.testName);
        Assert.assertNotNull(user.getSiteId());
        Assert.assertNotNull(user);
    }
}