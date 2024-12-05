import java.util.Scanner;

class countNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.print("Enter the digit to find: ");
        int find = sc.nextInt();
        int digits;
        int count = 0;
        if(num==0 && find==0)
        count++;
        if(num<0)
        num=-num;

        while (num != 0) {
            digits= num % 10;
            if(digits==find){
                count++;
            }
            num = num / 10;
        }
        System.out.println("Count of the occurrence is " + count);
    }
}
