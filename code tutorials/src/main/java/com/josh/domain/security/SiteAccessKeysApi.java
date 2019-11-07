type SiteAccessKeysApi struct {
	SiteId     string `json:"siteId"`
	Id         string `json:"id"`
	ExpiryDate string `json:"expiryDate"`
	Value      string `json:"value"`
	Message    string `json:"message"`
}


public class Account {

    private String SiteId, Id, ExpiryDate, Value, Message;

    private Account() {
    }

    private Account(Builder builder) {
        this.SiteId = builder.SiteId;
        this.Id = builder.Id;
        this.Value = builder.Value;
        this.ExpiryDate = builder.ExpiryDate;
        this.Message = builder.Message;
    }

    public String getSiteId() {
        return SiteId;
    }

    public String getId() {
        return Id;
    }

    public String getExpiryDate() {
        return ExpiryDate;
    }

    public String getValue() {
        return Value;
    }

     public String getMessage() {
        return Message;
    }

    public static class Builder {

        private String SiteId, Id, ExpiryDate, Value;

        public Builder SiteId(String SiteId) {
            this.SiteId = SiteId;
            return this;
        }

        public Builder Id(String Id) {
            this.Id = Id;
            return this;
        }

        public Builder Value(String Value) {
            this.Value = Value;
            return this;
        }

        public Builder Message(String Message) {
            this.Message = Message;
            return this;
        }

        public Builder copy(Account account) {
            this.SiteId = account.SiteId;
            this.Id = account.Id;
            this.ExpiryDate = account.ExpiryDate;
            this.Value = account.Value;
            this.Message = account.Message;

            return this;
        }

        public Account build() {
            return new Account(this);
        }

    }


