import java.util.Arrays;

public class CheckAnagram {
    public static void main(String[] args) {
        String n1= "listen";
        String n2= "Silent";

        n1=n1.replace("//s","").toLowerCase();
        n2=n2.replace("//s","").toLowerCase();

        if (n1.length()!=n2.length()){
            System.out.println("Not Anagram");
        }

        char[] arr1=n1.toCharArray();
        char[] arr2=n2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1,arr2)){
            System.out.println("Strings are Anagrams");
        }else {
            System.out.println("Strings are not Anagrams");
        }


    }
}
