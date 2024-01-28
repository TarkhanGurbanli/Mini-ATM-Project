package classes;

public class User {
    private String userName;
    private String password;
    private double balance;

    //Constractor Start
    public User(String userName, String password, double balance){
        this.userName = userName;
        this.password = password;
        this.balance = balance;
    }
    //Constractor Start

    //Methods Start
    public void depositMoney(double amount){
      this.balance += amount;
        System.out.println("New Balance: " + this.balance);
    }

    public void withdrawMoney(double amount){
        if(this.balance - amount < 0){
            System.out.println("You don't have enough funds");
        }else{
            this.balance -= amount;
            System.out.println("Balance: " + this.balance);
        }
    }
    //Methods End

    //Getter and Setter Start
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    //Getter and Setter End
}
