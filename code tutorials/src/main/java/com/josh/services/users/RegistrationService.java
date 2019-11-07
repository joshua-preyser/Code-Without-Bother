package com.josh.services.users;

public interface RegistrationService extends IService<Registration, String> {
    Set<Registration> getAll();
}
