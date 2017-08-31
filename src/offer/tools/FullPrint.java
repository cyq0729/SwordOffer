package offer.tools;

import java.util.Iterator;
import java.util.List;

/**
 * Created by shiqifeng on 2017/3/20.
 * Mail byhieg@gmail.com
 */
public class FullPrint {

    public static void printResult(Object o) {
       printResult(o,true);
    }

    public static void printResult(Object o,boolean isAdd) {
        if (o instanceof String ||
                o instanceof Integer ||
                o instanceof Double ||
                o instanceof Float ||
                o instanceof Boolean||
                o instanceof Byte ||
                o instanceof Long) {
            if (isAdd) {
                System.out.println("结果是 " + o);
            }else{
                System.out.println(o);
            }
        }else{
            System.out.println("该对象为 " + o.toString());
        }
    }

    public static void printArrays(int[][] arrays) {
        for (int i = 0 ; i < arrays.length;i++) {
            for (int j = 0 ; j < arrays[i].length;j++) {
                System.out.print(arrays[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printArrays(int[] arrays) {
        System.out.println("数组长度是 " + arrays.length);
        for (int i = 0 ; i < arrays.length;i++) {
            System.out.println("第 " + (i + 1) + " 项元素是 " + arrays[i]);
        }
    }
    public static void printList(List list) {
        Iterator it = list.iterator();
        int count = 1;
        while (it.hasNext()) {
            System.out.println("第 " + (count++) + " 项元素是 " + it.next());
        }
    }


}
