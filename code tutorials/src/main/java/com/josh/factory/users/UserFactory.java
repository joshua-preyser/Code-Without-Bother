package com.josh.factory.users;
import com.josh.domain.users.User;

public class UserFactory {

    public static User buildUser(String SiteId,String Email, String UserId,String SiteName, String ScreenName, String FirstName, String MiddleName, String LastName, String Password) {
        return new User.Builder().SiteId(Misc.generateId())
                .Email(Email)
                .UserId(Misc.generateId())
                .SiteName(SiteName)
                .firstName(furstName)
                .middleName(middleName)
                .lastName(lastName)
                .password(password)
                .build();

    }
}