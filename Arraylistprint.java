import java.util.*;
 public class Arraylistprint {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>a=new ArrayList<>();
        for(int i=0;i<n;i++){
            int s=sc.nextInt();
            a.add(s);
        }
        for(int i=0;i<a.size();i++)
        System.out.print(a.get(i)+" ");
    }
}
//11 2 3 453 898 
