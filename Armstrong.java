
 public class Armstrong extends hello{   
    public static void main(String args[]){
        int value=152;
        int result=findTheArmstrongNumber(value);
        if(result == value){
            System.out.print(value+" is Armstrong number");
        }else{
            System.out.print(value+" is Not a Armstrong number");
        }
    }
 }
