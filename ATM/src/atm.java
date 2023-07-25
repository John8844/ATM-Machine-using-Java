public class atm {
    private double balance;
    private int depositAmount;
    private int withdrawAmount;

    public double getBalance() {
        return balance;
    }

    public int getDepositAmount() {
        return depositAmount;
    }

    public int getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setDepositAmount(int depositAmount) {
        this.depositAmount = depositAmount;
    }

    public void setWithdrawAmount(int withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public static void menu(){
        System.out.println("press 1 for check balance");
        System.out.println("press 2 for deposit Amount");
        System.out.println("press 3 for Withdraw Amount");
        System.out.println("press 4 for View Statement");
        System.out.println("press 5 for Exit");
    }
}
