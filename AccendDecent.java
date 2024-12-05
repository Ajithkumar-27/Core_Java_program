public class AccendDecent{
    public void AccendAndDecendTheArray(int[] arr){
        int temp;
      for(int i=0;i<arr.length-1;i++){
        for (int j = 0; j < arr.length - i - 1; j++) {
            if(arr[j]<arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }  
        }   
        }
        System.out.println("Descending Order");
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();

        System.out.println("Ascending Order");

        for(int i=arr.length-1;i>=0;i--){
          System.out.print(arr[i]+" ");
        }
         System.out.println();

    }
    public static void main (String args []){
        AccendDecent AccendDecent = new AccendDecent();
        int[] arr ={2,9,4,5,1,8,3};
        AccendDecent.AccendAndDecendTheArray(arr);
    }
}