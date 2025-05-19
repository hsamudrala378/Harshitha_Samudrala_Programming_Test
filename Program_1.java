
import java.util.*;
public class Program_1{
    static class Calculator{
        Scanner sc=new Scanner(System.in);
        
        int a,b;
        char op;
        void getinput(){
            a=sc.nextInt();
            b=sc.nextInt();
            op=sc.next().charAt(0);
        }
        
        void calculate(){
            switch(op){
                case '+':   System.out.println("Addition of a and b is: "+ (a+b));
                            break;
                case '-':   System.out.println("Subtraction of a and b is: "+ Math.abs(a-b));
                            break;
                case '*':   System.out.println("Multiply of a and b is: "+ (a*b));
                            break;
                case '/':   if(b!=0)
                            System.out.println("Division of a and b is: "+ (a/b));
                            else
                            System.out.println("Can't divie by 0");
                            break;
                default: System.out.println("Can't Calculate");
            }
        }
    }
    
  public static void main(String args[]) {
    Calculator cal= new Calculator();
    cal.getinput();
    cal.calculate();


  }
}