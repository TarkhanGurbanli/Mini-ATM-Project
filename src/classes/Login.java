package classes;

import java.util.Scanner;

public class Login {
    public boolean login(User user){
        Scanner sc = new Scanner(System.in);
        System.out.print("User name: ");
        String userName = sc.nextLine();
        System.out.print("Password: ");
        String password = sc.nextLine();

        if(user.getUserName().equals(userName) && user.getPassword().equals(password)){
            return true;
        }else {
            return false;
        }
    }
}
