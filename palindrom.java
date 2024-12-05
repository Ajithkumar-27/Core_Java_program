public class palindrom{
    public void checkPalindrom(String str){
        String str1=str.toLowerCase();
        char[] ch = str1.toCharArray();
        String str2="";
        for(int i=ch.length-1;i>=0;i--){
            str2=str2+str1.charAt(i);
        }
        if(str1.equals(str2)){
            System.out.println("palindrom");
        }
        else{
            System.out.println("not a palindrom");
        }
    }
    public static void main (String args[]){
        palindrom palindrom = new palindrom();
        //palindrom.checkPalindrom("Mama");
        palindrom.checkPalindrom("Malayalam");
    }
}