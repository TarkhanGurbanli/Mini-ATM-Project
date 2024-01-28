import classes.ATM;
import classes.User;

public class Main {
    public static void main(String[] args) {

        ATM atm = new ATM();
        User user = new User("Tarkhan", "1234", 2500.0);
        atm.work(user);
        System.out.println("Exiting the program...");

    }
}