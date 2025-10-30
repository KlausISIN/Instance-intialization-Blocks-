public class CreateAccount {
    public static void main(String[] args) {
        System.out.println("_____Creating Bank Account_____\n");

        BankAccount account1 = new BankAccount("Isingoma klaus");
        System.out.println();

        BankAccount account2 = new BankAccount("Nuwamanya Brian");
        System.out.println();

        BankAccount account3 = new BankAccount("Namanya Daniel");
        System.out.println();

        BankAccount account4 = new BankAccount("Kato Steven");
        System.out.println();

        System.out.println("_____Displaying Bank Account Info_____\n");
        account1.displayAccountInfo();
        System.out.println();

        account2.displayAccountInfo();
        System.out.println();

        account3.displayAccountInfo();
        System.out.println();

        account4.displayAccountInfo();
        System.out.println();

        System.out.println("_____Verification for the BankAccounts_____\n");
        System.out.println("Account 1 Number: " + account1.getAccountnumber());
        System.out.println("Account 2 Number: " + account2.getAccountnumber());
        System.out.println("Account 3 Number: " + account3.getAccountnumber());
        System.out.println("Account 4 Number: " + account4.getAccountnumber());
    }
}
