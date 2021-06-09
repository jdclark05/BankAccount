import java.util.Random;

public class BankAccount {
    private int acctNum;
    private double checkingBal;
    private double savingsBal;
    public static int numOfAccts = 0;
    public static double totalAcctsBal; 

    public BankAccount(){
        numOfAccts++;
        this.acctNum = randomNum();
    }

    public int randomNum(){
        Random r = new Random();
        int newNum = (r.nextInt(2147483647 - 1000000000));
        return newNum;
    }

    //getter account balance
    public void getCheckingBal(){
        System.out.println("Customer: " + this.acctNum + "\n" + "Checking balance $" + this.checkingBal + "\n");
    }
    //getter savings balance
    public void getSavingsBal(){
        System.out.println("Customer: " + this.acctNum + "\n" + "Savings balance: $" + this.savingsBal + "\n");
    }
    //setter deposit to savings or checking
    public void setCheckingSavings(double x, double y){
        this.checkingBal += x;
        this.savingsBal += y;
        totalAcctsBal += (x + y);
        System.out.println("Customer: " + this.acctNum + "\n" +  "Deposited $" + x + " into checking" + "\n" + "Deposited $" + y + " into savings." + "\n");
    }

    //setter withdraw from one - no overdrafts!
    public void withdrawFrom(double x){
        this.checkingBal -= x;
        totalAcctsBal -= x;
        System.out.println("Customer: " + this.acctNum + "\n" + "Withdrawal of $" + x + " from checking" + "\n" + "Remaining balance : $" + this.checkingBal + "\n");
    }
    //getter total in checking + savings balance
    public void getAllBalances(){
        double x = this.checkingBal += this.savingsBal;
        System.out.println("Customer: " + this.acctNum + ":" + "\n" + "Checking balance $" + this.checkingBal + "\n" + "Savings balance: " + this.savingsBal + "\n" + "Total Assets: $" + x + "\n");
    }

}