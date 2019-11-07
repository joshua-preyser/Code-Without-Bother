package com.josh.domain.subscription;

public class SiteSubscription {

    private String SiteId, Id, SubscriptionId, TokenValue;
    private Date StartDate, EndDate;

    private SiteSubscription() {
    }

    private SiteSubscription(Builder builder) {
        this.SiteId = builder.SiteId;
        this.Id = builder.Id;
        this.TokenValue = builder.TokenValue;
        this.SubscriptionId = builder.SubscriptionId;
        this.EndDate = builder.EndDate;
        this.StartDate = builder.StartDate;
    }

    public String getSiteId() {
        return SiteId;
    }

    public String getId() {
        return Id;
    }

    public String getSubscriptionId() {
        return SubscriptionId;
    }

    public String getTokenValue() {
        return TokenValue;
    }

    public String getStartDate() {
        return StartDate;
    }

    public String getEndDate() {
        return EndDate;
    }

    public static class Builder {

        private String SiteId, Id, SubscriptionId, TokenValue;
        private Date StartDate, EndDate;

        public Builder SiteId(String SiteId) {
            this.SiteId = SiteId;
            return this;
        }

        public Builder Id(String Id) {
            this.Id = Id;
            return this;
        }

        public Builder TokenValue(String TokenValue) {
            this.TokenValue = TokenValue;
            return this;
        }

        public Builder StartDate(Date StartDate) {
            this.StartDate = StartDate;
            return this;
        }

        public Builder EndDate(Date EndDate) {
            this.EndDate = EndDate;
            return this;
        }



        public Builder copy(SiteSubscription account) {
            this.SiteId = account.SiteId;
            this.Id = account.Id;
            this.SubscriptionId = account.SubscriptionId;
            this.TokenValue = account.TokenValue;
            this.StartDate = account.StartDate;
            this.EndDate = account.EndDate;

            return this;
        }

        public SiteSubscription build() {
            return new Account(this);
        }

    }


