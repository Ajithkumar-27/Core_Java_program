public class RemovePalindrom{
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
         String[] str2 = finalResult.split(" ");
         int i = 0;
        while (i < str1.length) {
            if (str1[i].equals(str2[i])) {
                i++;
                continue;
            } else {
                System.out.print(str1[i] + " ");
            }
            i++;
        }
    }
    public static void main(String args[]){
        reverseTheWordInTheString("Im know malayalam amma appa language");
    }
}