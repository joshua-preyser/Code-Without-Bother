

public class Role {

    private String SiteId, Id, RoleName, Description;

    private Role() {
    }

    private Role(Builder builder) {
        this.SiteId = builder.SiteId;
        this.Id = builder.Id;
        this.Description = builder.Description;
        this.RoleName = builder.RoleName
    }

    public String getSiteId() {
        return SiteId;
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

        private String SiteId, Id, RoleName, Description;

        public Builder SiteId(String SiteId) {
            this.SiteId = SiteId;
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

        public Builder copy(Role role) {
            this.SiteId = role.SiteId;
            this.Id = role.Id;
            this.RoleName = role.RoleName;
            this.Description = role.Description;

            return this;
        }

        public Role build() {
            return new Role(this);
        }

    }

