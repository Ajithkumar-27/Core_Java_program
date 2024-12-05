class rotate{

    public static void RotateArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(i<=2){
                arr[i]=i+4;
            }
            if(i>=3){
                arr[i]=i-2;
            }
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
        RotateArray(arr);
        for(int a:arr){
            System.out.print(a+ " ");
        }
    }
}