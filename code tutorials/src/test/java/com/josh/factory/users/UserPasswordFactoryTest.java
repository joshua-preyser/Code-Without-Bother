package com.josh.factory.users;
import com.josh.domain.users.UserPassword;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserPasswordFactoryTest {

    private String testName;

    @Before
    public void setUp() throws Exception {
        this.testName = "UserPasswordTest";
    }

    @Test
    public void buildUserPassword() {
        UserPassword userPassword = UserPasswordFactory.buildUserPassword(this.testName);
        Assert.assertNotNull(userPassword.getUserId());
        Assert.assertNotNull(userAPassword);
    }
}