public class SBIAccountInfo {

    public static void main(String[] args) {
        // Create SBIAccount objects
        SBIAccount acc1 = new SBIAccount("KRK", "9156789123", 100000);
        SBIAccount acc2 = new SBIAccount("RK", "9876543210", 20000);

        // Print account details
        System.out.println(acc1);
        System.out.println(acc2);

        // account 1
        System.out.println("\nOperations on Account 1:");
        acc1.deposit(50000);
        acc1.checkBalance();
        acc1.withDraw(30000);
        acc1.checkBalance();
        acc1.withDraw(15000);

        // account 2
        System.out.println("\nOperations on Account 2:");
        acc2.deposit(10000);
        acc2.checkBalance();
        acc2.withDraw(5000);
        acc2.checkBalance();
    }
}