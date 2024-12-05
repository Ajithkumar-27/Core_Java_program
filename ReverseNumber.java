public class ReverseNumber{
    public static int reverseTheGivenNumber(int number){
        int reverse = 0;
        while(number != 0)
		{
            int reminder = number%10;
            reverse = reverse*10+reminder;
            number=number/10;
        }
        return reverse;
    }
    public static void main(String args[]){
        int Result = reverseTheGivenNumber(12345);
        System.out.print(Result);
    }
}