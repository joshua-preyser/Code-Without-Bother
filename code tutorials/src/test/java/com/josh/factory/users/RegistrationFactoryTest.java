package com.josh.factory.users;
import com.josh.domain.users.Registration;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RegistrationFactoryTest {

    private String testName;

    @Before
    public void setUp() throws Exception {
        this.testName = "RegistrationTest";
    }

    @Test
    public void buildRegistration() {
        Registration registration = RegistrationFactory.buildRegistration(this.testName);
        Assert.assertNotNull(registration.getSiteId());
        Assert.assertNotNull(registration);
    }
}