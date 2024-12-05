import java.util.*;
public class Check {
    static Scanner sc = new Scanner(System.in);
    static Dish [] food ;  
    public static void main(String args[]){
        System.out.print("Enter How many dishes :");
        int count=sc.nextInt();
        food=new Dish[count];
        for(int i=0;i<count;i++){
            System.out.print("Enter dish name:");
            food[i]=sc.next();
            food[i]=(int)Math.random()*300;
            System.out.print("Enter Quantity:");
            food[i]=sc.nextInt();
        }
    }
}
