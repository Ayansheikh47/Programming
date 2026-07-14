public class ReverseANumber {
    public static void main(String[] args) {
        int num=1234;
        int rev=0;
        while (num>0){
            int n=num%10;
            rev=n+rev*10;
            num=num/10;
        }
        System.out.println(rev);
    }
}
