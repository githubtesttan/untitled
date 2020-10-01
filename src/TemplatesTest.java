import com.test.TestDemo;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author tanyongjing
 * @date 2020/9/14 - 22:08
 **/
public class TemplatesTest {

    //prsf
    private static final int aa=12;
    private static final TestDemo ts = new TestDemo();
    private static final HELLO hl = new HELLO();
    //psf
    public static final int b=1;
    //psfi
    public static final int c=2;
    //psff
    public static final String s="";
    
    public static void main(String[] args) {
        int a=1;
        System.out.println("a = " + a);
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TemplatesTest.main");
        String b ="";
        System.out.println("b = " + b);
        int []  array = new int[]{1,2,3,4};
        for (int i = 0; i < array.length; i++) {
            System.out.println("i = " + array[i]);
        }
        //变形iter
        for (int i : array) {
            System.out.println("array = " + i);
        }
        //变形itar
        for (int i = 0; i < array.length; i++) {
            int i1 = array[i];
            System.out.println("i1 = " + i1);
        }
        //list.for
        ArrayList<String> list =new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("1");
        list.add("2");
        for (String s : list) {
            System.out.println("s = " + s);
        }
        for (int i = 0; i < list.size(); i++) {

        }
        //list.forr
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println("i = " + list.get(i));
        }
        //ifn
        if (list == null) {

        }
        //inn
        if (list != null) {

        }
        //变形xxx.null/xxx.nn
        if (list == null) {

        }
        if (list != null) {

        }


    }
}
