/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registerskeletoncode;

/**
 *
 * @author aschindler1
 */
public class StartUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DataStore db = new FakeDatabase();
        Register register = new Register();
        register.startNewSale("C200", db);
        register.addProductToSale("101", 2);
        register.addProductToSale("205", 1);
        register.endSale();
    }
    
}
