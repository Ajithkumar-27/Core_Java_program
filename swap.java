public class swap{
    public void swaptwonumbers(int a,int b){
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a=a+b;
        b=a-b;
        a=a-b;
     System.out.println("After swapping: a = " + a + ", b = " + b);

    }
    public static void main(String args[]){
        swap swap= new swap();
        swap.swaptwonumbers(10,20);
       
    }
}