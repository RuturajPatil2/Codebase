the UnclaimedDepositScheduler class is a Spring component with a scheduled method fetchUnclaimedDepositAccounts() that runs quarterly based on the provided cron expression. It uses a RestTemplate to make API calls.

The BankApiService interface defines the common methods required by each bank's API service. You can implement this interface for each bank to handle the specific API endpoint and data mapping logic.

Inside the fetchUnclaimedDepositAccounts() method, it determines the current quarter's start and end dates based on the current date. It then iterates over each BankApiService and fetches the unclaimed
