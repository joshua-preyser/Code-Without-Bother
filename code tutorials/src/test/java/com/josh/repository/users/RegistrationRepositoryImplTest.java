package com.josh.repository.users;
import org.junit.Assert;
import org.junit.Test;
import java.util.Set;
import com.josh.domain.users.Registration;
import com.josh.factory.users.RegistrationFactory;
import com.josh.repository.users.impl.RegistrationRepositoryImpl;
import org.junit.Before;

public class RegistrationRepositoryImplTest {

    private RegistrationRepository repository;
    private Registration registration;

    private Registration getSavedCourse() {
        Set<Registration> savedRegistrations = this.repository.getAll();
        return savedRegistrations.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = RegistrationRepositoryImpl.getRepository();
        this.registration = RegistrationFactory.buildRegistration("Test Registration");
    }

    @Test
    public void a_create() {
        Registration created = this.repository.create(this.registration);
        System.out.println("In create, created = " + created);
        d_getAll();
        Assert.assertSame(created, this.registration);
    }

    @Test
    public void b_read() {
       Registration savedRegistration = getSavedAccount();
        System.out.println("In read, SiteId = "+ savedRegistration.getSiteId());
        Registration read = this.repository.read(savedRegistration.getSiteId());
        System.out.println("In read, read = " + read);
        d_getAll();
        Assert.assertEquals(savedRegistration, read);
    }

    @Test
    public void e_delete() {
        Registration savedRegistration = getSavedRegistration();
        this.repository.delete(savedRegistration.getSiteId());
        d_getAll();
    }

    @Test
    public void c_update() {
        String newname = "New Test Site Name";
        Registration registration = new Registration.Builder().copy(getSavedRegistration()).SiteName(newname).build();
        System.out.println("In update, about_to_updated = " + course);
        Registration updated = this.repository.update(registration);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newname, updated.getSiteName());
        d_getAll();
    }

    @Test
    public void d_getAll() {
        Set<Registration> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
    }
}