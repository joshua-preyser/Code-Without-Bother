package com.josh.factory.users;
import com.josh.domain.users.UserRole;

public class UserRoleFactory {

    public static UserRole buildUserRole(String UserId,String date, String roleId) {
        return new UserRole.Builder().UserId(Misc.generateId())
                .date(date)
                .roleId(misc.generateId())
                .build();

    }
}