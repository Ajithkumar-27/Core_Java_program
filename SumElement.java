public class SumElement {
    public static int sumTheElementsInTheArray(int [] arr){
            int sum=0;
            for(int i=0; i<arr.length;i++){
                sum+=arr[i];
            }
            return sum;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int Result=sumTheElementsInTheArray(arr);
        System.err.println(Result);

    }
}
