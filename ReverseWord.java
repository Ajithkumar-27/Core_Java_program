public class ReverseWord{
    public static void reverseTheWordInTheString(String str){
        String[] str1 = str.split(" ");
        StringBuilder result = new StringBuilder();
        for(String word : str1){
            char[] ch = word.toCharArray();
            for(int i=ch.length-1; i>=0;i--){
                result.append(ch[i]);
            }
            result.append(" ");
        }
         String finalResult = result.toString();
        System.out.println(finalResult);
    }
    public static void main(String args[]){
        reverseTheWordInTheString("Im know malayalam amma appa language");
    }
}