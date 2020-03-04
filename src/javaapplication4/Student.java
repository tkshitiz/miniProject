
package javaapplication4;

public class Student{
  int id;
String name;
int age;
Student(int i,String n){
    id=i;
    name=n;
    
}
Student(int i,String n,int a){
    id=i;
    name=n;
    age=a;

}
void display(){
    System.out.println(id+""+name+""+age);
    
}
public static void main(String[] args){
    Student s1=new Student(111,"kamal");
     Student s2=new Student(222,"kshitiz",22);
     s1.display();
        s2.display();
     
    System.out.println("manish,10,B"); 
}
}
