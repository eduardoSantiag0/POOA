public class Account {

    private ITransaction transacao;

    public Account(ITransaction transacao) {
        this.transacao = transacao;
    }

    public void deposit(double amount) {
        transacao.deposit(amount);
    }

    public void withdraw(double amount) {
        transacao.withdraw(amount);
    }
}
