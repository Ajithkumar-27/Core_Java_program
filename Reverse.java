class Reverse{
    public static void main(String aargs[]){
        String str1="Ajithkumar";
        int len=str1.length();
        String str="";
    for(int i=len-1;i>=0;i--){
           str=str+str1.charAt(i);
            }
            System.out.print(str);

        
    }
}