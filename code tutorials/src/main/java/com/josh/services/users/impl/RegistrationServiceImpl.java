package com.josh.services.users.impl;
import com.josh.services.users.RegistrationService;
import com.josh.repository.users.impl.RegistrationRepositoryImpl;
import com.josh.repository.users.RegistrationRepository;

public class RegistrationServiceImpl implements RegistrationService {

    private static RegistrationServiceImpl service = null;
    private RegistrationRepository repository;

    private RegistrationServiceImpl() {
        this.repository = RegistrationRepositoryImpl.getRepository();
    }

    public static RegistrationServiceImpl getService(){
        if (service == null) service = new RegistrationServiceImpl();
        return service;
    }

    @Override
    public Registration create(Registration registration) {
        return this.repository.create(registration);
    }

    @Override
    public Registration update(Registration registration) {
        return this.repository.update(registration);
    }

    @Override
    public void delete(String siteId) {
        this.repository.delete(siteId);
    }

    @Override
    public Registration read(String siteId) {
        return this.repository.read(siteId);
    }

    @Override
    public Set<Registration> getAll() {
        return this.repository.getAll();
    }
}