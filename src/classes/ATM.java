package classes;

import java.util.Scanner;

public class ATM {
    public void work(User user){
        Login login = new Login();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to our bank");
        System.out.println("**************************************");
        System.out.println("User login");
        System.out.println("**************************************");
        int rightOfEntry = 3;

        while (true){
            if(login.login(user)){
                System.out.println("Login successful");
                break;
            }else{
                System.out.println("Login Failed");
                rightOfEntry -= 1;
                System.out.println("Remaining right of entry: " + rightOfEntry);
            }
            if(rightOfEntry == 0){
                System.out.println("Your access rights have expired");
                return;
            }
        }

        System.out.println("**************************************");
        String process = "1. View Balance\n" +
                "2. Deposit Money\n" +
                "3. Withdraw Money\n" +
                "4. Press q to exit";
        System.out.println("**************************************");

        while (true){
            System.out.println("Seelct Transaction: ");
            String proses = sc.nextLine();
            if(proses.equals("exit")){
                break;
            } else if (proses.equals("1")) {
                System.out.println("Balance: " + user.getBalance());
            }else if(proses.equals("2")){
                System.out.print("The amount you want to deposit: ");
                int amount = sc.nextInt();
                sc.nextLine();
                user.depositMoney(amount);
            } else if (proses.equals("3")) {
                System.out.print("The amount you want to withdraw: ");
                int amount = sc.nextInt();
                sc.nextLine();
                user.withdrawMoney(amount);
            }else{
                System.out.println("Invalid transaction!!");
            }
        }

    }
}
