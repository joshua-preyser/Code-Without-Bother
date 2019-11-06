

public class AccountFactoryTest {

    private String testName;

    @Before
    public void setUp() throws Exception {
        this.testName = "AccountTest";
    }

    @Test
    public void buildAccount() {
        Account account = AccountFactory.buildAccount(this.testName);
        Assert.assertNotNull(account.getSiteId());
        Assert.assertNotNull(account);
    }
}