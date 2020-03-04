//29
package javaapplication4;

class Demo{
    int a,b;
    Demo(int i,int j){
        a=i;
        b=j;
        
    }
    boolean equalTo(Demo obj)
    {
     if(this.a==obj.a&&this.b==obj.b)
         return true;
     else
         return false;
    }
}

public class PassObj {
    public static void main(String[] args){
        Demo ob1=new Demo(22,25);
          Demo ob2=new Demo(22,25);
            Demo ob3=new Demo(24,25);
            boolean test1,test2;
            test1=ob1.equalTo(ob2); 
            test2=ob1.equalTo(ob3);
            System.out.println("obj equal to ob2:"+test1);
             System.out.println("obj equal to ob3:"+test2);
              System.out.println("manish,10,B");
    }
}
