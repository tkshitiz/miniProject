
import java.util.Scanner;
class kshitiz_stack
{
    char arr[];
    int top = -1;
    public kshitiz_stack(String s)
    {
        arr = new char[s.length()];
    }
    public boolean isempty_kshitiz()
    {
        return top==-1?true:false;
    }
    public void push_kshitiz(char kshitiz)
    {
      
        arr[++top] = kshitiz;
      
    }
    public char pop_kshitiz()
    {
      
        return arr[top--];
    }
    public char peek_kshitiz()
    {
        return arr[top];
    }
}

class Prefix_conversion {

    public static int check_prec(char c)
    {
        if(c=='+'||c=='-')
            return 1;
        else if(c=='*'||c=='/'||c=='%'||c=='^')
            return 2;
        return 0;
          
    }
  
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the infix string");
        String k1 = sc.next();
        kshitiz_stack kshitiz1 = new kshitiz_stack(k1);
        String sb = "" ;
        char symbol;
      
        for(int i=k1.length()-1;i>=0;i--)
        {
            symbol = k1.charAt(i);
            if(Character.isLetter(symbol))
                sb = sb + symbol;
           else if(symbol==')')
           {
                kshitiz1.push_kshitiz(symbol);
           }
            else if(symbol=='(')
            {
                while(kshitiz1.peek_kshitiz()!=')')
                {
                    sb =   sb + kshitiz1.pop_kshitiz();
                }
                kshitiz1.pop_kshitiz();
              
            }
            else
            {
                if(!kshitiz1.isempty_kshitiz() && !(kshitiz1.peek_kshitiz()==')')
                        && check_prec(symbol)<=check_prec(kshitiz1.peek_kshitiz()))
                {
                  sb =  sb + kshitiz1.pop_kshitiz();
                }
                kshitiz1.push_kshitiz(symbol);
            }
        }
        while(!kshitiz1.isempty_kshitiz())
        {
            sb =  sb + kshitiz1.pop_kshitiz();
        }
        String k_thapa = "";
        for(int i=sb.length()-1;i>=0;i--)
        {
         k_thapa = k_thapa + sb.charAt(i);
      
        }
        System.out.print("prefix string is : " + k_thapa); 
        System.out.println("\nkshitiz thapa");
    }
  
}