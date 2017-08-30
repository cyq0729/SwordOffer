package offer.num20;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaGrammar;

import java.util.ArrayList;

/**
 * Created by byhieg on 2017/8/12.
 * Mail to byhieg@gmail.com
 */
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        int rows = matrix.length;
        int columns = matrix[0].length;

        if (rows == 0 || columns == 0) {
            return new ArrayList<>();
        }
        int start = 0;

        while (columns > 2 * start && rows > 2 * start) {
            int endX = columns - 1 - start;
            int endY = rows - 1 - start;

            for (int i = start;i < endX;i++) {
                res.add(matrix[start][i]);
            }
            if (start < endY) {
                for (int i = start + 1;i <= endY;i++) {
                    res.add(matrix[i][endX]);
                }
            }

            if (start < endX && start < endY) {
                for (int i = endY - 1;i >= start;i--) {
                    res.add(matrix[endY][i]);
                }
            }

            if (start < endX && start < endY - 1) {
                for (int i = endY - 1; i >= start + 1; i --) {
                    res.add(matrix[i][start]);
                }
            }
            start++;
        }
        return res;
    }
}
