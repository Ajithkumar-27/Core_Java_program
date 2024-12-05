public class RemovedDuplicate{
    public static void removeDuplicatesInTheString(String str){
        String str1=str.toLowerCase();
        char[] ch=str1.toCharArray();
        int len = ch.length;
        for(int i=0; i<len;i++){
            for(int j=i+1;j<len;j++){
                if (ch[i] == ch[j]) {
                    for (int k = j; k < len - 1; k++) {
                        ch[k] = ch[k + 1];
                    } 
                    for (int l = i; l < len - 1; l++) {
                        ch[l] = ch[l + 1];
                    }
                    len--; 
                    j--;  
                }
            }
        }
           for (int m = 0; m < len; m++){
            System.out.print(ch[m]+" ");
    }

    }
    public static void main(String args []){
        removeDuplicatesInTheString("saravann");

    }
}