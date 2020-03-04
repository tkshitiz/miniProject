 //27
package javaapplication4;

/**
 *
 * @author dell
 */
public class TestGarbage {
    protected void finalize(){
        System.out.println("object is garbage collected");
    }
    public static void main(String[] args){
        TestGarbage s1=new TestGarbage();
                TestGarbage s2=new TestGarbage();
                s1=null;
                s2=null;
                  System.gc();
                System.out.println("kshitiz,09,B");
                              

    }
            
}
