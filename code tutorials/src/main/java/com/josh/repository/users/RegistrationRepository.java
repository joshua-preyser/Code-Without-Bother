package com.josh.repository.users;

public interface RegistrationRepository extends IRepository<Registration, String> {
    Set<Registration> getAll();
}
