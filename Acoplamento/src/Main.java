//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.print("Hello and welcome!");
        ITransaction iTransaction = new Transaction();
        Account conta = new Account(iTransaction);

        conta.deposit(10);
    }
}