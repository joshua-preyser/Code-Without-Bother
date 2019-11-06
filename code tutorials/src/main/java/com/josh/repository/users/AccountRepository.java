
public interface AccountRepository extends IRepository<Account, String> {
    Set<Account> getAll();
}
