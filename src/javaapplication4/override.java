/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;


   class Aa{
    int i,j;
    Aa(int a,int b){
        i=a;
        j=b;
    }
    void show(){
        System.out.println("i and j:"+i+" "+j);
    }
}
 class Bb extends Aa{
int k;
Bb(int a,int b,int c){
    super(a,b);
    k=c;
}
void show(){
        System.out.println("k:"+k);
}

}
  public class override{
   public static void main(String[] args){
      Bb subob=new Bb(1,2,3);
       subob.show();
   } 
}
