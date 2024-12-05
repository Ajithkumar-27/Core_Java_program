import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDupArray{
    public static int[] removeDupInArray(int[] arr){
        Set<Integer> set = new HashSet<>();
        for(int n:arr){
            set.add(n);
        }
        int[] result = new int[set.size()];
        int i = 0;
        for (int n : set) {
            result[i++] = n;
        }
        return result;
    }
    public static void main(String args[]){
        int[] arr ={2,1,4,3,2,1,6,7,5,9};
        int[] arr1 = removeDupInArray(arr);
        System.out.println("Array without duplicate " + Arrays.toString(arr1));
    }
}