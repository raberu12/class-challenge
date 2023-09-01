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
        bank_account A = new bank_account(1234, 100.0f, "Carlo", "carlo@yahoo.com", 911);
        System.out.println(A);
        A.withdraw(50);
        A.deposit(3000);
        A.withdraw(4000);
        System.out.println(A);
    }
}