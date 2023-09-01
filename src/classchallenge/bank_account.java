/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classchallenge;

/**
 *
 * @author Matt
 */
public class bank_account {

    private int account_number;
    private float account_balance;
    private String customer_name;
    private String email;
    private long phone_number;

    public bank_account(int account_number, float account_balance, String customer_name, String email, int phone_number) {
        this.account_number = account_number;
        this.account_balance = account_balance;
        this.customer_name = customer_name;
        this.email = email;
        this.phone_number = phone_number;
    }

    public long getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public int getAccount_number() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public float getAccount_balance() {
        return account_balance;
    }

    public void setAccount_balance(float account_balance) {
        this.account_balance = account_balance;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean withdraw(float money) {
        if (account_balance - money < 0) {
            return false;
        } else {
            account_balance -= money;
            return true;
        }
    }

    public boolean deposit(float money) {
        if(money <= 0){
            return false;
        }else{
            account_balance += money;
            return true;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n\nBank Account:");
        sb.append("\nAccount Number = ").append(account_number);
        sb.append("\nAccount Balance = $").append(account_balance);
        sb.append("\nCustomer Name = ").append(customer_name);
        sb.append("\nEmail = ").append(email);
        sb.append("\nPhone Number = ").append(phone_number);
        return sb.toString();
    }

}
