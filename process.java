import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class UnclaimedDepositScheduler {

    // ...

    // Process the fetched unclaimed accounts
    private void processUnclaimedAccounts(String bankName, List<Account> unclaimedAccounts) {
        // Create a map to store age-wise unclaimed accounts
        Map<Integer, List<Account>> ageWiseUnclaimedAccounts = new HashMap<>();

        // Calculate the age of each unclaimed account and categorize them
        for (Account account : unclaimedAccounts) {
            LocalDate accountOpeningDate = account.getOpeningDate();
            LocalDate currentDate = LocalDate.now();
            int accountAge = Period.between(accountOpeningDate, currentDate).getYears();

            // Fetch accounts with an age greater than 1 year
            if (accountAge > 1) {
                List<Account> accountsByAge = ageWiseUnclaimedAccounts.getOrDefault(accountAge, new ArrayList<>());
                accountsByAge.add(account);
                ageWiseUnclaimedAccounts.put(accountAge, accountsByAge);
            }
        }

        // Perform further processing on age-wise unclaimed accounts
        for (Map.Entry<Integer, List<Account>> entry : ageWiseUnclaimedAccounts.entrySet()) {
            int accountAge = entry.getKey();
            List<Account> accountsByAge = entry.getValue();

            // Perform any required processing on accounts with a specific age
            // Example: Save the accounts to a database, generate reports, etc.
        }
    }

    // ...
}

=====================================================================================================================
    
    
    
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class UnclaimedDepositScheduler {

    // ...

    // Process the fetched unclaimed accounts
    private void processUnclaimedAccounts(String bankName, List<Account> unclaimedAccounts, int minimumAgeInYears) {
        // Create a map to store age-wise unclaimed accounts
        Map<Integer, List<Account>> ageWiseUnclaimedAccounts = new HashMap<>();

        // Calculate the age of each unclaimed account and categorize them
        for (Account account : unclaimedAccounts) {
            LocalDate accountOpeningDate = account.getOpeningDate();
            LocalDate currentDate = LocalDate.now();
            int accountAge = Period.between(accountOpeningDate, currentDate).getYears();

            // Fetch accounts with an age greater than the specified minimum age
            if (accountAge > minimumAgeInYears) {
                List<Account> accountsByAge = ageWiseUnclaimedAccounts.getOrDefault(accountAge, new ArrayList<>());
                accountsByAge.add(account);
                ageWiseUnclaimedAccounts.put(accountAge, accountsByAge);
            }
        }

        // Perform further processing on age-wise unclaimed accounts
        for (Map.Entry<Integer, List<Account>> entry : ageWiseUnclaimedAccounts.entrySet()) {
            int accountAge = entry.getKey();
            List<Account> accountsByAge = entry.getValue();

            // Perform any required processing on accounts with a specific age
            // Example: Save the accounts to a database, generate reports, etc.
        }
    }

    // ...
}

