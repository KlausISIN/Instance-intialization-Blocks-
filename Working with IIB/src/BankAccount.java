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
}

