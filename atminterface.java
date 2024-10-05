import java.util.*;
public class atminterface {
    public static float balance;
    public static float withdraw;

    public static float deposit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please deposit balance in your account: ");
        balance = sc.nextFloat();
        System.out.println("Amount of rupees " + balance + " /- is credited to your account.");
        return balance;
    }
    public static float balance(){
        return balance;
    }
    public static void withdraw(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to withdraw: ");
        withdraw = sc.nextFloat();

        if(withdraw < balance){
            System.out.println("Amount of rupees " + balance + " /- is debited from your account.");
            balance = balance - withdraw;
        }
        else if(withdraw > balance)
            System.out.println("Insufficient Balance!");

    }
    public static void main(String[] args) {
        deposit();
        System.out.println(balance);
        withdraw();
        System.out.println(balance);

    }
}
