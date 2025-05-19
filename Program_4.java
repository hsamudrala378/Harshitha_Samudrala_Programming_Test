import java.util.*;
public class Program_4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Vector<Integer> arr=new Vector<>();
        while(true) {
            int n = sc.nextInt();
            arr.add(n);
            if(n==-1)
                break;
        }
        int[] res = new int[9];
        for(int i=0;i<9;i++){
            for(int j: arr){
                if(j%(i+1)==0)
                    res[i]++;
            }
        }
        for(int i=0;i<9;i++)
            System.out.print((i+1)+" : "+res[i]+" , ");
    }
}
