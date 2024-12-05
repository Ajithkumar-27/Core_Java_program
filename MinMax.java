public class MinMax{
    public void MinMaxTheArray(int[] arr){
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
            
        }
        System.out.println("Maximum of an Array is : "+max);
         System.out.println("Minimum of an Array is : "+min);
    }
    public static void main(String args[]){
        MinMax MinMax = new MinMax();
        int[] arr ={-2,9,4,5,1,8,3};
        MinMax.MinMaxTheArray(arr);
    }
}