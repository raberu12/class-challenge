/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classchallenge;

/**
 *
 * @author Matt
 */
public class BankAccount {

    private int accountNumber;
    private float accountBalance;
    private String customerName;
    private String email;
    private long phoneNumber;

    public BankAccount(int accountNumber, float accountBalance, String customerName, String email, int phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean withdraw(float money) {
        if (accountBalance - money < 0) {
            return false;
        } else {
            accountBalance -= money;
            return true;
        }
    }

    public boolean deposit(float money) {
        if (money <= 0) {
            return false;
        } else {
            accountBalance += money;
            return true;
        }
    }
    
    public void displayAccount(){
        System.out.println(this);
    }

    public boolean transfer(float money, BankAccount recepient) {
        if (this.getAccountBalance() > money || money > 0) {
            boolean withdrawFlag = this.withdraw(money);
            if (withdrawFlag) {
                boolean depositFlag = recepient.deposit(money);
                if (depositFlag) {
                    return true;
                } else {
                    this.deposit(money);
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n\nBank Account:");
        sb.append("\nAccount Number = ").append(accountNumber);
        sb.append("\nAccount Balance = $").append(accountBalance);
        sb.append("\nCustomer Name = ").append(customerName);
        sb.append("\nEmail = ").append(email);
        sb.append("\nPhone Number = ").append(phoneNumber);
        return sb.toString();
    }

}
