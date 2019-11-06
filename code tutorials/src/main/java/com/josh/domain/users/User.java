

public class User {

    private String SiteId, Email, UserId, SiteName, ScreenName, FirstName, MiddleName, LastName, Password;
    private Time DateCreated;


    private User() {
    }

    private User(Builder builder) {
        this.SiteId = builder.SiteId;
        this.Email = builder.Email;
        this.SiteName = builder.SiteName;
        this.UserId = builder.UserId;
        this.ScreenName = builder.ScreenName;
        this.FirstName = builder.FirstName;
        this.MiddleName = builder.MiddleName;
        this.LastName = builder.LastName;
        this.Password = builder.Password;
        this.DateCreated = builder.DateCreated;
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

    public String getScreenName() {
        return ScreenName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public String getLastName() {
        return LastName;
    }

    public Time getPassword() {
        return SiteName;
    }

    public static class Builder {

        private String SiteId, Email, UserId, SiteName, ScreenName, FirstName, MiddleName, LastName, Password;
        private Time DateCreated;

        public Builder SiteId(String SiteId) {
            this.SiteId = SiteId;
            return this;
        }

        public Builder UserId(String UserId) {
            this.UserId = UserId;
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

        public Builder ScreenName(String ScreenName) {
            this.ScreenName = ScreenName;
            return this;
        }

        public Builder FirstName(String FirstName) {
            this.FirstName = FirstName;
            return this;
        }

        public Builder MiddleName(String MiddleName) {
            this.MiddleName = MiddleName;
            return this;
        }

        public Builder LastName(String LastName) {
            this.LastName = LastName;
            return this;
        }

        public Builder Password(String Password) {
            this.Password = Password;
            return this;
        }

        public Builder DateCreated(Time DateCreated) {
            this.DateCreated = DateCreated;
            return this;
        }


        public Builder copy(User user) {
            this.SiteId = user.SiteId;
            this.Email = user.Email;
            this.UserId = user.UserId;
            this.SiteName = user.SiteName;
            this.UserId = user.UserId;
            this.ScreenName = user.ScreenName;
            this.FirstName = user.FirstName;
            this.MiddleName = user.MiddleName;
            this.LastName = user.LastName;
            this.Password = user.Password;
            this.DateCreated = user.DateCreated;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }


