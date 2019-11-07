package com.josh.domain.security;
import java.util.*;

public class ApiKeys {

    private String Id, Value, Status;
    private Date Date;

    private ApiKeys() {
    }

    private ApiKeys(Builder builder) {
        this.Id = builder.Id;
        this.Value = builder.Value;
        this.Date = builder.Date;
        this.Status = builder.Status;
    }

    public String getId() {
        return Id;
    }

    public String getValue() {
        return Value;
    }

    public String getStatus() {
        return Status;
    }

    public Date getDate() {
        return Date;
    }

    public static class Builder {

        private String Id, Value, Status;
        private Date Date;

        public Builder Id(String Id) {
            this.Id = Id;
            return this;
        }

        public Builder Value(String Value) {
            this.Value = Value;
            return this;
        }

        public Builder Date(Date Date) {
            this.Date = Date;
            return this;
        }

        public Builder copy(ApiKeys account) {
            this.Id = account.Id;
            this.Value = account.Value;
            this.Status = account.Status;
            this.Date = account.Date;

            return this;
        }

        public ApiKeys build() {
            return new ApiKeys(this);
        }

    }


