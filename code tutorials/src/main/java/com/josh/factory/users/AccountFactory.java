

public class AccountFactory {

    public static Account buildAccount(String SiteId,String Email, String UserId,String SiteName) {
        return new Account.Builder().SiteId(Misc.generateId())
                .Email(Email)
                .UserId(Misc.generateId())
                .SiteName(SiteName)
                .build();

    }
}