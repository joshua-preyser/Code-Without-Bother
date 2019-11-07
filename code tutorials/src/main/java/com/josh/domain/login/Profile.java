type Profile struct {
	Email  string `json:"email"`
	SiteId string `json:"siteId"`
	UserId string `json:"userId"`
}

public class Profile {

    private String SiteId, Email, UserId;

    private Profile() {
    }

    private Profile(Builder builder) {
        this.SiteId = builder.SiteId;
        this.Email = builder.Email;
        this.UserId = builder.UserId
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


    public static class Builder {

        private String SiteId, Email, UserId;

        public Builder SiteId(String SiteId) {
            this.SiteId = SiteId;
            return this;
        }

        public Builder Email(String Email) {
            this.Email = Email;
            return this;
        }

        public Builder UserId(String UserId) {
            this.UserId = UserId;
            return this;
        }

        public Builder copy(Profile account) {
            this.SiteId = account.SiteId;
            this.Email = account.Email;
            this.UserId = account.UserId;

            return this;
        }

        public Profile build() {
            return new Profile(this);
        }

    }


