package com.josh.services.users;
import org.junit.Assert;
import org.junit.Test;
import java.util.Set;
import com.josh.domain.users.Registration;
import com.josh.factory.users.RegistrationFactory;
import com.josh.repository.users.impl.RegistrationRepositoryImpl;
import com.josh.service.users.impl.RegistrationServiceImpl;
import org.junit.Before;

public class RegistrationServiceImplTest {

    private RegistrationServiceImpl repository;
    private Registration registration;

    private Registration getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = RegistrationRepositoryImpl.getRepository();
        this.registration = RegistrationFactory.buildRegistration("Application Development Practice 3");
    }

    @Test
    public void a_create() {
        Registration created = this.repository.create(this.registration);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.registration);
    }

    @Test
    public void c_update() {
        String newSiteName = "Udemy";
        Registration updated = new registration.Builder().copy(getSaved()).SiteName(newSiteName).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newSiteName, updated.getSiteName());
    }

    @Test
    public void e_delete() {
        Registration saved = getSaved();
        this.repository.delete(saved.getSiteId());
        d_getAll();
    }

    @Test
    public void b_read() {
        Registration saved = getSaved();
        Registration read = this.repository.read(saved.getSiteId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<Registration> registrations = this.repository.getAll();
        System.out.println("In getAll, all = " + registrations);
    }
}
