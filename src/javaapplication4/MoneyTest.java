//lab30
package javaapplication4;

class Money{
    int rupee;
    int paisa;
    void setMoney(int r, int p){
    rupee=r;
    paisa=p;
    
}
    void displayMoney(){
        System.out.println("rupee="+rupee);
        System.out.println("paisa="+paisa);
    }
    void addmoney(Money m1,Money m2){
        paisa=m1.paisa+m2.paisa;
    rupee=paisa/100;
    paisa=paisa%100;
    rupee=rupee+m1.rupee+m2.rupee;
}
}


public class MoneyTest {
   public static void main(String[] args){
       Money bag1=new Money();
        Money bag2=new Money();
         Money bag3=new Money();
         bag1.setMoney(5,75);
         bag2.setMoney(7,30);
         bag3.addmoney(bag1,bag2);
         System.out.println("money in bag1 is=");
         bag1.displayMoney();
         System.out.println("money in bag 2=");
         bag2.displayMoney();
         System.out.println("money in bag3=");
         bag3.displayMoney();
       System.out.println("manish,10,B");   
   } 
}
