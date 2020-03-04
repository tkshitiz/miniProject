/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;
public class kshitiz_stack {
    char arr[];
 int top =-1;

 public kshitiz_stack(String kshitiz1)
 {
     arr = new char[kshitiz1.length()];
 }

public void push_kshitiz(char kshitiz2)
{
    arr[++top] = kshitiz2;
}

public char pop_kshitiz()
{
    return arr[top--];
}

public boolean isempty_kshitiz()
{
    return (top==-1)?true:false;
}

public char peek_kshitiz()
{
    return arr[top];
}
}

 class Postfix_conversion {

  
    public static int check_kshitiz(char kshitiz3)
    {
        if(kshitiz3=='+'|| kshitiz3=='-')
            return 1;
        else if(kshitiz3=='*'||kshitiz3=='/'||kshitiz3=='%')
            return 2;
        return 0;
    }

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the infix string");
        String kshitiz4 = sc.next();
        StringBuilder sb = new StringBuilder();
         kshitiz_stack  st = new  kshitiz_stack (kshitiz4);
        char k_symbol;
        for(int i=0;i<kshitiz4.length();i++)
        {
            k_symbol = kshitiz4.charAt(i);
          
            if(Character.isLetter(k_symbol))
            sb.append( k_symbol);
            else if(k_symbol=='(')
             st.push_kshitiz(k_symbol);
            else if( k_symbol==')')
            {
                while(st.peek_kshitiz()!='(')
                {
                    sb.append(st.pop_kshitiz());
                }
            st.pop_kshitiz(); 
            }
            else
            {
                while(!st.isempty_kshitiz() && !(st.peek_kshitiz()=='(') 
                        && check_kshitiz(k_symbol) <= check_kshitiz(st.peek_kshitiz()))
                {
                    sb.append(st.pop_kshitiz());
                }
              
                st.push_kshitiz(k_symbol);
            }
        }
        while(!st.isempty_kshitiz())
        {
            sb.append(st.pop_kshitiz());
        }
      
        System.out.println("Postfix String is :-> " + sb.toString());
        System.out.println("kshitiz thapa");
    }
}
