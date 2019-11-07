package com.josh.domain.login;

public class PasswordChangeCredentials {

    private String OldPassword, Email, UserId, NewPassword;

    private PasswordChangeCredentials() {
    }

    private PasswordChangeCredentials(Builder builder) {
        this.OldPassword = builder.OldPassword;
        this.Email = builder.Email;
        this.NewPassword = builder.NewPassword;
        this.UserId = builder.UserId
    }

    public String getOldPassword() {
        return OldPassword;
    }

    public String getEmail() {
        return Email;
    }

    public String getUserId() {
        return UserId;
    }

    public String getNewPassword() {
        return NewPassword;
    }

    public static class Builder {

        private String OldPassword, Email, UserId, NewPassword;

        public Builder OldPassword(String OldPassword) {
            this.OldPassword = OldPassword;
            return this;
        }

        public Builder Email(String Email) {
            this.Email = Email;
            return this;
        }

        public Builder NewPassword(String NewPassword) {
            this.NewPassword = NewPassword;
            return this;
        }

        public Builder copy(PasswordChangeCredentials account) {
            this.OldPassword = account.OldPassword;
            this.Email = account.Email;
            this.UserId = account.UserId;
            this.NewPassword = account.NewPassword;

            return this;
        }

        public PasswordChangeCredentials build() {
            return new PasswordChangeCredentials(this);
        }

    }


