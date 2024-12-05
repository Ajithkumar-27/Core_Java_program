class vowel{
    public void checkVowel(String str){
        char []ch = str.toCharArray();
        for(int i=0;i<str.length();i++){
             if (ch[i] == 'a' || ch[i] == 'A' || ch[i] == 'e' || ch[i] == 'E' || ch[i] == 'i' || ch[i] == 'I' || ch[i] == 'o' || ch[i] == 'O' || ch[i] == 'u' || ch[i] == 'U') {
                     System.out.print(ch[i]);
            }
        }

    }
    public static void main(String args []){
        vowel vowel = new vowel();
        vowel.checkVowel("Ajithkumar");

    }
}