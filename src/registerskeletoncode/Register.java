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
public class Register {
    private Receipt receipt;
    
    public Register() {
        
    }

    public final void startNewSale(String id, DataStore db){
        receipt = new Receipt(id, db);
    }

    public final void AddProductToSale(String s, int i) {
        receipt.AddProductToSale(s, i);
    }

    public final void endSale() {
 
    }
    

}
