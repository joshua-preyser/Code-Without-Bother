type Site struct {
	SiteId         string `json:"siteId"`
	SiteName       string `json:"siteName"`
	SiteUrl        string `json:"siteUrl"`
	SiteAdminSiteAdminEmail string `json:"siteAdminSiteAdminEmail"`
}

public class Site {

    private String SiteId, SiteAdminEmail, SiteUrl, SiteName;

    private Site() {
    }

    private Site(Builder builder) {
        this.SiteId = builder.SiteId;
        this.SiteAdminEmail = builder.SiteAdminEmail;
        this.SiteName = builder.SiteName;
        this.SiteUrl = builder.SiteUrl
    }

    public String getSiteId() {
        return SiteId;
    }

    public String getSiteAdminEmail() {
        return SiteAdminEmail;
    }

    public String getSiteUrl() {
        return SiteUrl;
    }

    public String getSiteName() {
        return SiteName;
    }

    public static class Builder {

        private String SiteId, SiteAdminEmail, SiteUrl, SiteName;

        public Builder SiteId(String SiteId) {
            this.SiteId = SiteId;
            return this;
        }

        public Builder SiteAdminEmail(String SiteAdminEmail) {
            this.SiteAdminEmail = SiteAdminEmail;
            return this;
        }

        public Builder SiteName(String SiteName) {
            this.SiteName = SiteName;
            return this;
        }

        public Builder copy(Site account) {
            this.SiteId = account.SiteId;
            this.SiteAdminEmail = account.SiteAdminEmail;
            this.SiteUrl = account.SiteUrl;
            this.SiteName = account.SiteName;

            return this;
        }

        public Site build() {
            return new Site(this);
        }

    }


