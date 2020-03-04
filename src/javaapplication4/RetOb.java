//31
package javaapplication4;

class MyClass{
    int a;
    MyClass(int i){
        a=i;
    }
    MyClass incrByTen(){
        MyClass m=new MyClass(a+10);
        return m;
    }
}

public class RetOb {
 public static void main(String[] args){
     MyClass ob1=new MyClass(40);
     MyClass ob2;
     ob2=ob1.incrByTen();
     System.out.println("ob1.a"+ob1.a);
     System.out.println("ob2.a"+ob2.a);
 }   
}


