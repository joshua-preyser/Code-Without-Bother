

public class Registration {

    private String SiteId, Email;

    private Registration() {
    }

    private Registration(Builder builder) {
        this.SiteId = builder.SiteId;
        this.Email = builder.Email;

    }

    public String getSiteId() {
        return SiteId;
    }

    public String getEmail() {
        return Email;
    }


    public static class Builder {

        private String SiteId, Email;

        public Builder SiteId(String SiteId) {
            this.SiteId = SiteId;
            return this;
        }

        public Builder Email(String Email) {
            this.Email = Email;
            return this;
        }

        public Builder copy(Registration register) {
            this.SiteId = register.SiteId;
            this.Email = register.Email;

            return this;
        }

        public Registration build() {
            return new Registration(this);
        }

    }


