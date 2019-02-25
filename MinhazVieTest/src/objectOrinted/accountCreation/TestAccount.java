/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectOrinted.accountCreation;

/**
 *
 * @author User
 */
public class TestAccount {

    public static void main(String[] args) {
        Account user1 = AccountFactory.createInstance("SAVINGACCOUNT");
        user1.deposit();
        user1.withdraw();
        user1.showStatemet();
        user1.balance();
    }

}
