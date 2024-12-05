public class FindLarge {
    public static void findLargeAndSecondLargeElement(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }
         int firstLarge=arr[0];
            int secondLarge =arr[0];
        for (int i = 0; i < arr.length; i++) {
           
            if (arr[i] > firstLarge) {
                secondLarge = firstLarge;
                firstLarge = arr[i];
            } 
            else if (arr[i] > secondLarge && arr[i] != firstLarge) {
                secondLarge = arr[i];
            }
        }

        System.out.println("The First Large Element is: " + firstLarge);
        System.out.println("The Second Large Element is: " + secondLarge);
    }

    public static void main(String[] args) {
        int[] arr = {12, 34, 21, 11, 54, 90};
        findLargeAndSecondLargeElement(arr);
    }
}
