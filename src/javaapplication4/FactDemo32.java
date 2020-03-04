//a)program to compute factorial using recursion
package javaapplication4;

/**
 *
 * @author dell
 */
class Factorial{
    int fact(int n){
        int result;
        if(n==1)
            return 1;
        result=n*fact(n-1);
        return result;
        
        
    }
}


public class FactDemo32 {
   public static void main(String[] args){
       Factorial f= new Factorial();
       System.out.println("factorial of 3 is:"+f.fact(3));
       System.out.println("factorial of 3 is:"+f.fact(5));
       System.out.println("manish,10,B");
       
   } 
}
