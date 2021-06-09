public class BankAccountTester {
    public static void main(String[] args){
        BankAccount customer1 = new BankAccount();
        BankAccount customer2 = new BankAccount();
        BankAccount customer3 = new BankAccount();
        BankAccount customer4 = new BankAccount();
        BankAccount customer5 = new BankAccount();

        customer1.setCheckingSavings(5721.00, 12355.50);
        customer2.setCheckingSavings(2112.00, 9873.65);
        customer3.setCheckingSavings(619.22, 113.37);
        customer4.setCheckingSavings(912.60, 14173.69);
        customer5.setCheckingSavings(652.50, 5473.22);
        customer1.getCheckingBal();
        customer2.getSavingsBal();
        customer4.withdrawFrom(255.00);
        customer1.withdrawFrom(1255.50);
        customer2.withdrawFrom(655.00);
        customer4.getAllBalances();
        System.out.println("Total Accounts with this bank: " + BankAccount.numOfAccts + "\n");
        System.out.println("Total customer assets in all accounts: $" + BankAccount.totalAcctsBal + "\n");
    }
}
