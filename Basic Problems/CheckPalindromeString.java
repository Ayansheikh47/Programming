public class CheckPalindromeString {
    public static void main(String[] args) {
        String name="madam";
        String reverse="";

        for (int i=name.length()-1; i>=0; i--){
            reverse +=name.charAt(i);
        }
        if (reverse.equalsIgnoreCase(name)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
