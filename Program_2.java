import java.util.*;
public class OddNumbers {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),i=1;
        while(n>0){
            if(i%2!=0){
                System.out.print(i + " ");
                n--;
            }
            i++;
        }
    }
}
