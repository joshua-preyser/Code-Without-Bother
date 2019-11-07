package com.josh.domain.systemslogs;

public class LogEvent {

    private String SiteId, Id, EventName, EventType, Message;
    private Date Date ;

    private LogEvent() {
    }

    private LogEvent(Builder builder) {
        this.SiteId = builder.SiteId;
        this.Id = builder.Id;
        this.EventType = builder.EventType;
        this.EventName = builder.EventName;
        this.Message = builder.Message;
        this.Date = builder.Date;
    }

    public String getSiteId() {
        return SiteId;
    }

    public String getId() {
        return Id;
    }

    public String getEventName() {
        return EventName;
    }

    public String getEventType() {
        return EventType;
    }

    public String getDate() {
        return Date;
    }

    public String getMessage() {
        return Message;
    }

    public static class Builder {

        private String SiteId, Id, EventName, EventType, Message;
        private Date Date ;


        public Builder SiteId(String SiteId) {
            this.SiteId = SiteId;
            return this;
        }

        public Builder Id(String Id) {
            this.Id = Id;
            return this;
        }

        public Builder EventType(String EventType) {
            this.EventType = EventType;
            return this;
        }

        public Builder Date(Date Date) {
            this.Date = Date;
            return this;
        }

        public Builder Message(String Message) {
            this.Message = Message;
            return this;
        }



        public Builder copy(LogEvent account) {
            this.SiteId = account.SiteId;
            this.Id = account.Id;
            this.EventName = account.EventName;
            this.EventType = account.EventType;
            this.Date = account.Date;
            this.Message = account.Message;

            return this;
        }

        public LogEvent build() {
            return new LogEvent(this);
        }

    }


