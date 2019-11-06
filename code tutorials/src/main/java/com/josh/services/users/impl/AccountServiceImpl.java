
public class AccountServiceImplTest {

    private AccountServiceImpl repository;
    private Account account;

    private Account getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = AccountRepositoryImpl.getRepository();
        this.account = AccountFactory.buildAccount("Application Development Practice 3");
    }

    @Test
    public void a_create() {
        Account created = this.repository.create(this.account);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.account);
    }

    @Test
    public void c_update() {
        String newSiteName = "Udemy";
        Account updated = new account.Builder().copy(getSaved()).SiteName(newSiteName).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(newSiteName, updated.getSiteName());
    }

    @Test
    public void e_delete() {
        Account saved = getSaved();
        this.repository.delete(saved.getSiteId());
        d_getAll();
    }

    @Test
    public void b_read() {
        Account saved = getSaved();
        Account read = this.repository.read(saved.getSiteId());
        System.out.println("In read, read = "+ read);
        Assert.assertSame(read, saved);
    }

    @Test
    public void d_getAll() {
        Set<Account> accounts = this.repository.getAll();
        System.out.println("In getall, all = " + accounts);
    }
}