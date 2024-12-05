
public class CheckVersion {
    public static void toCheckTheVersion(String str, String str1) {
        String[] arr = str.split("\\.");
        String[] arr1 = str1.split("\\.");
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            int version1 = Integer.parseInt(arr[i]);
            int version2 = Integer.parseInt(arr1[i]);

            if (version1 < version2) {
                System.out.println("UPGRADED");
                return;
            } else if (version1 > version2) {
                System.out.println("DOWNGRADED");
                return;
            }
            else{
                continue;
            }
        }
    }
    public static void main(String[] args) {
        String str = "1.2.3";
        String str1 = "1.2.4";
        toCheckTheVersion(str, str1);
    }
}
