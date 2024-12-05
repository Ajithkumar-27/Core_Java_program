public class uniq
{
    public static void uniqueElements(String arr){
    String arr1 = arr.toLowerCase();
        for(int i=0; i<arr.length();i++){
            boolean isUnique = true;
          for(int j=0; j<arr.length();j++)  {
            if (arr1.charAt(i) == arr1.charAt(j) && i != j)
            {
               isUnique=false;
            }
          }
          if(isUnique)
          {
            System.out.print(arr1.charAt(i));
          }
        }
    }
    public static void main(String [] args){
        uniqueElements("Ajithkumar");
    }
}