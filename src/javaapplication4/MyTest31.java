//a)primitive types are passed by value
package javaapplication4;

/**
 *
 * @author dell
 */
public class MyTest31 {
    
  void mymethod(int i,int j)
  {
      i=i*2;
      j=j/2;
  }
}
   class callbyvalue{
      public static void main(String[] args){
          MyTest31 ob=new MyTest31();
          int a=30,b=40;
          System.out.println("a and b before call:"+a+" "+b);
          ob.mymethod(a,b);
          System.out.println("a and b after call:"+a+" "+b);
          System.out.println("manish,10,B");
      }
  }

