package com.josh.domain.users;

public class UserPassword {

    private String UserId, Date, Password;



    private User() {
    }

    private User(Builder builder) {
        this.UserId = builder.UserId;
        this.Date = builder.Date;
        this.Password = builder.Password;
    }


    public String getUserId() {
        return UserId;
    }

    public String getDate() {
        return Date;
    }

    public String getPassword() {
        return Password;
    }


    public static class Builder {

        private String UserId, Date, Password;

        public Builder Date(String Date) {
            this.Date = Date;
            return this;
        }

        public Builder UserId(String UserId) {
            this.UserId = UserId;
            return this;
        }

        public Builder Password(String Password) {
            this.Password = Password;
            return this;
        }


        public Builder copy(User user) {
            this.UserId = user.UserId;
            this.Date = user.Date;
            this.Password = user.Password;

            return this;
        }

        public User build() {
            return new User(this);
        }

    }


