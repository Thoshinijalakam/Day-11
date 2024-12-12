
import java.util.*;
interface out{
    void outm();
    interface in{
        void innm();}
    }
    class Nested implements out.in{
        public void innm(){
            System.out.println("hello i'm inner method");
        }
        public static void main(String args[]){
            Nested h=new Nested();
            h.innm();        
        }        
}
/* hello i'm inner method */