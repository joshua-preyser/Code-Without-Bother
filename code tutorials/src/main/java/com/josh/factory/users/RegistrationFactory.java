package com.josh.factory.users;
import com.josh.domain.users.Registration;

public class RegistrationFactory {

    public static Registration buildRegistration(String SiteId, String Email) {
        return new Registration.Builder().SiteId(Misc.generateId())
                .Email(Email).build();

    }
}