import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/*
* VBGHGH更好
* */
public class demo1 {
    public demo1() {
        int a=2;
        a++;
        System.out.println(a+a);
    }



    public static void main(String[] args) {
       demo1 d = new demo1();
        ArrayList a = new ArrayList();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        System.out.println(a);
        System.out.println(d.b());

    }

    public void a(){
        System.out.println();
    }

    public String b(){
        try {
            FileInputStream f= new FileInputStream("hello");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("最后执行:");
        }
        return "";
    }
}
