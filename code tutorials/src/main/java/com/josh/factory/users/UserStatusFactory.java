package com.josh.factory.users;
import com.josh.domain.users.UserStatus;

public class UserStatusFactory {

    public static UserStatus buildUserStatus(String UserId,String date, String Status) {
        return new UserStatus.Builder().UserId(Misc.generateId())
                .date(date)
                .status(status)
                .build();

    }
}