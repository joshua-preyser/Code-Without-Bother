package com.josh.domain.role;

public class RolePool {

    private String Id, RoleName, Description;

    private RolePool() {
    }

    private RolePool(Builder builder) {
        this.Id = builder.Id;
        this.Description = builder.Description;
        this.RoleName = builder.RoleName
    }


    public String getId() {
        return Id;
    }

    public String getRoleName() {
        return RoleName;
    }

    public String getDescription() {
        return Description;
    }

    public static class Builder {

        private String  Id, RoleName, Description;

        public Builder Id(String Id) {
            this.Id = Id;
            return this;
        }

        public Builder RoleName(String RoleName) {
            this.RoleName = RoleName;
            return this;
        }

        public Builder Description(String Description) {
            this.Description = Description;
            return this;
        }

        public Builder copy(RolePool role) {
            this.Id = role.Id;
            this.RoleName = role.RoleName;
            this.Description = role.Description;

            return this;
        }

        public RolePool build() {
            return new RolePool(this);
        }

    }

