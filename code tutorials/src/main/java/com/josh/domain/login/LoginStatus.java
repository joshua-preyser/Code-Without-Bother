type LoginStatus struct {
	Status string `json:"status"`
}

public class LoginStatus {

    private String Status;

    private LoginStatus() {
    }

    private LoginStatus(Builder builder) {
        this.Status = builder.Status;

    }

    public String getStatus() {
        return Status;
    }


    public static class Builder {

        private String Status;

        public Builder SiteId(String Status) {
            this.Status = Status;
            return this;
        }

        public Builder copy(LoginStatus account) {
            this.SiteId = account.SiteId;
            this.Email = account.Email;
            this.UserId = account.UserId;
            this.SiteName = account.SiteName;

            return this;
        }

        public LoginStatus build() {
            return new LoginStatus(this);
        }

    }


