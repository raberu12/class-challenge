/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package classchallenge;

/**
 *
 * @author Matt
 */
public class ClassChallenge {

    public static void main(String[] args) {
        bankAccount A = new bankAccount(1234, 1000.0f, "Carlo", "carlo@yahoo.com", 911);
        bankAccount B = new bankAccount(1235, 5000.0f, "Jarlo", "Jarlo@yahoo.com", 912);
        A.displayAccount();
        if (A.withdraw(700)) {
            System.out.println("\nYour new balance is: $" + A.getAccountBalance());
        } else {
            System.out.println("\nUnable to withdraw due to missing funds");
        }
        if (A.deposit(900)) {
            System.out.println("\nYour new balance is: $" + A.getAccountBalance());
        } else {
            System.out.println("\nUnable to deposit due to invalid funds");
        }
        if (A.withdraw(10000)) {
            System.out.println("\nYour new balance is: $" + A.getAccountBalance());
        } else {
            System.out.println("\nUnable to withdraw due to missing funds");
        }
        if (A.deposit(0)) {
            System.out.println("\nYour new balance is: $" + A.getAccountBalance());
        } else {
            System.out.println("\nUnable to deposit due to invalid funds");
        }
        A.transfer(500, B);
        A.displayAccount();
        System.out.println("");
        B.displayAccount();
    }
}
