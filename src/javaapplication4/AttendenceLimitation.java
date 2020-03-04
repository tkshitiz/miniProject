//Student will not allowed to sit in exam if his/her attendence is less than
//75%. take following from user.
////a) number 0f class held.
//b) number of classes attended
//print% of classes attendence is student allowed to sit in exam or not.


package javaapplication4;

   import java.util.Scanner;
public class AttendenceLimitation {
  

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("No of classes held:");
int held=sc.nextInt();
System.out.println("no of classes attended:");


int att=sc.nextInt();
float p = (att*100)/held;
if(p<75)
System.out.println("the students are not  allowed to sit in exam.");
else
System.out.println("they are allowed to appear the examination.");
System.out.println("kshitiz,09,B");

}
}
 

