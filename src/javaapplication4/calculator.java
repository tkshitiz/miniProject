// 24 this holds the caller reference variable is used to solve the problem of hidden instance
//variables
package javaapplication4; 

/**
 *
 * @author dell
 */
public class calculator {

    float num1;//instance variable
    float num2;
    calculator(float num1,float num2){//constructor((local variable)
       this.num1=num1;
        this.num2=num2;
    
    
    }
    float sum()//method
    {
        float s;
        s=num1+num2;
        return s;
        
    }
    void display()
    {
      System.out.println("value of c1="+num1);  
      System.out.println("value of c2="+num2);
    }
    public static void main(String[] args){
        calculator c1=new calculator(7.5f,3.5f);
        calculator c2=new calculator(3.5f,4.5f);
        System.out.println("sum is="+c1.sum());
         System.out.println("sum is="+c2.sum());
         c1.display();
         c2.display();
         
       System.out.println("kshitiz,09,B"); 
    }
}
