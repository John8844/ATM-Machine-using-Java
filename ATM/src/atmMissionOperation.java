import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class atmMissionOperation implements atmMissionInterface{
    atm atm=new atm();
    Scanner in=new Scanner(System.in);
    Map<Double,String> ministmt=new HashMap<>();
    @Override
    public void balance() {
        System.out.println("Your Balance is "+atm.getBalance());
    }

    @Override
    public void deposit() {
        System.out.println("Enter your amount to deposit :");
        double depositAmount=in.nextDouble();
        ministmt.put(depositAmount," Credited");
        System.out.println(depositAmount+" credited successfully...");
        atm.setBalance(atm.getBalance()+depositAmount);
        balance();
    }

    @Override
    public void withdraw() {
        System.out.println("Enter amount to withdraw :");
        double withdrawAmount=in.nextDouble();
        if(atm.getBalance()>=withdrawAmount){
            ministmt.put(withdrawAmount," Withdrawn");
            System.out.println(withdrawAmount+" debited Successfully...");
            atm.setBalance(atm.getBalance()-withdrawAmount);
            balance();
        }
        else {
            System.out.println("Insufficient Balance...");
        }
    }

    @Override
    public void miniStmt() {
        for (Map.Entry<Double,String> m:ministmt.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
        }
        balance();
    }
}
