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
public class ArrayDemo {
    public static void main(String[] args) {
//        int[] numbers = new int[0];
//        int[] temp = new int[numbers.length + 1];
//        for(int i = 0; i < numbers.length; i++){
//            temp[i] = numbers[i];
//        
//        }
//        temp[temp.length-1] = 3;
//        
//        numbers = temp;
//        temp = null;

        int[] numbers = new int[0];
        int[] temp = new int[numbers.length + 1];
        System.arraycopy(numbers, 0, temp, 0, numbers.length);
        temp[temp.length-1] = 3;
        
        numbers = temp;
        temp = null;
    }
}
