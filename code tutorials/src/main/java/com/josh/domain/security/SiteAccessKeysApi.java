package com.josh.domain.security;

public class SiteAccessKeysApi {

    private String SiteId, Id, ExpiryDate, Value, Message;

    private SiteAccessKeysApi() {
    }

    private SiteAccessKeysApi(Builder builder) {
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

        public Builder copy(SiteAccessKeysApi account) {
            this.SiteId = account.SiteId;
            this.Id = account.Id;
            this.ExpiryDate = account.ExpiryDate;
            this.Value = account.Value;
            this.Message = account.Message;

            return this;
        }

        public SiteAccessKeysApi build() {
            return new SiteAccessKeysApi(this);
        }

    }


