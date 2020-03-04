/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author dell
 */
public class fibonacii {
        int fibo_Kshitiz(int n_Kshitiz){
        int result;
        if(n_Kshitiz==1){
            return 0;	 }
        else if(n_Kshitiz==2){
            return 1;	 }
        else{
        result=fibo_Kshitiz(n_Kshitiz-1)+fibo_Kshitiz(n_Kshitiz-2);
        return result;
        }   }  }
class FibonacciDemo{
    public static void main(String args[]){
      fibonacii f_Kshitiz=new  fibonacii();
        System.out.println("Fibonacci series for 5 elements: ");
        for(int i=1;i<=5;i++){
            System.out.println(f_Kshitiz.fibo_Kshitiz(i));
        }
        System.out.println("Kshitiz,B,08");
    }

}
