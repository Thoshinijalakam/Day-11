import java.util.*;
interface printable{
}
class h implements printable{
    public void print(){
        System.out.println("Hello students");
        }
}
public class Marker{
    public static void main(String args[] ){
        h f=new h();
        f.print();
    }
}
/* Hello students */