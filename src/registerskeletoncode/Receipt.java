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
    private LineItem[] items;
    //private Formatter fmt;

    public Receipt(String id, DataStore db) {
        customer = findCustomerById(id);
        this.db = db;
        items = new LineItem[0];
    }
    public final Customer findCustomerById(String id){   
        return db.findCustomerById(id);
    }
    public final String endSale(){
        
        return null;
    }
//    public final Product findProductById(String id){
//        return db.findProductById(id);       
//    }
    public final void AddProductToSale(String s, int q){
        LineItem[] temp = new LineItem[items.length+1];
        System.arraycopy(items, 0, temp, 0, items.length);
        temp[temp.length-1] = new LineItem(db.findProductById(s),q);
        items = temp;
        temp = null;
    }
}
