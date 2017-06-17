package offer.tools;

/**
 * Created by shiqifeng on 2017/3/20.
 * Mail byhieg@gmail.com
 */
public class Convert {

    public static void decToBin(int n) {
        String result = Integer.toBinaryString(n);
        FullPrint.printResult("十进制的 " + n + " 转换为二进制后 " + result,false);
    }

    public static void binTodec(String n) {
        String result = Integer.valueOf(n,2).toString();
        FullPrint.printResult("二进制的 " + n + " 转换为十进制后 " + result,false);
    }
}
