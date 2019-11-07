package com.josh.domain.subscription;

public class SiteSubscription {

    private String SubscriptionType, Id, Value, Description, Status;
    private Date DateCreated;
    private Interger Duration;

    private SiteSubscription() {
    }

    private SiteSubscription(Builder builder) {
        this.SubscriptionType = builder.SubscriptionType;
        this.Id = builder.Id;
        this.Description = builder.Description;
        this.Value = builder.Value;
        this.Status = builder.Status;
        this.DateCreated = builder.DateCreated;
        this.Duration = builder.Duration;
    }

    public String getSubscriptionType() {
        return SubscriptionType;
    }

    public String getId() {
        return Id;
    }

    public String getValue() {
        return Value;
    }

    public String getDescription() {
        return Description;
    }

    public Date getDateCreated() {
        return DateCreated;
    }

    public String getStatus() {
        return Status;
    }

    public Interger getDuration() {
        return Duration;
    }

    public static class Builder {

        private String SubscriptionType, Id, Value, Description, Status;
        private Date DateCreated;
        private Interger Duration;

        public Builder SubscriptionType(String SubscriptionType) {
            this.SubscriptionType = SubscriptionType;
            return this;
        }

        public Builder Id(String Id) {
            this.Id = Id;
            return this;
        }

        public Builder Description(String Description) {
            this.Description = Description;
            return this;
        }

        public Builder DateCreated(Date DateCreated) {
            this.DateCreated = DateCreated;
            return this;
        }

        public Builder SubscriptionType(String SubscriptionType) {
            this.SubscriptionType = SubscriptionType;
            return this;
        }

        public Builder Status(String Status) {
            this.Status = Status;
            return this;
        }

         public Builder Duration(Int Duration) {
            this.Duration = Duration;
            return this;
        }


        public Builder copy(SiteSubscription account) {
            this.SubscriptionType = account.SubscriptionType;
            this.Id = account.Id;
            this.Description = account.Description;
            this.Value = account.Value;
            this.Status = account.Status;
            this.DateCreated = account.DateCreated;
            this.Duration = account.Duration;

            return this;
        }

        public SiteSubscription build() {
            return new SiteSubscription(this);
        }

    }


