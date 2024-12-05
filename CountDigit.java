public class CountDigit{
    public static long countDigitOfTheGivenNumber(long number){
        int count = 0;
        while(number != 0){
            number=number/10;
            count++;
        }
        return count;
    }
    public static void main(String args[]){
        long result = countDigitOfTheGivenNumber(987659873456L);
        System.out.print(result);
    }
}