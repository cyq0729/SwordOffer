package offer.num11;

/**
 * Created by byhieg on 2017/8/10.
 * Mail to byhieg@gmail.com
 */
public class Solution {

    public double Power(double base, int exponent) {
        double res = 1;
        boolean flag = false;
        if (exponent < 0) {
            exponent = 0 - exponent;
            flag = true;
        }
        while (exponent != 0) {
            if ((exponent & 1) == 1) {
                res = res * base;
            }
            base = base * base;
            exponent = exponent >>> 1;
        }

        if (flag) {
            return  1 / res;
        }else{
            return  res;
        }

    }
}
