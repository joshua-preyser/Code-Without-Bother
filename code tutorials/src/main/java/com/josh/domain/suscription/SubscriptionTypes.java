
public class UserSubscriptions {

    private String Name, Id;
    

    private UserSubscriptions() {
    }

    private UserSubscriptions(Builder builder) {
        this.Name = builder.Name;
        this.Id = builder.Id;
        
    }

    public String getName() {
        return Name;
    }

    public String getId() {
        return Id;
    }

    

    public static class Builder {

        private String Name, Id, SubscriptionId, TokenValue;
       

        public Builder Name(String Name) {
            this.Name = Name;
            return this;
        }

        public Builder Id(String Id) {
            this.Id = Id;
            return this;
        }

        public Builder copy(UserSubscriptions account) {
            this.Name = account.Name;
            this.Id = account.Id;
            
            return this;
        }

        public UserSubscriptions build() {
            return new UserSubscriptions(this);
        }

    }


