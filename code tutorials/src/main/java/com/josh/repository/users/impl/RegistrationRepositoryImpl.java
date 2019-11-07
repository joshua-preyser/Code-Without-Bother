package com.josh.repository.users.impl;
import com.josh.repository.users.RegistrationRepository

public class RegistrationRepositoryImpl implements RegistrationRepository {

    private static RegistrationRepositoryImpl repository = null;
    private Set<Registration> registration;

    private RegistrationRepositoryImpl(){
        this.register = new HashSet<>();
    }

    private Registration findRegistration(String SiteId) {
        return this.register.stream()
                .filter(registration -> registration.getSiteId().trim().equals(SiteId))
                .findAny()
                .orElse(null);
    }

    public static RegistrationRepositoryImpl getRepository(){
        if (repository == null) repository = new RegistrationRepositoryImpl();
        return repository;
    }


    public Registration create(Registration registration){
        this.register.add(registration);
        return registration;
    }

    public Registration read(final String SiteId){
        Registration registration = findRegistration(SiteId);
        return registration;
    }

    public void delete(String SiteId) {
        Registration registration = findRegistration(SiteId);
        if (registration != null) this.register.remove(registration);
    }

    public Registration update(Registration registration){
        Registration toDelete = findRegistration(registration.getSiteId());
        if(toDelete != null) {
            this.register.remove(toDelete);
            return create(registration);
        }
        return null;
    }


    public Set<Registration> getAll(){
        return this.register;
    }
}
