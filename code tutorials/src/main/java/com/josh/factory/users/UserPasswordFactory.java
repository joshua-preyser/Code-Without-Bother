package com.josh.factory.users;
import com.josh.domain.users.UserPassword;

public class UserPasswordFactory {

    public static UserPassword buildUserPassword(String UserId,String date, String Password) {
        return new UserPassword.Builder().UserId(Misc.generateId())
                .date(date)
                .password(password)
                .build();

    }
}