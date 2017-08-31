package offer.num38;

/**
 * Created by byhieg on 17/6/21.
 * Mail to byhieg@gmail.com
 */
public class Solution {
    public int GetNumberOfK(int [] array , int k) {
        if(array == null || array.length == 0){
            return 0;
        }
        int start = 0;
        int end = array.length -1 ;
        int firstK = getFirstK(array,k,start,end);
        int lastK = getLastK(array,k,start,end);
        if(firstK > -1 && lastK > -1){
            return lastK - firstK + 1;
        }else{
            return 0;
        }
    }

    public int getFirstK(int [] array,int k,int start,int end){

        if(start > end){
            return -1;
        }
        int mid = (start + end) /2;
        if(array[mid] == k){
            if((mid > 0 && array[mid - 1] != k)|| mid == 0){
                return mid;
            }else{
                end = mid -1;
            }
        }else if(array[mid] > k){
            end = mid - 1;
        }else{
            start = mid + 1;
        }

        return getFirstK(array,k,start,end);
    }

    public int getLastK(int[] array,int k,int start,int end){


        if(start > end){
            return -1;
        }
        int mid = (start + end) / 2;
        if(array[mid] == k){
            if((mid < array.length - 1 && array[mid + 1] != k) || mid == array.length -1){
                return mid;
            }else{
                start = mid + 1;
            }
        }else if(array[mid] < k){
            start = mid + 1;
        }else{
            end = mid - 1;
        }

        return getLastK(array,k,start,end);
    }
}
