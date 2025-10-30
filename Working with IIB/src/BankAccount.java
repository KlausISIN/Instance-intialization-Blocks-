import java.util.concurrent.atomic.AtomicLong;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BankAccount {

    private static final AtomicLong accountconnter = new AtomicLong(10000);

    private final String accountnumber;
    private String accountholdername;
    private final String creationTimestamp;

    {
        long uniqueId = accountconnter.getAndIncrement();
        this.accountnumber = "ACC-" + String.format("%05d", uniqueId);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        this.creationTimestamp = LocalDateTime.now().format(formatter);

        System.out.println("creating account with number: " + accountnumber);
    }

    public BankAccount(String accountholdername) {
        System.out.println("setting the account holder name");
        this.accountholdername = accountholdername;
    }

    public String getAccountnumber() {
        return accountnumber;

    }

    public String getAccountholdername() {
        return accountholdername;
    }

    public String getCreationTimestamp() {
        return creationTimestamp;
    }

    public void displayAccountInfo() {
        System.out.println("_____Bank Account Info_____");
        System.out.println("Account Number: " + accountnumber);
        System.out.println("Account Holder Name: " + accountholdername);
        System.out.println("Creation Timestamp: " + creationTimestamp);
    }
}

