package com.josh.domain.subscription;

public class SiteSubscription {

    private String SiteId, UserId, Id, SubscriptionId, TokenValue;
    private Date StartDate, EndDate;

    private SiteSubscription() {
    }

    private SiteSubscription(Builder builder) {
        this.SiteId = builder.SiteId;
        this.UserId = builder.UserId;
        this.SubscriptionId = builder.SubscriptionId;
        this.Id = builder.Id;
        this.TokenValue = builder.TokenValue;
        this.StartDate = builder.StartDate;
        this.EndDate = builder.EndDate;
    }

    public String getSiteId() {
        return SiteId;
    }

    public String getUserId() {
        return UserId;
    }

    public String getId() {
        return Id;
    }

    public String getSubscriptionId() {
        return SubscriptionId;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public String getTokenValue() {
        return TokenValue;
    }

    public Date getEndDate() {
        return EndDate;
    }

    public static class Builder {

        private String SiteId, UserId, Id, SubscriptionId, TokenValue;
        private Date StartDate, EndDate;

        public Builder SiteId(String SiteId) {
            this.SiteId = SiteId;
            return this;
        }

        public Builder UserId(String UserId) {
            this.UserId = UserId;
            return this;
        }

        public Builder SubscriptionId(String SubscriptionId) {
            this.SubscriptionId = SubscriptionId;
            return this;
        }

        public Builder StartDate(Date StartDate) {
            this.StartDate = StartDate;
            return this;
        }

        public Builder SiteId(String SiteId) {
            this.SiteId = SiteId;
            return this;
        }

        public Builder TokenValue(String TokenValue) {
            this.TokenValue = TokenValue;
            return this;
        }

        public Builder EndDate(Date EndDate) {
            this.EndDate = EndDate;
            return this;
        }

        private String SiteId, UserId, Id, SubscriptionId;
        private Date StartDate, EndDate;

        public Builder copy(SiteSubscription account) {
            this.SiteId = account.SiteId;
            this.UserId = account.UserId;
            this.SubscriptionId = account.SubscriptionId;
            this.Id = account.Id;
            this.TokenValue = account.TokenValue;
            this.StartDate = account.StartDate;
            this.EndDate = account.EndDate;

            return this;
        }

        public SiteSubscription build() {
            return new SiteSubscription(this);
        }

    }


