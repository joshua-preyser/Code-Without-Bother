package com.josh.domain.users;

public class UserRole {

    private String UserId, Date, RoleId;



    private User() {
    }

    private User(Builder builder) {
        this.UserId = builder.UserId;
        this.Date = builder.Date;
        this.RoleId = builder.RoleId;
    }


    public String getUserId() {
        return UserId;
    }

    public String getDate() {
        return Date;
    }

    public String getRoleId() {
        return RoleId;
    }


    public static class Builder {

        private String UserId, Date, RoleId;

        public Builder Date(String Date) {
            this.Date = Date;
            return this;
        }

        public Builder UserId(String UserId) {
            this.UserId = UserId;
            return this;
        }

        public Builder RoleId(String RoleId) {
            this.RoleId = RoleId;
            return this;
        }


        public Builder copy(User user) {
            this.UserId = user.UserId;
            this.Date = user.Date;
            this.RoleId = user.RoleId;

            return this;
        }

        public User build() {
            return new User(this);
        }

    }


