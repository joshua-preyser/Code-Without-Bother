package com.josh.domain.users;

public class Account {

    private String SiteId, Email, UserId, SiteName;

    private Account() {
    }

    private Account(Builder builder) {
        this.SiteId = builder.SiteId;
        this.Email = builder.Email;
        this.SiteName = builder.SiteName;
        this.UserId = builder.UserId;
    }

    public String getSiteId() {
        return SiteId;
    }

    public String getEmail() {
        return Email;
    }

    public String getUserId() {
        return UserId;
    }

    public String getSiteName() {
        return SiteName;
    }

    public static class Builder {

        private String SiteId, Email, UserId, SiteName;

        public Builder SiteId(String SiteId) {
            this.SiteId = SiteId;
            return this;
        }

        public Builder Email(String Email) {
            this.Email = Email;
            return this;
        }

        public Builder SiteName(String SiteName) {
            this.SiteName = SiteName;
            return this;
        }

        public Builder copy(Account account) {
            this.SiteId = account.SiteId;
            this.Email = account.Email;
            this.UserId = account.UserId;
            this.SiteName = account.SiteName;

            return this;
        }

        public Account build() {
            return new Account(this);
        }

    }         
}

