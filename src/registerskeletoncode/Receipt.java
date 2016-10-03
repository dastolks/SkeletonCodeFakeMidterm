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
public class Receipt {
    private Customer customer;
    private DataStore db;

    public Receipt(String id, DataStore db) {
        customer = findCustomerById(id);
        this.db = db;
    }
    public final Customer findCustomerById(String id){   
        return db.findCustomerById(id);
    }
}
